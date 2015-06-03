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

import javax.annotation.Nullable;
import java.util.List;

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

    public GeoLocation(@Nullable List<Link> links, String region, String city, String country, String iso3166, Float locationLatitude, Float locationLongitude) {
        super(links);
        this.region = region;
        this.city = city;
        this.country = country;
        this.iso3166 = iso3166;
        this.locationLatitude = locationLatitude;
        this.LocationLongitude = locationLongitude;
    }

    public GeoLocation(String region, String city, String country, String iso3166, Float locationLatitude, Float locationLongitude) {
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

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        GeoLocation that = (GeoLocation) o;

        if (LocationLongitude != null ?
            !LocationLongitude.equals(that.LocationLongitude) :
            that.LocationLongitude != null)
            return false;
        if (city != null ? !city.equals(that.city) : that.city != null)
            return false;
        if (country != null ? !country.equals(that.country) : that.country != null)
            return false;
        if (iso3166 != null ? !iso3166.equals(that.iso3166) : that.iso3166 != null)
            return false;
        if (locationLatitude != null ?
            !locationLatitude.equals(that.locationLatitude) :
            that.locationLatitude != null)
            return false;
        if (region != null ? !region.equals(that.region) : that.region != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = region != null ? region.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (iso3166 != null ? iso3166.hashCode() : 0);
        result = 31 * result + (locationLatitude != null ? locationLatitude.hashCode() : 0);
        result = 31 * result + (LocationLongitude != null ? LocationLongitude.hashCode() : 0);
        return result;
    }
}
