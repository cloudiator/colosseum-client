package de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 25.08.2015.
 */
public abstract class MetricMonitor extends Monitor {

    private List<Long> monitorInstances;

    public MetricMonitor(@Nullable List<Link> link, @Nullable List<String> externalReferences, @Nullable List<Long> monitorInstances) {
        super(link, externalReferences);

        this.monitorInstances = monitorInstances;
    }

    public MetricMonitor(@Nullable List<String> externalReferences, @Nullable List<Long> monitorInstances) {
        super(externalReferences);

        this.monitorInstances = monitorInstances;
    }

    protected MetricMonitor() {
        super();
    }

    public List<Long> getMonitorInstances() {
        return monitorInstances;
    }

    public void setMonitorInstances(List<Long> monitorInstances) {
        this.monitorInstances = monitorInstances;
    }
}
