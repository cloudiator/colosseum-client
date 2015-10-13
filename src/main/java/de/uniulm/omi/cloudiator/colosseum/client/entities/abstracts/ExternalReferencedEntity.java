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

package de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Frank on 03.06.2015.
 */
public abstract class ExternalReferencedEntity extends AbstractEntity {
    private List<String> externalReferences;

    public ExternalReferencedEntity(@Nullable List<Link> link, List<String> externalReferences) {
        super(link);
        this.externalReferences = externalReferences;
    }

    public ExternalReferencedEntity(List<String> externalReferences) {
        this(null, externalReferences);
    }

    protected ExternalReferencedEntity() {
        super();
    }

    public List<String> getExternalReferences() {
        if(externalReferences == null)
            externalReferences = new ArrayList<String>();

        return externalReferences;
    }

    public void setExternalReferences(List<String> externalReferences) {
        if(externalReferences == null)
            externalReferences = new ArrayList<String>();

        this.externalReferences = externalReferences;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        ExternalReferencedEntity that = (ExternalReferencedEntity) o;

        if (externalReferences != null ?
            !externalReferences.equals(that.externalReferences) :
            that.externalReferences != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        return externalReferences != null ? externalReferences.hashCode() : 0;
    }
}
