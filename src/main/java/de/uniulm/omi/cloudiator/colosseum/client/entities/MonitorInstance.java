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

import de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts.Monitor;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("monitorInstance") public class MonitorInstance extends Monitor {

    private Long monitor;
    private String apiEndpoint;
    private Long virtualMachine;
    private Long component;
    private Integer port;


    public MonitorInstance(@Nullable List<Link> link, @Nullable List<KeyValue> externalReferences,
        Long monitor, String apiEndpoint, Long virtualMachine, Long component,
        Integer port) {
        super(link, externalReferences);
        this.monitor = monitor;
        this.apiEndpoint = apiEndpoint;
        this.virtualMachine = virtualMachine;
        this.component = component;
        this.port = port;
    }


    public MonitorInstance(List<KeyValue> externalReferences, Long monitor, String apiEndpoint,
        Long virtualMachine, Long component, Integer port) {
        this(null, externalReferences, monitor, apiEndpoint, virtualMachine, component,
            port);
    }

    public MonitorInstance(Long monitor, String apiEndpoint, Long virtualMachine,
        Long component, Integer port) {
        this(null, null, monitor, apiEndpoint, virtualMachine, component, port);
    }

    protected MonitorInstance() {

    }

    public Long getMonitor() {
        return monitor;
    }

    public void setMonitor(Long monitor) {
        this.monitor = monitor;
    }

    public Long getVirtualMachine() {
        return virtualMachine;
    }

    public void setVirtualMachine(Long virtualMachine) {
        this.virtualMachine = virtualMachine;
    }

    public Long getComponent() {
        return component;
    }

    public void setComponent(Long component) {
        this.component = component;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
