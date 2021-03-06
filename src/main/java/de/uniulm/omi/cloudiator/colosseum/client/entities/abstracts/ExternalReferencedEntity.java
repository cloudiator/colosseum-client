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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by Frank on 03.06.2015.
 */
public abstract class ExternalReferencedEntity extends AbstractEntity {

  private List<KeyValue> externalReferences = new ArrayList<>();

  public ExternalReferencedEntity(@Nullable List<Link> link, List<KeyValue> externalReferences) {
    super(link);
    this.externalReferences = externalReferences;
  }

  public ExternalReferencedEntity(List<KeyValue> externalReferences) {
    this(null, externalReferences);
  }

  protected ExternalReferencedEntity() {
    super();
  }

  public List<KeyValue> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<KeyValue> tags) {
    this.externalReferences = tags;
  }

  public void addExternalReference(KeyValue kv) {
    this.externalReferences.add(kv);
  }

  public void addExternalReference(String key, String value) {
    this.externalReferences.add(new KeyValue(key, value));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    ExternalReferencedEntity that = (ExternalReferencedEntity) o;

    if (externalReferences != null ?
        !externalReferences.equals(that.externalReferences) :
        that.externalReferences != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return externalReferences != null ? externalReferences.hashCode() : 0;
  }
}
