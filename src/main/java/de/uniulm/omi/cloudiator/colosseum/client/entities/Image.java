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
public class Image extends NamedEntity<Image> {

    private String cloudUuid;
    private Long cloud;
    private List<Long> locations;
    private Long operatingSystem;

    public Image(@Nullable List<Link> links, String name, String cloudUuid, Long cloud, List<Long> locations, Long operatingSystem) {
        super(links, name);
        this.cloudUuid = cloudUuid;
        this.cloud = cloud;
        this.locations = locations;
        this.operatingSystem = operatingSystem;
    }

    public Image(String name, String cloudUuid, Long cloud, List<Long> locations, Long operatingSystem) {
        this(null, name, cloudUuid, cloud, locations, operatingSystem);
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

    @Override public int compareTo(Image o) {
        //ignoring cloouduuid, correct?
        if(this.getCloud().equals(o.getCloud()) &&
            this.getName().equals(o.getName()) &&
            this.getOperatingSystem().equals(o.getOperatingSystem()) &&
            this.getLocations().containsAll(o.getLocations()) &&
            o.getLocations().containsAll(this.getLocations())) {
            return 0;
        }

        return -1;
    }
}
