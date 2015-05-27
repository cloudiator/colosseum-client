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

/**
 * Created by frank on 21.01.15.
 */
@Path("userCredential")
public class MonitorInstance extends AbstractEntity {

    private Long monitor;
    private Long ipAddress;
    private Long vm;
    private Long component;

    public MonitorInstance(@Nullable List<Link> link, Long monitor, Long ipAddress, Long vm,
        Long component) {
        super(link);
        this.monitor = monitor;
        this.ipAddress = ipAddress;
        this.vm = vm;
        this.component = component;
    }

    public MonitorInstance(Long monitor, Long ipAddress, Long vm, Long component) {
        this(null, monitor, ipAddress, vm, component);
    }

    protected MonitorInstance(){

    }

    public Long getMonitor() {
        return monitor;
    }

    public void setMonitor(Long monitor) {
        this.monitor = monitor;
    }

    public Long getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(Long ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Long getVm() {
        return vm;
    }

    public void setVm(Long vm) {
        this.vm = vm;
    }

    public Long getComponent() {
        return component;
    }

    public void setComponent(Long component) {
        this.component = component;
    }
}
