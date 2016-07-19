package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;

import java.util.ArrayList;
import java.util.List;

public class ComponentHorizontalInScalingActionBuilder {

    private List<KeyValue> externalReferences = new ArrayList<>();
    private Long amount;
    private Long min;
    private Long max;
    private Long count;
    private Long applicationComponent;

    public ComponentHorizontalInScalingActionBuilder addExternalReference(
            KeyValue externalReference) {
        this.externalReferences.add(externalReference);
        return this;
    }

    public ComponentHorizontalInScalingActionBuilder addExternalReference(
            String key, String value) {
        this.externalReferences.add(new KeyValue(key, value));
        return this;
    }

    public ComponentHorizontalInScalingActionBuilder amount(Long amount) {
        this.amount = amount;
        return this;
    }

    public ComponentHorizontalInScalingActionBuilder min(Long min) {
        this.min = min;
        return this;
    }

    public ComponentHorizontalInScalingActionBuilder max(Long max) {
        this.max = max;
        return this;
    }

    public ComponentHorizontalInScalingActionBuilder count(Long count) {
        this.count = count;
        return this;
    }

    public ComponentHorizontalInScalingActionBuilder applicationComponent(
        Long applicationComponent) {
        this.applicationComponent = applicationComponent;
        return this;
    }

    public ComponentHorizontalInScalingAction build() {
        return new ComponentHorizontalInScalingAction(externalReferences, amount, min, max, count,
            applicationComponent);
    }
}
