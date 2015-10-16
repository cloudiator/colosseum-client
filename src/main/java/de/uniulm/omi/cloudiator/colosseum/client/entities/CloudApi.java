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

package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("cloudApi")
public class CloudApi extends AbstractEntity {

    private Long api;
    private Long cloud;
    private String endpoint;

    public CloudApi(@Nullable List<Link> links, Long api, Long cloud, String endpoint) {
        super(links);
        this.api = api;
        this.cloud = cloud;
        this.endpoint = endpoint;
    }

    public CloudApi(Long api, Long cloud, String endpoint) {
        this(null, api, cloud, endpoint);
    }

    protected CloudApi() {
    }

    public Long getApi() {
        return api;
    }

    public void setApi(Long api) {
        this.api = api;
    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        CloudApi cloudApi = (CloudApi) o;

        if (api != null ? !api.equals(cloudApi.api) : cloudApi.api != null)
            return false;
        if (cloud != null ? !cloud.equals(cloudApi.cloud) : cloudApi.cloud != null)
            return false;
        if (endpoint != null ? !endpoint.equals(cloudApi.endpoint) : cloudApi.endpoint != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = api != null ? api.hashCode() : 0;
        result = 31 * result + (cloud != null ? cloud.hashCode() : 0);
        result = 31 * result + (endpoint != null ? endpoint.hashCode() : 0);
        return result;
    }
}