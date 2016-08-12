package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Frank on 17.03.2016.
 */
@Path("sensorConfigurations") public class SensorConfigurations extends AbstractEntity {

    private List<KeyValue> configs = new ArrayList<>();

    public SensorConfigurations(@Nullable List<Link> link, List<KeyValue> configs) {
        super(link);
        this.configs = configs;
    }

    public SensorConfigurations(List<KeyValue> configs) {
        this(null, configs);
    }

    protected SensorConfigurations() {
        //
    }

    public List<KeyValue> getConfigs() {
        return configs;
    }

    public void setConfigs(List<KeyValue> configs) {
        this.configs = configs;
    }
}

