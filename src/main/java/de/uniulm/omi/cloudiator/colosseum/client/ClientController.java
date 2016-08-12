/*
 * Copyright (c) 2015 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.uniulm.omi.cloudiator.colosseum.client;

import com.github.rholder.retry.*;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Entity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static com.google.common.base.Preconditions.*;

/**
 * Created by daniel on 21.01.15.
 */
public class ClientController<T extends Entity> {

    private final Class<T> type;
    private final Client client;
    private final String baseUrl;

    ClientController(Client client, String baseUrl, Class<T> clazz) {
        checkNotNull(client);
        checkNotNull(baseUrl);
        checkArgument(!baseUrl.isEmpty());
        checkNotNull(clazz);
        checkState(clazz.isAnnotationPresent(Path.class));
        this.type = clazz;

        this.baseUrl = baseUrl;
        this.client = client;
    }

    protected Invocation.Builder getRequest(String entityLink) {
        return this.client.target(entityLink).request(MediaType.APPLICATION_JSON);
    }

    @Nullable public T get(long id) {
        try {
            return this.getRequest(
                this.baseUrl + "/" + this.type.getAnnotation(Path.class).value() + "/" + id)
                .get(this.type);
        } catch (NotFoundException e) {
            return null;
        }
    }

    public List<T> getList() {
        ParameterizedType parameterizedGenericType = new ParameterizedType() {
            public Type[] getActualTypeArguments() {
                return new Type[] {type};
            }

            public Type getRawType() {
                return List.class;
            }

            public Type getOwnerType() {
                return List.class;
            }
        };
        return this.getRequest(this.baseUrl + "/" + this.type.getAnnotation(Path.class).value())
            .get(new GenericType<List<T>>(parameterizedGenericType) {
            });
    }


    public List<T> getList(Predicate<? super T> filter) {
        return Lists.newArrayList(Iterables.filter(getList(), filter));
    }

    public Optional<T> getSingle(Predicate<? super T> filter) {
        List<T> collect = getList(filter);
        if (collect.size() > 1) {
            throw new NonUniqueResultException("Found multiple results for filter.");
        }
        return Optional.fromNullable(Iterables.getFirst(collect, null));
    }

    public Optional<T> waitAndGetSingle(final Predicate<? super T> filter, long timeout,
        TimeUnit timeUnit) {
        Retryer<T> retryer = RetryerBuilder.<T>newBuilder().retryIfResult(new Predicate<T>() {
            @Override public boolean apply(@Nullable T input) {
                return input == null;
            }
        }).withStopStrategy(StopStrategies.stopAfterDelay(timeout, timeUnit))
            .withWaitStrategy(WaitStrategies.fixedWait(10, TimeUnit.SECONDS)).build();
        try {
            return Optional.fromNullable(retryer.call(new Callable<T>() {
                @Override public T call() throws Exception {
                    return getSingle(filter).orNull();
                }
            }));
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (RetryException e) {
            return Optional.absent();
        }
    }

    public boolean exists(Predicate<? super T> filter) {
        return Iterables.any(getList(), filter);
    }

    public T updateOrCreate(T t) {
        boolean exists = Iterables.any(getList(), t.exists());
        if (exists) {
            T existing = getSingle(t.exists()).get();
            t.setLink(existing.getLink());
            return update(t);
        }
        return create(t);
    }

    public T create(T t) {
        return this.getRequest(this.baseUrl + "/" + this.type.getAnnotation(Path.class).value())
            .post(javax.ws.rs.client.Entity.entity(t, MediaType.APPLICATION_JSON_TYPE))
            .readEntity(type);
    }

    public T update(T t) {
        return this.getRequest(t.getSelfLink())
            .put(javax.ws.rs.client.Entity.entity(t, MediaType.APPLICATION_JSON_TYPE))
            .readEntity(type);
    }

    public void delete(T t) {
        this.getRequest(t.getSelfLink()).delete();
    }


}
