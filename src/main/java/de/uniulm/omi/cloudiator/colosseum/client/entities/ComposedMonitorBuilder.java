package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.FlowOperator;
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.FormulaOperator;

import java.util.ArrayList;
import java.util.List;

public class ComposedMonitorBuilder {
    private List<String> externalReferences = new ArrayList<>();
    private List<Long> monitorInstances = new ArrayList<>();
    private FlowOperator flowOperator;
    private FormulaOperator function;
    private Long quantifier;
    private Long window;
    private List<Long> monitors = new ArrayList<>();
    private List<Long> scalingActions = new ArrayList<>();
    private Long schedule;

    public ComposedMonitorBuilder addExternalReference(String externalReference) {
        this.externalReferences.add(externalReference);
        return this;
    }

    public ComposedMonitorBuilder addMonitorInstance(Long monitorInstance) {
        this.monitorInstances.add(monitorInstance);
        return this;
    }

    public ComposedMonitorBuilder flowOperator(FlowOperator flowOperator) {
        this.flowOperator = flowOperator;
        return this;
    }

    public ComposedMonitorBuilder function(FormulaOperator function) {
        this.function = function;
        return this;
    }

    public ComposedMonitorBuilder quantifier(Long quantifier) {
        this.quantifier = quantifier;
        return this;
    }

    public ComposedMonitorBuilder window(Long window) {
        this.window = window;
        return this;
    }

    public ComposedMonitorBuilder addMonitor(Long monitor) {
        this.monitors.add(monitor);
        return this;
    }

    public ComposedMonitorBuilder addScalingAction(Long scalingAction) {
        this.scalingActions.add(scalingAction);
        return this;
    }

    public ComposedMonitorBuilder schedule(Long schedule) {
        this.schedule = schedule;
        return this;
    }

    public ComposedMonitor build() {
        return new ComposedMonitor(externalReferences, monitorInstances, flowOperator, function,
            quantifier, window, monitors, scalingActions, schedule);
    }
}
