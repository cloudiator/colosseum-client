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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

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
    private Boolean isExternal;

    public RawMonitor(@Nullable List<Link> link, @Nullable List<KeyValue> externalReferences,
        @Nullable List<Long> monitorInstances, Long application, Long component,
        Long componentInstance, Long cloud, Long sensorDescription, Long schedule,
        @Nullable Long sensorConfigurations, Boolean isExternal) {
        super(link, externalReferences, monitorInstances);
        this.application = application;
        this.component = component;
        this.componentInstance = componentInstance;
        this.cloud = cloud;
        this.sensorDescription = sensorDescription;
        this.schedule = schedule;
        this.sensorConfigurations = sensorConfigurations;
        this.isExternal = isExternal;
    }

    public RawMonitor(@Nullable List<KeyValue> externalReferences,
        @Nullable List<Long> monitorInstances, Long application, Long component, Long instance,
        Long cloud, Long sensorDescription, Long schedule) {
        this(null, externalReferences, monitorInstances, application, component, instance, cloud,
            sensorDescription, schedule, null, false);
    }

    public RawMonitor(@Nullable List<Long> monitorInstances, Long application, Long component,
        Long instance, Long cloud, Long sensorDescription, Long schedule) {
        this(null, null, monitorInstances, application, component, instance, cloud,
            sensorDescription, schedule, null, false);
    }

    public RawMonitor(Long application, Long component, Long instance, Long cloud,
        Long sensorDescription, Long schedule) {
        this(null, null, null, application, component, instance, cloud, sensorDescription, schedule,
            null, false);
    }

    public RawMonitor(Long application, Long component, Long instance, Long cloud,
        Long sensorDescription, Long schedule, Long sensorConfigurations) {
        this(null, null, null, application, component, instance, cloud, sensorDescription, schedule,
            sensorConfigurations, false);
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

    public Boolean getIsExternal() {
        return isExternal;
    }

    public void setIsExternal(Boolean external) {
        isExternal = external;
    }
}
