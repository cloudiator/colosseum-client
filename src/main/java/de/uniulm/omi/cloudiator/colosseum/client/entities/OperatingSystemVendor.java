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

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.OperatingSystemVendorType;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("osVendor")
public class OperatingSystemVendor extends NamedEntity<OperatingSystemVendor> {

    private OperatingSystemVendorType operatingSystemVendorType;

    public OperatingSystemVendor(@Nullable List<Link> links, String name, OperatingSystemVendorType operatingSystemVendorType) {
        super(links, name);
        this.operatingSystemVendorType = operatingSystemVendorType;
    }

    public OperatingSystemVendor(String name, OperatingSystemVendorType operatingSystemVendorType) {
        this(null, name, operatingSystemVendorType);
    }

    protected OperatingSystemVendor() {
    }

    public OperatingSystemVendorType getOperatingSystemVendorType() {
        return operatingSystemVendorType;
    }

    public void setOperatingSystemVendorType(OperatingSystemVendorType operatingSystemVendorType) {
        this.operatingSystemVendorType = operatingSystemVendorType;
    }

    @Override public int compareTo(OperatingSystemVendor o) {
        //ignoring cloouduuid, correct?
        if(this.getOperatingSystemVendorType().equals(o.getOperatingSystemVendorType()) &&
            this.getName().equals(o.getName())) {
            return 0;
        }

        return -1;
    }
}
