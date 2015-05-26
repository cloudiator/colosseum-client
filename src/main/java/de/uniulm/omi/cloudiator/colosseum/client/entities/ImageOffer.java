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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("imageOffer")
public class ImageOffer extends NamedEntity {

    private Long operatingSystem;

    public ImageOffer(@Nullable List<Link> links, String name, Long operatingSystem) {
        super(links, name);
        this.operatingSystem = operatingSystem;
    }

    public ImageOffer(String name, Long operatingSystem) {
        this(null, name, operatingSystem);
    }

    protected ImageOffer() {
    }

    public Long getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(Long operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
