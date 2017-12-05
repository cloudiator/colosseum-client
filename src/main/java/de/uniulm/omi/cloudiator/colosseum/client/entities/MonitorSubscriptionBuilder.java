package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.FilterType;
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.SubscriptionType;

public class MonitorSubscriptionBuilder {

  private Long monitor;
  private String endpoint;
  private SubscriptionType type;
  private FilterType filterType;
  private Double filterValue;

  public MonitorSubscriptionBuilder monitor(Long monitor) {
    this.monitor = monitor;
    return this;
  }

  public MonitorSubscriptionBuilder endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public MonitorSubscriptionBuilder type(SubscriptionType type) {
    this.type = type;
    return this;
  }

  public MonitorSubscriptionBuilder filterType(FilterType filterType) {
    this.filterType = filterType;
    return this;
  }

  public MonitorSubscriptionBuilder filterValue(Double filterValue) {
    this.filterValue = filterValue;
    return this;
  }

  public MonitorSubscription build() {
    return new MonitorSubscription(monitor, endpoint, type, filterType, filterValue);
  }
}
