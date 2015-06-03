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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("virtualMachine")
public class VirtualMachine extends NamedEntity {

    private Long cloud;
    private Long image;
    private Long hardware;
    private Long location;
    private String cloudUuid;

    public VirtualMachine(@Nullable List<Link> links, String name, Long cloud, Long image, Long hardware, Long location, String cloudUuid) {
        super(links, name);
        this.cloud = cloud;
        this.image = image;
        this.hardware = hardware;
        this.location = location;
        this.cloudUuid = cloudUuid;
    }

    public VirtualMachine(String name, Long cloud, Long image, Long hardware, Long location, String cloudUuid) {
        this(null, name, cloud, image, hardware, location, cloudUuid);
    }

    protected VirtualMachine() {
    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
    }

    public Long getImage() {
        return image;
    }

    public void setImage(Long image) {
        this.image = image;
    }

    public Long getHardware() {
        return hardware;
    }

    public void setHardware(Long hardware) {
        this.hardware = hardware;
    }

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public String getCloudUuid() {
        return cloudUuid;
    }

    public void setCloudUuid(String cloudUuid) {
        this.cloudUuid = cloudUuid;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;

        VirtualMachine that = (VirtualMachine) o;

        if (cloud != null ? !cloud.equals(that.cloud) : that.cloud != null)
            return false;
        if (hardware != null ?
            !hardware.equals(that.hardware) :
            that.hardware != null)
            return false;
        if (image != null ? !image.equals(that.image) : that.image != null)
            return false;
        if (location != null ?
            !location.equals(that.location) :
            that.location != null)
            return false;
        // ignore cloudUuid
        //if (cloudUuid != null ? !cloudUuid.equals(that.cloudUuid) : that.cloudUuid != null)
        //    return false;

        return true;
    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cloud != null ? cloud.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (hardware != null ? hardware.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (cloudUuid != null ? cloudUuid.hashCode() : 0);
        return result;
    }
}
