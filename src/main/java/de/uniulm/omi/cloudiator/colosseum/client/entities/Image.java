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

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("image")
public class Image extends NamedEntity {

    private String cloudUuid;
    private Long cloud;
    private List<Long> locations;
    private Long operatingSystem;
    private List<Long> cloudCredentials;

    public Image(@Nullable List<Link> links, String name, String cloudUuid, Long cloud, List<Long> locations, Long operatingSystem, List<Long> cloudCredentials) {
        super(links, name);
        this.cloudUuid = cloudUuid;
        this.cloud = cloud;
        this.locations = locations;
        this.operatingSystem = operatingSystem;
        this.cloudCredentials = cloudCredentials;
    }

    public Image(String name, String cloudUuid, Long cloud, List<Long> locations, Long operatingSystem, List<Long> cloudCredentials) {
        this(null, name, cloudUuid, cloud, locations, operatingSystem, cloudCredentials);
    }

    protected Image() {
    }

    public String getCloudUuid() {
        return cloudUuid;
    }

    public void setCloudUuid(String cloudUuid) {
        this.cloudUuid = cloudUuid;
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
        //ignore list of credentials and locations, right?
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;

        Image image = (Image) o;

        if (cloud != null ? !cloud.equals(image.cloud) : image.cloud != null)
            return false;
        // ignore clouduuid:
        //if (cloudUuid != null ? !cloudUuid.equals(image.cloudUuid) : image.cloudUuid != null)
        //    return false;
        if (operatingSystem != null ?
            !operatingSystem.equals(image.operatingSystem) :
            image.operatingSystem != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        // ignore locations, right?
        int result = super.hashCode();
        // ignore clouduuid: result = 31 * result + (cloudUuid != null ? cloudUuid.hashCode() : 0);
        result = 31 * result + (cloud != null ? cloud.hashCode() : 0);
        result = 31 * result + (operatingSystem != null ? operatingSystem.hashCode() : 0);
        return result;
    }
}
