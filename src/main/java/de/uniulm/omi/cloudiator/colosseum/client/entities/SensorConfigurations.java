package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

/**
 * Created by Frank on 17.03.2016.
 */
@Path("sensorConfigurations")
public class SensorConfigurations extends AbstractEntity {

    private Map<String, String> configs;

    public SensorConfigurations(@Nullable List<Link> link, Map<String, String> configs){
        super(link);
        this.configs = configs;
    }

    public SensorConfigurations(Map<String, String> configs){
        this(null, configs);
    }

    protected SensorConfigurations(){
        //
    }

    public Map<String, String> getConfigs() {
        return configs;
    }

    public void setConfigs(Map<String, String> tags) {
        this.configs = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SensorConfigurations)) return false;

        SensorConfigurations that = (SensorConfigurations) o;

        return !(configs != null ? !configs.equals(that.configs) : that.configs != null);

    }

    @Override
    public int hashCode() {
        return configs != null ? configs.hashCode() : 0;
    }
}

