package de.uniulm.omi.cloudiator.colosseum.client.entities;

import java.util.concurrent.TimeUnit;

public class TimeWindowBuilder {

  private Long interval;
  private TimeUnit timeUnit;

  public TimeWindowBuilder interval(Long interval) {
    this.interval = interval;
    return this;
  }

  public TimeWindowBuilder timeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  public TimeWindow build() {
    return new TimeWindow(interval, timeUnit);
  }
}
