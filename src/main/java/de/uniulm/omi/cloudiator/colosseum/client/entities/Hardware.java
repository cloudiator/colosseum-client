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

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("hardware")
public class Hardware extends AbstractEntity {

    private Long cloud;
    private Long hardwareOffer;
    private String remoteId;
    private List<Long> locations;
    private List<Long> cloudCredentials;

    public Hardware(@Nullable List<Link> links, Long cloud, Long hardwareOffer, String remoteId, List<Long> locations, List<Long> cloudCredentials) {
        super(links);
        this.cloud = cloud;
        this.hardwareOffer = hardwareOffer;
        this.remoteId = remoteId;
        this.locations = locations;
        this.cloudCredentials = cloudCredentials;
    }

    public Hardware(Long cloud, Long hardwareOffer, String remoteId, List<Long> locations, List<Long> cloudCredentials) {
        this(null, cloud, hardwareOffer, remoteId, locations, cloudCredentials);
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

    public String getRemoteId() {
        return remoteId;
    }

    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
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
        //ignore list of credentials and locations, right?
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Hardware hardware = (Hardware) o;

        if (cloud != null ? !cloud.equals(hardware.cloud) : hardware.cloud != null)
            return false;
        //ignore clouduuid:
        //if (remoteId != null ? !remoteId.equals(hardware.remoteId) : hardware.remoteId != null)
        //    return false;
        if (hardwareOffer != null ?
            !hardwareOffer.equals(hardware.hardwareOffer) :
            hardware.hardwareOffer != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = cloud != null ? cloud.hashCode() : 0;
        result = 31 * result + (hardwareOffer != null ? hardwareOffer.hashCode() : 0);
        //ignore clouduuid:
        //result = 31 * result + (remoteId != null ? remoteId.hashCode() : 0);
        return result;
    }
}
