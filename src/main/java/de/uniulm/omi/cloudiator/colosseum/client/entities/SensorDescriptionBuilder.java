package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class SensorDescriptionBuilder {

  private String className;
  private String metricName;
  private Boolean isVmSensor;
  private Boolean isPush = false;

  public SensorDescriptionBuilder className(String className) {
    this.className = className;
    return this;
  }

  public SensorDescriptionBuilder metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

  public SensorDescriptionBuilder isVmSensor(Boolean isVmSensor) {
    this.isVmSensor = isVmSensor;
    return this;
  }

  public SensorDescriptionBuilder isPush(Boolean isPush) {
    this.isPush = isPush;
    return this;
  }

  public SensorDescription build() {
    return new SensorDescription(className, metricName, isVmSensor, isPush);
  }
}
