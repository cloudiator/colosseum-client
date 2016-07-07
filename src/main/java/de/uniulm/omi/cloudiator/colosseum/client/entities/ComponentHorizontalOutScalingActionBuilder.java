package de.uniulm.omi.cloudiator.colosseum.client.entities;

import java.util.ArrayList;
import java.util.List;

public class ComponentHorizontalOutScalingActionBuilder {
    private List<String> externalReferences = new ArrayList<>();
    private Long amount;
    private Long min;
    private Long max;
    private Long count;
    private Long applicationComponent;

    public ComponentHorizontalOutScalingActionBuilder addExternalReferences(
        String externalReference) {
        this.externalReferences.add(externalReference);
        return this;
    }

    public ComponentHorizontalOutScalingActionBuilder amount(Long amount) {
        this.amount = amount;
        return this;
    }

    public ComponentHorizontalOutScalingActionBuilder min(Long min) {
        this.min = min;
        return this;
    }

    public ComponentHorizontalOutScalingActionBuilder max(Long max) {
        this.max = max;
        return this;
    }

    public ComponentHorizontalOutScalingActionBuilder count(Long count) {
        this.count = count;
        return this;
    }

    public ComponentHorizontalOutScalingActionBuilder applicationComponent(
        Long applicationComponent) {
        this.applicationComponent = applicationComponent;
        return this;
    }

    public ComponentHorizontalOutScalingAction build() {
        return new ComponentHorizontalOutScalingAction(externalReferences, amount, min, max, count,
            applicationComponent);
    }
}
