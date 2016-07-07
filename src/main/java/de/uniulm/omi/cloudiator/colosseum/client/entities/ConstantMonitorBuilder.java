package de.uniulm.omi.cloudiator.colosseum.client.entities;

import java.util.ArrayList;
import java.util.List;

public class ConstantMonitorBuilder {

    private List<String> externalReferences = new ArrayList<>();
    private Double value;

    public ConstantMonitorBuilder addExternalReference(String externalReference) {
        this.externalReferences.add(externalReference);
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
