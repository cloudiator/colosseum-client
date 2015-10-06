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

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedRemoteEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("image") public class Image extends NamedRemoteEntity {

    private Long cloud;
    private Long location;
    private Long operatingSystem;
    private List<Long> cloudCredentials;
    private String defaultLoginUsername;

    public Image(@Nullable List<Link> links, String remoteId, String cloudProviderId, String name,
        Long cloud, Long location, Long operatingSystem, List<Long> cloudCredentials,
        String defaultLoginUsername) {
        super(links, remoteId, cloudProviderId, name);
        this.cloud = cloud;
        this.location = location;
        this.operatingSystem = operatingSystem;
        this.cloudCredentials = cloudCredentials;
        this.defaultLoginUsername = defaultLoginUsername;
    }

    public Image(String remoteId, String cloudProviderId, String name, Long cloud,
        Long location, Long operatingSystem, List<Long> cloudCredentials,
        String defaultLoginUsername) {
        this(null, remoteId, cloudProviderId, name, cloud, location, operatingSystem,
            cloudCredentials, defaultLoginUsername);
    }

    protected Image() {
    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
    }

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public Long getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(Long operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public List<Long> getCloudCredentials() {
        return cloudCredentials;
    }

    public void setCloudCredentials(List<Long> cloudCredentials) {
        this.cloudCredentials = cloudCredentials;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Image))
            return false;
        if (!super.equals(o))
            return false;

        Image image = (Image) o;

        if (cloud != null ? !cloud.equals(image.cloud) : image.cloud != null)
            return false;
        if (location != null ? !location.equals(image.location) : image.location != null)
            return false;
        if (operatingSystem != null ?
            !operatingSystem.equals(image.operatingSystem) :
            image.operatingSystem != null)
            return false;
        if (cloudCredentials != null ?
            !cloudCredentials.equals(image.cloudCredentials) :
            image.cloudCredentials != null)
            return false;
        return !(defaultLoginUsername != null ?
            !defaultLoginUsername.equals(image.defaultLoginUsername) :
            image.defaultLoginUsername != null);

    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cloud != null ? cloud.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (operatingSystem != null ? operatingSystem.hashCode() : 0);
        result = 31 * result + (cloudCredentials != null ? cloudCredentials.hashCode() : 0);
        result = 31 * result + (defaultLoginUsername != null ? defaultLoginUsername.hashCode() : 0);
        return result;
    }

    public String getDefaultLoginUsername() {
        return defaultLoginUsername;
    }

    public void setDefaultLoginUsername(String defaultLoginUsername) {
        this.defaultLoginUsername = defaultLoginUsername;
    }
}
