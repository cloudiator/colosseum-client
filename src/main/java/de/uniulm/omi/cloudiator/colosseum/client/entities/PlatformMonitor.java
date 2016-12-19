package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts.MetricMonitor;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by Frank on 19.12.2016.
 */
@Path("platformMonitor") public class PlatformMonitor extends MetricMonitor {


    private Long applicationComponent;
    private Long platformComponent;
    private Long platformInstance;
    private Long sensorDescription;
    private Long schedule;
    private Long sensorConfigurations;

    public PlatformMonitor(@Nullable List<Link> link, @Nullable List<KeyValue> externalReferences,
                      @Nullable List<Long> monitorInstances, Long applicationComponent, Long platformComponent,
                      Long platformInstance, Long sensorDescription, Long schedule,
                      @Nullable Long sensorConfigurations) {
        super(link, externalReferences, monitorInstances);
        this.applicationComponent = applicationComponent;
        this.platformComponent = platformComponent;
        this.platformInstance = platformInstance;
        //this.cloud = cloud;
        this.sensorDescription = sensorDescription;
        this.schedule = schedule;
        this.sensorConfigurations = sensorConfigurations;
    }
    protected PlatformMonitor() {

    }

    public Long getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(Long applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public Long getPlatformComponent() {
        return platformComponent;
    }

    public void setPlatformComponent(Long platformComponent) {
        this.platformComponent = platformComponent;
    }

    public Long getPlatformInstance() {
        return platformInstance;
    }

    public void setPlatformInstance(Long platformInstance) {
        this.platformInstance = platformInstance;
    }

    public Long getSensorDescription() {
        return sensorDescription;
    }

    public void setSensorDescription(Long sensorDescription) {
        this.sensorDescription = sensorDescription;
    }

    public Long getSchedule() {
        return schedule;
    }

    public void setSchedule(Long schedule) {
        this.schedule = schedule;
    }

    public Long getSensorConfigurations() {
        return sensorConfigurations;
    }

    public void setSensorConfigurations(Long sensorConfigurations) {
        this.sensorConfigurations = sensorConfigurations;
    }
}
