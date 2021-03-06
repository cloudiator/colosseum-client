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

import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by frank on 21.01.15.
 */
public abstract class NamedEntity extends AbstractEntity {

  protected String name;

  public NamedEntity(List<Link> links, String name) {
    super(links);
    this.name = name;
  }

  public NamedEntity(String name) {
    this(null, name);
  }

  protected NamedEntity() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    NamedEntity that = (NamedEntity) o;

    //TODO: better case insensitive?
    //name.equalsIgnoreCase(that.name)
    if (name != null ? !name.equals(that.name) : that.name != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }

  public Predicate<Entity> exists() {
    return new Predicate<Entity>() {
      @Override
      public boolean apply(@Nullable Entity entity) {
        return entity instanceof NamedEntity && ((NamedEntity) entity).getName()
            .equals(getName());
      }
    };
  }
}
