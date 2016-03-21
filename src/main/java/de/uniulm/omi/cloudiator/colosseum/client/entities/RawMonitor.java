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

import de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts.MetricMonitor;
import de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts.Monitor;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by frank on 21.01.15.
 */
@Path("rawMonitor") public class RawMonitor extends MetricMonitor {

    private Long application;
    private Long component;
    private Long componentInstance;
    private Long cloud;
    private Long sensorDescription;
    private Long schedule;
    private Long sensorConfigurations;

    public RawMonitor(@Nullable List<Link> link, @Nullable List<String> externalReferences,
        @Nullable List<Long> monitorInstances,
        Long application, Long component, Long componentInstance,
        Long cloud, Long sensorDescription, Long schedule, @Nullable Long sensorConfigurations) {
        super(link, externalReferences, monitorInstances);
        this.application = application;
        this.component = component;
        this.componentInstance = componentInstance;
        this.cloud = cloud;
        this.sensorDescription = sensorDescription;
        this.schedule = schedule;
        this.sensorConfigurations = sensorConfigurations;
    }

    public RawMonitor(@Nullable List<String> externalReferences, @Nullable List<Long> monitorInstances, Long application, Long component, Long instance, Long cloud,
        Long sensorDescription, Long schedule) {
        this(null, externalReferences, monitorInstances, application, component, instance, cloud, sensorDescription, schedule, null);
    }

    public RawMonitor(@Nullable List<Long> monitorInstances, Long application, Long component, Long instance, Long cloud,
        Long sensorDescription, Long schedule) {
        this(null, null, monitorInstances, application, component, instance, cloud, sensorDescription, schedule, null);
    }

    public RawMonitor(Long application, Long component, Long instance, Long cloud,
        Long sensorDescription, Long schedule) {
        this(null, null, null, application, component, instance, cloud, sensorDescription, schedule, null);
    }

    public RawMonitor(Long application, Long component, Long instance, Long cloud,
                      Long sensorDescription, Long schedule, Long sensorConfigurations) {
        this(null, null, null, application, component, instance, cloud, sensorDescription, schedule, sensorConfigurations);
    }

    protected RawMonitor() {

    }

    public Long getApplication() {
        return application;
    }

    public void setApplication(Long application) {
        this.application = application;
    }

    public Long getComponent() {
        return component;
    }

    public void setComponent(Long component) {
        this.component = component;
    }

    public Long getComponentInstance() {
        return componentInstance;
    }

    public void setComponentInstance(Long componentInstance) {
        this.componentInstance = componentInstance;
    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
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

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        RawMonitor that = (RawMonitor) o;

        if (application != null ? !application.equals(that.application) : that.application != null)
            return false;
        if (cloud != null ? !cloud.equals(that.cloud) : that.cloud != null)
            return false;
        if (component != null ? !component.equals(that.component) : that.component != null)
            return false;
        if (componentInstance != null ?
            !componentInstance.equals(that.componentInstance) :
            that.componentInstance != null)
            return false;
        if (schedule != null ? !schedule.equals(that.schedule) : that.schedule != null)
            return false;
        if (sensorConfigurations != null ? !sensorConfigurations.equals(that.sensorConfigurations) : that.sensorConfigurations != null)
            return false;
        if (sensorDescription != null ?
            !sensorDescription.equals(that.sensorDescription) :
            that.sensorDescription != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = application != null ? application.hashCode() : 0;
        result = 31 * result + (component != null ? component.hashCode() : 0);
        result = 31 * result + (componentInstance != null ? componentInstance.hashCode() : 0);
        result = 31 * result + (cloud != null ? cloud.hashCode() : 0);
        result = 31 * result + (sensorDescription != null ? sensorDescription.hashCode() : 0);
        result = 31 * result + (schedule != null ? schedule.hashCode() : 0);
        result = 31 * result + (sensorConfigurations != null ? sensorConfigurations.hashCode() : 0);
        return result;
    }
}
