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

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by frank on 21.01.15.
 */
@Path("geo")
public class GeoLocation extends AbstractEntity {

  private String region;
  private String city;
  private String country;
  private String iso3166;
  private Float locationLatitude;
  private Float LocationLongitude;

  public GeoLocation(@Nullable List<Link> links, String region, String city, String country,
      String iso3166, Float locationLatitude, Float locationLongitude) {
    super(links);
    this.region = region;
    this.city = city;
    this.country = country;
    this.iso3166 = iso3166;
    this.locationLatitude = locationLatitude;
    this.LocationLongitude = locationLongitude;
  }

  public GeoLocation(String region, String city, String country, String iso3166,
      Float locationLatitude, Float locationLongitude) {
    this(null, region, city, country, iso3166, locationLatitude, locationLongitude);
  }

  protected GeoLocation() {
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getIso3166() {
    return iso3166;
  }

  public void setIso3166(String iso3166) {
    this.iso3166 = iso3166;
  }

  public Float getLocationLatitude() {
    return locationLatitude;
  }

  public void setLocationLatitude(Float locationLatitude) {
    this.locationLatitude = locationLatitude;
  }

  public Float getLocationLongitude() {
    return LocationLongitude;
  }

  public void setLocationLongitude(Float locationLongitude) {
    LocationLongitude = locationLongitude;
  }
}
