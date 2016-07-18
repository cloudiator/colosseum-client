package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;

import java.util.ArrayList;
import java.util.List;

public class ConstantMonitorBuilder {

    private List<KeyValue> externalReferences = new ArrayList<>();
    private Double value;

    public ConstantMonitorBuilder addExternalReference(KeyValue externalReference) {
        this.externalReferences.add(externalReference);
        return this;
    }

    public ConstantMonitorBuilder addExternalReference(String key, String value) {
        this.externalReferences.add(new KeyValue(key, value));
        return this;
    }

    public ConstantMonitorBuilder value(Double value) {
        this.value = value;
        return this;
    }

    public ConstantMonitor build() {
        return new ConstantMonitor(externalReferences, value);
    }
}
