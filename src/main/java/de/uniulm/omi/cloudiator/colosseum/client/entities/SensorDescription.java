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
@Path("sensorDescription")
public class SensorDescription extends AbstractEntity<SensorDescription> {

    private String className;
    private String metricName;
    private Boolean isVmSensor;

    public SensorDescription(@Nullable List<Link> link, String className, String metricName,
        Boolean isVmSensor) {
        super(link);
        this.className = className;
        this.metricName = metricName;
        this.isVmSensor = isVmSensor;
    }

    public SensorDescription(String className, String metricName, Boolean isVmSensor) {
        this(null, className, metricName, isVmSensor);
    }

    protected SensorDescription(){

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public Boolean getIsVmSensor() {
        return isVmSensor;
    }

    public void setIsVmSensor(Boolean isVmSensor) {
        this.isVmSensor = isVmSensor;
    }

    @Override public int compareTo(SensorDescription o) {
        if(this.getClassName().equals(o.getClassName()) &&
            this.getIsVmSensor().equals(o.getIsVmSensor()) &&
            this.getMetricName().equals(o.getMetricName())) {
            return 0;
        }

        return -1;
    }
}
