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
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.RemoteState;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.*;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("location")
public class Location extends RemoteEntityInCloud {

    private Long parent;
    private LocationScope locationScope;
    private Boolean isAssignable;
    private Long geoLocation;
    private String name;

    public Location(List<Link> links, String remoteId, RemoteState remoteState, Long cloud, String cloudProviderId,
                    List<Long> cloudCredentials, Long owner,Long parent, LocationScope locationScope,
                    Boolean isAssignable, Long geoLocation, String name) {
        super(links, remoteId, remoteState, cloud, cloudProviderId, cloudCredentials, owner);
        this.parent = parent;
        this.locationScope = locationScope;
        this.isAssignable = isAssignable;
        this.geoLocation = geoLocation;
        this.name = name;
    }

    public Location(String remoteId, RemoteState remoteState, Long cloud, String cloudProviderId,
                    List<Long> cloudCredentials, Long owner,Long parent, LocationScope locationScope,
                    Boolean isAssignable, Long geoLocation, String name) {
        this(null, remoteId, remoteState, cloud, cloudProviderId,
                cloudCredentials, owner, parent, locationScope,
                isAssignable, geoLocation, name);
    }

    protected Location() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Location))
            return false;
        if (!super.equals(o))
            return false;

        Location location = (Location) o;

        if (geoLocation != null ?
            !geoLocation.equals(location.geoLocation) :
            location.geoLocation != null)
            return false;
        if (isAssignable != null ?
            !isAssignable.equals(location.isAssignable) :
            location.isAssignable != null)
            return false;
        if (locationScope != location.locationScope)
            return false;
        if (parent != null ? !parent.equals(location.parent) : location.parent != null)
            return false;
        if (name != null ? !name.equals(location.name) : location.name != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        result = 31 * result + (locationScope != null ? locationScope.hashCode() : 0);
        result = 31 * result + (isAssignable != null ? isAssignable.hashCode() : 0);
        result = 31 * result + (geoLocation != null ? geoLocation.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
