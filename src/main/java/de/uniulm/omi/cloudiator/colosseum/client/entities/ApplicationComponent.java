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

import com.google.common.base.Predicate;
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.ContainerType;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Entity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("ac") public class ApplicationComponent extends AbstractEntity {

    private Long application;
    private Long component;
    private Long virtualMachineTemplate;
    private ContainerType containerType;

    public ApplicationComponent(@Nullable List<Link> links, Long application, Long component,
        Long virtualMachineTemplate, @Nullable ContainerType containerType) {
        super(links);
        this.application = application;
        this.component = component;
        this.virtualMachineTemplate = virtualMachineTemplate;
        this.containerType = containerType;
    }

    public ApplicationComponent(Long application, Long component, Long virtualMachineTemplate,
        @Nullable ContainerType containerType) {
        this(null, application, component, virtualMachineTemplate, containerType);
    }

    public ApplicationComponent(Long application, Long component, Long virtualMachineTemplate) {
        this(null, application, component, virtualMachineTemplate, null);
    }

    protected ApplicationComponent() {
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

    public Long getVirtualMachineTemplate() {
        return virtualMachineTemplate;
    }

    public void setVirtualMachineTemplate(Long virtualMachineTemplate) {
        this.virtualMachineTemplate = virtualMachineTemplate;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public void setContainerType(ContainerType containerType) {
        this.containerType = containerType;
    }

    @Override public Predicate<Entity> exists() {
        return new Predicate<Entity>() {
            @Override public boolean apply(@Nullable Entity input) {
                return input instanceof ApplicationComponent && component
                    .equals(((ApplicationComponent) input).getComponent()) && application
                    .equals(((ApplicationComponent) input).getApplication());
            }
        };
    }


}
