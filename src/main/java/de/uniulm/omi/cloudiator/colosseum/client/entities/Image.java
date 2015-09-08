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
    private List<Long> locations;
    private Long operatingSystem;
    private List<Long> cloudCredentials;
    private String defaultUsername;

    public Image(@Nullable List<Link> links, String remoteId, String cloudProviderId, String name,
        Long cloud, List<Long> locations, Long operatingSystem, List<Long> cloudCredentials,
        String defaultUsername) {
        super(links, remoteId, cloudProviderId, name);
        this.cloud = cloud;
        this.locations = locations;
        this.operatingSystem = operatingSystem;
        this.cloudCredentials = cloudCredentials;
        this.defaultUsername = defaultUsername;
    }

    public Image(String remoteId, String cloudProviderId, String name, Long cloud,
        List<Long> locations, Long operatingSystem, List<Long> cloudCredentials,
        String defaultUsername) {
        this(null, remoteId, cloudProviderId, name, cloud, locations, operatingSystem,
            cloudCredentials, defaultUsername);
    }

    protected Image() {
    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
    }

    public List<Long> getLocations() {
        return locations;
    }

    public void setLocations(List<Long> locations) {
        this.locations = locations;
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
        if (locations != null ? !locations.equals(image.locations) : image.locations != null)
            return false;
        if (operatingSystem != null ?
            !operatingSystem.equals(image.operatingSystem) :
            image.operatingSystem != null)
            return false;
        if (cloudCredentials != null ?
            !cloudCredentials.equals(image.cloudCredentials) :
            image.cloudCredentials != null)
            return false;
        return !(defaultUsername != null ?
            !defaultUsername.equals(image.defaultUsername) :
            image.defaultUsername != null);

    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cloud != null ? cloud.hashCode() : 0);
        result = 31 * result + (locations != null ? locations.hashCode() : 0);
        result = 31 * result + (operatingSystem != null ? operatingSystem.hashCode() : 0);
        result = 31 * result + (cloudCredentials != null ? cloudCredentials.hashCode() : 0);
        result = 31 * result + (defaultUsername != null ? defaultUsername.hashCode() : 0);
        return result;
    }
}
