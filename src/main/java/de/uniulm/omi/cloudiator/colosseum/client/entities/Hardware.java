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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.RemoteEntity;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("hardware")
public class Hardware extends RemoteEntity {

    private Long cloud;
    private Long hardwareOffer;
    private List<Long> locations;
    private List<Long> cloudCredentials;

    public Hardware(@Nullable List<Link> links, String remoteId, String cloudProviderId, Long cloud, Long hardwareOffer, List<Long> locations, List<Long> cloudCredentials) {
        super(links, remoteId, cloudProviderId);
        this.cloud = cloud;
        this.hardwareOffer = hardwareOffer;
        this.locations = locations;
        this.cloudCredentials = cloudCredentials;
    }

    public Hardware(String remoteId, String cloudProviderId, Long cloud, Long hardwareOffer, List<Long> locations, List<Long> cloudCredentials) {
        this(null, remoteId, cloudProviderId, cloud, hardwareOffer, locations, cloudCredentials);
    }

    protected Hardware() {
    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
    }

    public Long getHardwareOffer() {
        return hardwareOffer;
    }

    public void setHardwareOffer(Long hardwareOffer) {
        this.hardwareOffer = hardwareOffer;
    }

    public List<Long> getLocations() {
        return locations;
    }

    public void setLocations(List<Long> locations) {
        this.locations = locations;
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
        if (!(o instanceof Hardware))
            return false;
        if (!super.equals(o))
            return false;

        Hardware hardware = (Hardware) o;

        //TODO ignore cloud for comparing?
//        if (cloud != null ? !cloud.equals(hardware.cloud) : hardware.cloud != null)
//            return false;
//        if (cloudCredentials != null ?
//            !cloudCredentials.equals(hardware.cloudCredentials) :
//            hardware.cloudCredentials != null)
//            return false;
        if (hardwareOffer != null ?
            !hardwareOffer.equals(hardware.hardwareOffer) :
            hardware.hardwareOffer != null)
            return false;
        //ignore locations
        //if (locations != null ? !locations.equals(hardware.locations) : hardware.locations != null)
        //    return false;

        return true;
    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cloud != null ? cloud.hashCode() : 0);
        result = 31 * result + (hardwareOffer != null ? hardwareOffer.hashCode() : 0);
        result = 31 * result + (locations != null ? locations.hashCode() : 0);
        result = 31 * result + (cloudCredentials != null ? cloudCredentials.hashCode() : 0);
        return result;
    }
}
