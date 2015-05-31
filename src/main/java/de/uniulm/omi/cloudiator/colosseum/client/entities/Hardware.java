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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("hardware")
public class Hardware extends AbstractEntity<Hardware> {

    private Long cloud;
    private Long hardwareOffer;
    private String cloudUuid;
    private List<Long> locations;

    public Hardware(@Nullable List<Link> links, Long cloud, Long hardwareOffer, String cloudUuid, List<Long> locations) {
        super(links);
        this.cloud = cloud;
        this.hardwareOffer = hardwareOffer;
        this.cloudUuid = cloudUuid;
        this.locations = locations;
    }

    public Hardware(Long cloud, Long hardwareOffer, String cloudUuid, List<Long> locations) {
        this(null, cloud, hardwareOffer, cloudUuid, locations);
    }

    protected Hardware() {
    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
    }

    public Long getHardwareOffer() {
        return hardwareOffer;
    }

    public void setHardwareOffer(Long hardwareOffer) {
        this.hardwareOffer = hardwareOffer;
    }

    public String getCloudUuid() {
        return cloudUuid;
    }

    public void setCloudUuid(String cloudUuid) {
        this.cloudUuid = cloudUuid;
    }

    public List<Long> getLocations() {
        return locations;
    }

    public void setLocations(List<Long> locations) {
        this.locations = locations;
    }

    @Override public int compareTo(Hardware o) {
        //ignoring cloouduuid, correct?
        if(this.getCloud().equals(o.getCloud()) &&
            this.getHardwareOffer().equals(o.getHardwareOffer()) &&
            this.getLocations().containsAll(o.getLocations()) &&
            o.getLocations().containsAll(this.getLocations())) {

//            Boolean allLocationsSame = true;
//
//            for (Long loc : this.getLocations()){
//                Boolean currentLocExists = false;
//                for(Long loc2 : o.getLocations()){
//                    if(loc.equals(loc2)){
//                        currentLocExists = true;
//                    }
//                }
//
//                if (currentLocExists == false) {
//                    allLocationsSame = false;
//                    break;
//                }
//            }
//
//            for (Long loc : o.getLocations()){
//                Boolean currentLocExists = false;
//                for(Long loc2 : this.getLocations()){
//                    if(loc.equals(loc2)){
//                        currentLocExists = true;
//                        continue;
//                    }
//                }
//
//                if (currentLocExists == false) {
//                    allLocationsSame = false;
//                    break;
//                }
//            }
//
//            if(allLocationsSame) {
//                return 0;
//            }
        }

        return -1;
    }
}
