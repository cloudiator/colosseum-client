/*
 * Copyright (c) 2015 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by frank on 21.01.15.
 */
@Path("schedule")
public class Schedule extends AbstractEntity<Schedule> {

    private Long interval;
    private TimeUnit timeUnit;

    public Schedule(@Nullable List<Link> link, Long interval, TimeUnit timeUnit) {
        super(link);
        this.interval = interval;
        this.timeUnit = timeUnit;
    }

    public Schedule(Long interval, TimeUnit timeUnit) {
        this(null, interval, timeUnit);
    }

    protected Schedule(){

    }

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override public int compareTo(Schedule o) {
        if(this.timeUnit.equals(o.getTimeUnit()) &&
            this.interval.equals(o.getInterval())){
            return 0;
        }

        return -1;
    }
}
