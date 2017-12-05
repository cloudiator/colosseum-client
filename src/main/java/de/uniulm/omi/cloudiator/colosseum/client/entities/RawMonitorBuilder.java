package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import java.util.ArrayList;
import java.util.List;

public class RawMonitorBuilder {

  private List<KeyValue> externalReferences = new ArrayList<>();
  private List<Long> monitorInstances = new ArrayList<>();
  private Long application;
  private Long component;
  private Long componentInstance;
  private Long cloud;
  private Long sensorDescription;
  private Long schedule;
  private Long sensorConfigurations;

  public RawMonitorBuilder addExternalReference(KeyValue externalReference) {
    this.externalReferences.add(externalReference);
    return this;
  }

  public RawMonitorBuilder addExternalReference(String key, String value) {
    this.externalReferences.add(new KeyValue(key, value));
    return this;
  }

  public RawMonitorBuilder addMonitorInstances(Long monitorInstance) {
    this.monitorInstances.add(monitorInstance);
    return this;
  }

  public RawMonitorBuilder application(Long application) {
    this.application = application;
    return this;
  }

  public RawMonitorBuilder component(Long component) {
    this.component = component;
    return this;
  }

  public RawMonitorBuilder componentInstance(Long componentInstance) {
    this.componentInstance = componentInstance;
    return this;
  }

  public RawMonitorBuilder cloud(Long cloud) {
    this.cloud = cloud;
    return this;
  }

  public RawMonitorBuilder sensorDescription(Long sensorDescription) {
    this.sensorDescription = sensorDescription;
    return this;
  }

  public RawMonitorBuilder schedule(Long schedule) {
    this.schedule = schedule;
    return this;
  }

  public RawMonitorBuilder sensorConfigurations(Long sensorConfigurations) {
    this.sensorConfigurations = sensorConfigurations;
    return this;
  }

  public RawMonitor build() {
    return new RawMonitor(null, externalReferences, monitorInstances, application, component,
        componentInstance, cloud, sensorDescription, schedule, sensorConfigurations);
  }
}
