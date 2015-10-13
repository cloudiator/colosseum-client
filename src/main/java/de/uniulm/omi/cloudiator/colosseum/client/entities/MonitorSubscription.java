/*
 * Copyright (c) 2014-2015 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.FilterType;
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.SubscriptionType;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 05.08.2015.
 */
@Path("monitorSubscription")
public class MonitorSubscription extends AbstractEntity {
    private Long monitor;
    private String endpoint;
    private SubscriptionType type;
    private FilterType filterType;
    private Double filterValue;

    public MonitorSubscription(@Nullable List<Link> link, Long monitor, String endpoint,
        SubscriptionType type, FilterType filterType, Double filterValue) {
        super(link);
        this.monitor = monitor;
        this.endpoint = endpoint;
        this.type = type;
        this.filterType = filterType;
        this.filterValue = filterValue;
    }

    public MonitorSubscription(Long monitor, String endpoint, SubscriptionType type,
        FilterType filterType, Double filterValue) {
        this.monitor = monitor;
        this.endpoint = endpoint;
        this.type = type;
        this.filterType = filterType;
        this.filterValue = filterValue;
    }

    protected MonitorSubscription(){

    }

    public Long getMonitor() {
        return monitor;
    }

    public void setMonitor(Long monitor) {
        this.monitor = monitor;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public SubscriptionType getType() {
        return type;
    }

    public void setType(SubscriptionType type) {
        this.type = type;
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public Double getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(Double filterValue) {
        this.filterValue = filterValue;
    }

    @Override public int hashCode() {
        int result = monitor != null ? monitor.hashCode() : 0;
        result = 31 * result + (endpoint != null ? endpoint.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (filterType != null ? filterType.hashCode() : 0);
        result = 31 * result + (filterValue != null ? filterValue.hashCode() : 0);
        return result;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        MonitorSubscription that = (MonitorSubscription) o;

        if (endpoint != null ? !endpoint.equals(that.endpoint) : that.endpoint != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null)
            return false;
        if (monitor != null ? !monitor.equals(that.monitor) : that.monitor != null)
            return false;
        if (filterType != null ? !filterType.equals(that.filterType) : that.filterType != null)
            return false;
        if (filterValue != null ? !filterValue.equals(that.filterValue) : that.filterValue != null)
            return false;

        return true;
    }
}
