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

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.LocationScope;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("location")
public class Location extends AbstractEntity<Location> {

    private Long cloud;
    private String cloudUuid;
    private Long parent;
    private LocationScope locationScope;
    private Boolean isAssignable;
    private Long geoLocation;

    public Location(@Nullable List<Link> links, Long cloud, String cloudUuid, Long parent, LocationScope locationScope, Boolean isAssignable, Long geoLocation) {
        super(links);
        this.cloud = cloud;
        this.cloudUuid = cloudUuid;
        this.parent = parent;
        this.locationScope = locationScope;
        this.isAssignable = isAssignable;
        this.geoLocation = geoLocation;
    }

    public Location(Long cloud, String cloudUuid, Long parent, LocationScope locationScope, Boolean isAssignable, Long geoLocation) {
        this(null, cloud, cloudUuid, parent, locationScope, isAssignable, geoLocation);
    }

    protected Location() {
    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
    }

    public String getCloudUuid() {
        return cloudUuid;
    }

    public void setCloudUuid(String cloudUuid) {
        this.cloudUuid = cloudUuid;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public LocationScope getLocationScope() {
        return locationScope;
    }

    public void setLocationScope(LocationScope locationScope) {
        this.locationScope = locationScope;
    }

    public Boolean getIsAssignable() {
        return isAssignable;
    }

    public void setIsAssignable(Boolean isAssignable) {
        this.isAssignable = isAssignable;
    }

    public Long getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(Long geoLocation) {
        this.geoLocation = geoLocation;
    }

    @Override public int compareTo(Location o) {
        //ignoring cloouduuid, correct?
        if(this.getCloud().equals(o.getCloud()) &&
            this.getIsAssignable().equals(o.getIsAssignable()) &&
            this.getGeoLocation().equals(o.getGeoLocation()) &&
            this.getLocationScope().equals(o.getLocationScope()) &&
            this.getParent().equals(o.getParent())) {
            return 0;
        }

        return -1;
    }
}
