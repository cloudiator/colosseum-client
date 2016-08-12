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

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.RemoteState;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedRemoteEntityInLocation;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("image") public class Image extends NamedRemoteEntityInLocation {

    private Long operatingSystem;
    private String defaultLoginUsername;
    private String defaultLoginPassword;

    public Image(@Nullable List<Link> links, String remoteId, RemoteState remoteState,
        String providerId, String swordId, Long cloud, List<Long> cloudCredentials, Long owner,
        Long location, String name, Long operatingSystem, String defaultLoginUsername,
        String defaultLoginPassword) {
        super(links, remoteId, remoteState, providerId, swordId, cloud, cloudCredentials, owner,
            location, name);
        this.operatingSystem = operatingSystem;
        this.defaultLoginUsername = defaultLoginUsername;
        this.defaultLoginPassword = defaultLoginPassword;
    }


    public Image(String remoteId, RemoteState remoteState, String providerId, String swordId,
        Long cloud, List<Long> cloudCredentials, Long owner, Long location, String name,
        Long operatingSystem, String defaultLoginUsername, String defaultLoginPassword) {
        this(null, remoteId, remoteState, providerId, swordId, cloud, cloudCredentials, owner,
            location, name, operatingSystem, defaultLoginUsername, defaultLoginPassword);
    }

    protected Image() {
    }

    public Long getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(Long operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getDefaultLoginUsername() {
        return defaultLoginUsername;
    }

    public void setDefaultLoginUsername(String defaultLoginUsername) {
        this.defaultLoginUsername = defaultLoginUsername;
    }

    public String getDefaultLoginPassword() {
        return defaultLoginPassword;
    }

    public void setDefaultLoginPassword(String defaultLoginPassword) {
        this.defaultLoginPassword = defaultLoginPassword;
    }
}
