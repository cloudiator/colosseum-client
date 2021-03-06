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

package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts.ComponentHorizontalScalingAction;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by Frank on 10.08.2015.
 */
@Path("componentHorizontalInScalingAction")
public class ComponentHorizontalInScalingAction extends ComponentHorizontalScalingAction {

  public ComponentHorizontalInScalingAction(@Nullable List<Link> link,
      @Nullable List<KeyValue> externalReferences, Long amount, Long min,
      Long max, Long count, Long applicationComponent) {
    super(link, externalReferences, amount, min, max, count, applicationComponent);
  }

  public ComponentHorizontalInScalingAction(@Nullable List<KeyValue> externalReferences,
      Long amount, Long min, Long max, Long count,
      Long applicationComponent) {
    this(null, externalReferences, amount, min, max, count, applicationComponent);
  }

  public ComponentHorizontalInScalingAction(Long amount, Long min, Long max, Long count,
      Long applicationComponent) {
    this(null, null, amount, min, max, count, applicationComponent);
  }

  protected ComponentHorizontalInScalingAction() {
  }
}
