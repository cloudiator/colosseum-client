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

import de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts.MetricMonitor;
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.FlowOperator;
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.FormulaOperator;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("composedMonitor") public class ComposedMonitor extends MetricMonitor {

    private FlowOperator flowOperator;
    private FormulaOperator function;
    private Long quantifier;
    private Long window;
    private List<Long> monitors;
    private List<Long> scalingActions;
    private Long schedule;

    public ComposedMonitor(@Nullable List<Link> link, @Nullable List<KeyValue> externalReferences,
        @Nullable List<Long> monitorInstances, FlowOperator flowOperator, FormulaOperator function,
        Long quantifier, Long window, List<Long> monitors, List<Long> scalingActions,
        Long schedule) {
        super(link, externalReferences, monitorInstances);
        this.flowOperator = flowOperator;
        this.function = function;
        this.quantifier = quantifier;
        this.window = window;
        this.monitors = monitors;
        this.scalingActions = scalingActions;
        this.schedule = schedule;
    }

    public ComposedMonitor(@Nullable List<KeyValue> externalReferences,
        @Nullable List<Long> monitorInstances, FlowOperator flowOperator, FormulaOperator function,
        Long quantifier, Long window, List<Long> monitors, List<Long> scalingActions,
        Long schedule) {
        super(null, externalReferences, monitorInstances);
        this.flowOperator = flowOperator;
        this.function = function;
        this.quantifier = quantifier;
        this.window = window;
        this.monitors = monitors;
        this.scalingActions = scalingActions;
        this.schedule = schedule;
    }

    public ComposedMonitor(@Nullable List<Long> monitorInstances, FlowOperator flowOperator,
        FormulaOperator function, Long quantifier, Long window, List<Long> monitors,
        List<Long> scalingActions, Long schedule) {
        super(null, null, monitorInstances);
        this.flowOperator = flowOperator;
        this.function = function;
        this.quantifier = quantifier;
        this.window = window;
        this.monitors = monitors;
        this.scalingActions = scalingActions;
        this.schedule = schedule;
    }

    public ComposedMonitor(FlowOperator flowOperator, FormulaOperator function, Long quantifier,
        Long window, List<Long> monitors, List<Long> scalingActions, Long schedule) {
        super(null, null, null);
        this.flowOperator = flowOperator;
        this.function = function;
        this.quantifier = quantifier;
        this.window = window;
        this.monitors = monitors;
        this.scalingActions = scalingActions;
        this.schedule = schedule;
    }

    protected ComposedMonitor() {

    }

    public FlowOperator getFlowOperator() {
        return flowOperator;
    }

    public void setFlowOperator(FlowOperator flowOperator) {
        this.flowOperator = flowOperator;
    }

    public FormulaOperator getFunction() {
        return function;
    }

    public void setFunction(FormulaOperator function) {
        this.function = function;
    }

    public Long getQuantifier() {
        return quantifier;
    }

    public void setQuantifier(Long quantifier) {
        this.quantifier = quantifier;
    }

    public Long getWindow() {
        return window;
    }

    public void setWindow(Long window) {
        this.window = window;
    }

    public List<Long> getMonitors() {
        return monitors;
    }

    public void setMonitors(List<Long> monitors) {
        this.monitors = monitors;
    }

    public List<Long> getScalingActions() {
        return scalingActions;
    }

    public void setScalingActions(List<Long> scalingActions) {
        this.scalingActions = scalingActions;
    }

    public Long getSchedule() {
        return schedule;
    }

    public void setSchedule(Long schedule) {
        this.schedule = schedule;
    }

}
