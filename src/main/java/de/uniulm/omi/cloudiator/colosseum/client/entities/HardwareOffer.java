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
@Path("hardwareOffer")
public class HardwareOffer extends AbstractEntity {

    private Integer numberOfCores;
    private Long mbOfRam;
    private Long localDiskSpace;

    public HardwareOffer(@Nullable List<Link> links, Integer numberOfCores, Long mbOfRam, Long localDiskSpace) {
        super(links);
        this.numberOfCores = numberOfCores;
        this.mbOfRam = mbOfRam;
        this.localDiskSpace = localDiskSpace;
    }

    public HardwareOffer(Integer numberOfCores, Long mbOfRam, Long localDiskSpace) {
        this(null, numberOfCores, mbOfRam, localDiskSpace);
    }

    protected HardwareOffer() {
    }

    public Integer getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public Long getMbOfRam() {
        return mbOfRam;
    }

    public void setMbOfRam(Long mbOfRam) {
        this.mbOfRam = mbOfRam;
    }

    public Long getLocalDiskSpace() {
        return localDiskSpace;
    }

    public void setLocalDiskSpace(Long localDiskSpace) {
        this.localDiskSpace = localDiskSpace;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        HardwareOffer that = (HardwareOffer) o;

        if (localDiskSpace != null ?
            !localDiskSpace.equals(that.localDiskSpace) :
            that.localDiskSpace != null)
            return false;
        if (mbOfRam != null ? !mbOfRam.equals(that.mbOfRam) : that.mbOfRam != null)
            return false;
        if (numberOfCores != null ?
            !numberOfCores.equals(that.numberOfCores) :
            that.numberOfCores != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = numberOfCores != null ? numberOfCores.hashCode() : 0;
        result = 31 * result + (mbOfRam != null ? mbOfRam.hashCode() : 0);
        result = 31 * result + (localDiskSpace != null ? localDiskSpace.hashCode() : 0);
        return result;
    }
}
