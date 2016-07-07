package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;

import java.util.ArrayList;
import java.util.List;

public class SensorConfigurationsBuilder {

    private List<KeyValue> configs = new ArrayList<>();

    public SensorConfigurationsBuilder addConfig(KeyValue config) {
        this.configs.add(config);
        return this;
    }

    public SensorConfigurations build() {
        return new SensorConfigurations(configs);
    }
}
