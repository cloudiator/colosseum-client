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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import java.util.List;

/**
 * Created by daniel on 21.01.15.
 */
@Path("cloud")
public class Cloud extends NamedEntity {

    private String endpoint;
    private Long api;

    public Cloud(List<Link> links, String name, String endpoint, Long api) {
        super(links, name);
        this.endpoint = endpoint;
        this.api = api;
    }

    public Cloud(String name, String endpoint, Long api) {
        this(null, name, endpoint, api);
    }

    protected Cloud() {
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Long getApi() {
        return api;
    }

    public void setApi(Long api) {
        this.api = api;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;

        Cloud cloud = (Cloud) o;

        if (api != null ? !api.equals(cloud.api) : cloud.api != null)
            return false;
        if (endpoint != null ? !endpoint.equals(cloud.endpoint) : cloud.endpoint != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (endpoint != null ? endpoint.hashCode() : 0);
        result = 31 * result + (api != null ? api.hashCode() : 0);
        return result;
    }
}
