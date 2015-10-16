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

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("api")
public class Api extends NamedEntity {

    private String internalProviderName;

    public Api(@Nullable List<Link> links, String name, String internalProviderName) {
        super(links, name);
        this.internalProviderName = internalProviderName;
    }

    public Api(String name, String internalProviderName) {
        this(null, name, internalProviderName);
    }

    protected Api() {
    }

    public String getInternalProviderName() {
        return internalProviderName;
    }

    public void setInternalProviderName(String internalProviderName) {
        this.internalProviderName = internalProviderName;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;

        Api api = (Api) o;

        if (internalProviderName != null ?
            !internalProviderName.equals(api.internalProviderName) :
            api.internalProviderName != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (internalProviderName != null ? internalProviderName.hashCode() : 0);
        return result;
    }
}