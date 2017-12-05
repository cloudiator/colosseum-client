package de.uniulm.omi.cloudiator.colosseum.client.entities;

import java.util.concurrent.TimeUnit;

public class ScheduleBuilder {

  private Long interval;
  private TimeUnit timeUnit;

  public ScheduleBuilder interval(Long interval) {
    this.interval = interval;
    return this;
  }

  public ScheduleBuilder timeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  public Schedule build() {
    return new Schedule(interval, timeUnit);
  }
}
