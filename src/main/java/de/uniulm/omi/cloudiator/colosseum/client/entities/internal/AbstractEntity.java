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

package de.uniulm.omi.cloudiator.colosseum.client.entities.internal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Predicate;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by daniel on 21.01.15.
 */
public abstract class AbstractEntity implements Entity {

    @JsonIgnore @Nullable private List<Link> link;

    @JsonIgnore @Override public List<Link> getLink() {
        return link;
    }

    @JsonProperty @Override public void setLink(@Nullable List<Link> link) {
        this.link = link;
    }

    public AbstractEntity(@Nullable List<Link> link) {
        this.link = link;
    }

    public AbstractEntity() {

    }

    @Nullable @Override public String getSelfLink() {
        if (this.link == null) {
            return null;
        }
        for (Link link : this.link) {
            if (link.getRel().equals("self")) {
                return link.getHref();
            }
        }
        throw new IllegalStateException("self link not present in entity");
    }

    @Override public Long getId() {
        String selfLink = this.getSelfLink();
        if (selfLink == null) {
            return null;
        }
        return Long.parseLong(selfLink.substring(selfLink.lastIndexOf('/') + 1));
    }

    @Override public Predicate<Entity> exists() {
        return new Predicate<Entity>() {
            @Override public boolean apply(@Nullable Entity entity) {
                return getId() != null && entity.getId() != null && entity instanceof AbstractEntity
                    && entity.getId().equals(getId());
            }
        };
    }
}
