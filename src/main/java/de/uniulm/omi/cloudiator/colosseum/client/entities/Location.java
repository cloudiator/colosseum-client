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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.RemoteEntityInCloud;
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

  public Location(List<Link> links, String remoteId, RemoteState remoteState, String providerId,
      String swordId, Long cloud, List<Long> cloudCredentials, Long owner, Long parent,
      LocationScope locationScope, Boolean isAssignable, Long geoLocation, String name) {
    super(links, remoteId, remoteState, providerId, swordId, cloud, cloudCredentials, owner);
    this.parent = parent;
    this.locationScope = locationScope;
    this.isAssignable = isAssignable;
    this.geoLocation = geoLocation;
    this.name = name;
  }

  public Location(String remoteId, RemoteState remoteState, String providerId, String swordId,
      Long cloud, List<Long> cloudCredentials, Long owner, Long parent,
      LocationScope locationScope, Boolean isAssignable, Long geoLocation, String name) {
    this(null, remoteId, remoteState, providerId, swordId, cloud, cloudCredentials, owner,
        parent, locationScope, isAssignable, geoLocation, name);
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
}
