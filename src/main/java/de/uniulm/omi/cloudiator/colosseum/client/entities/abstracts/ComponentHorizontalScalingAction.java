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

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by Frank on 27.05.2015.
 */
public abstract class ComponentHorizontalScalingAction extends HorizontalScalingAction {

  private Long applicationComponent;

  public ComponentHorizontalScalingAction(@Nullable List<Link> link,
      List<KeyValue> externalReferences, Long amount, Long min,
      Long max, Long count, Long applicationComponent) {
    super(link, externalReferences, amount, min, max, count);
    this.applicationComponent = applicationComponent;
  }

  public ComponentHorizontalScalingAction(List<KeyValue> externalReferences, Long amount, Long min,
      Long max, Long count,
      Long applicationComponent) {
    this(null, externalReferences, amount, min, max, count, applicationComponent);
  }

  protected ComponentHorizontalScalingAction() {
  }

  public Long getApplicationComponent() {
    return applicationComponent;
  }

  public void setApplicationComponent(Long applicationComponent) {
    this.applicationComponent = applicationComponent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }

    ComponentHorizontalScalingAction that = (ComponentHorizontalScalingAction) o;

    if (applicationComponent != null ?
        !applicationComponent.equals(that.applicationComponent) :
        that.applicationComponent != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (applicationComponent != null ? applicationComponent.hashCode() : 0);
    return result;
  }
}
