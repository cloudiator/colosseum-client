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
@Path("communication") public class Communication extends AbstractEntity {

    private Long requiredPort;
    private Long providedPort;

    public Communication(@Nullable List<Link> links, Long requiredPort, Long providedPort) {
        super(links);
        this.requiredPort = requiredPort;
        this.providedPort = providedPort;
    }

    public Communication(Long requiredPort, Long providedPort) {
        this(null, requiredPort, providedPort);
    }

    protected Communication() {
    }

    public Long getRequiredPort() {
        return requiredPort;
    }

    public void setRequiredPort(Long requiredPort) {
        this.requiredPort = requiredPort;
    }

    public Long getProvidedPort() {
        return providedPort;
    }

    public void setProvidedPort(Long providedPort) {
        this.providedPort = providedPort;
    }

}
