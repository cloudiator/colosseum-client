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

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.OperatingSystemArchitecture;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("os")
public class OperatingSystem extends AbstractEntity<OperatingSystem> {

    private OperatingSystemArchitecture operatingSystemArchitecture;
    private Long operatingSystemVendor;
    private String version;

    public OperatingSystem(@Nullable List<Link> links, OperatingSystemArchitecture operatingSystemArchitecture, Long operatingSystemVendor, String version) {
        super(links);
        this.operatingSystemArchitecture = operatingSystemArchitecture;
        this.operatingSystemVendor = operatingSystemVendor;
        this.version = version;
    }

    public OperatingSystem(OperatingSystemArchitecture operatingSystemArchitecture, Long operatingSystemVendor, String version) {
        this(null, operatingSystemArchitecture, operatingSystemVendor, version);
    }

    protected OperatingSystem() {
    }

    public OperatingSystemArchitecture getOperatingSystemArchitecture() {
        return operatingSystemArchitecture;
    }

    public void setOperatingSystemArchitecture(OperatingSystemArchitecture operatingSystemArchitecture) {
        this.operatingSystemArchitecture = operatingSystemArchitecture;
    }

    public Long getOperatingSystemVendor() {
        return operatingSystemVendor;
    }

    public void setOperatingSystemVendor(Long operatingSystemVendor) {
        this.operatingSystemVendor = operatingSystemVendor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override public int compareTo(OperatingSystem o) {
        //ignoring cloouduuid, correct?
        if(this.getOperatingSystemArchitecture().equals(o.getOperatingSystemArchitecture()) &&
            this.getOperatingSystemVendor().equals(o.getOperatingSystemVendor()) &&
            this.getVersion().equals(o.getVersion())) {
            return 0;
        }

        return -1;
    }
}
