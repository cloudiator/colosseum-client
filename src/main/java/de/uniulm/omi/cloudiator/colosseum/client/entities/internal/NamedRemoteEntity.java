/*
 * Copyright (c) 2014-2015 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.uniulm.omi.cloudiator.colosseum.client.entities.internal;

import java.util.List;

/**
 * Created by Frank on 18.08.2015.
 */
public abstract class NamedRemoteEntity extends RemoteEntity {
    private String name;

    public NamedRemoteEntity(List<Link> links, String remoteId, String cloudProviderId, String name) {
        super(links, remoteId, cloudProviderId);
        this.name = name;
    }

    public NamedRemoteEntity(String remoteId, String cloudProviderId, String name) {
        this(null, remoteId, cloudProviderId, name);
    }

    protected NamedRemoteEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof NamedRemoteEntity))
            return false;
        if (!super.equals(o))
            return false;

        NamedRemoteEntity that = (NamedRemoteEntity) o;

        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
