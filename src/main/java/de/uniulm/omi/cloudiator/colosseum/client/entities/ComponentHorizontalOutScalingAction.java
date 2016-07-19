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

import de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts.ComponentHorizontalScalingAction;
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.FlowOperator;
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.FormulaOperator;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("componentHorizontalOutScalingAction")
public class ComponentHorizontalOutScalingAction extends ComponentHorizontalScalingAction {
    public ComponentHorizontalOutScalingAction(@Nullable List<Link> link, @Nullable List<KeyValue> externalReferences, Long amount, Long min,
        Long max, Long count, Long applicationComponent) {
        super(link, externalReferences, amount, min, max, count, applicationComponent);
    }

    public ComponentHorizontalOutScalingAction(@Nullable List<KeyValue> externalReferences, Long amount, Long min, Long max, Long count,
                                               Long applicationComponent) {
        this(null, externalReferences, amount, min, max, count, applicationComponent);
    }

    public ComponentHorizontalOutScalingAction(Long amount, Long min, Long max, Long count,
        Long applicationComponent) {
        this(null, null, amount, min, max, count, applicationComponent);
    }

    protected ComponentHorizontalOutScalingAction(){
    }
}
