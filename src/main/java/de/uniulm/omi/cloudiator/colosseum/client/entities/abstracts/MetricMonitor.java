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
 * Created by Frank on 25.08.2015.
 */
public abstract class MetricMonitor extends Monitor {

  private List<Long> monitorInstances;

  public MetricMonitor(@Nullable List<Link> link, @Nullable List<KeyValue> externalReferences,
      @Nullable List<Long> monitorInstances) {
    super(link, externalReferences);

    this.monitorInstances = monitorInstances;
  }

  public MetricMonitor(@Nullable List<KeyValue> externalReferences,
      @Nullable List<Long> monitorInstances) {
    super(externalReferences);

    this.monitorInstances = monitorInstances;
  }

  protected MetricMonitor() {
    super();
  }

  public List<Long> getMonitorInstances() {
    return monitorInstances;
  }

  public void setMonitorInstances(List<Long> monitorInstances) {
    this.monitorInstances = monitorInstances;
  }
}
