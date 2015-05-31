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

import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("fg")
public class FrontendGroup extends NamedEntity<FrontendGroup> {

    private List<Long> frontendUsers;

    public FrontendGroup(List<Link> links, String name, List<Long> frontendUsers) {
        super(links, name);
        this.frontendUsers = frontendUsers;
    }

    public FrontendGroup(String name, List<Long> frontendUsers) {
        this(null, name, frontendUsers);
    }

    protected FrontendGroup() {
    }

    public List<Long> getFrontendUsers() {
        return frontendUsers;
    }

    public void setFrontendUsers(List<Long> frontendUsers) {
        this.frontendUsers = frontendUsers;
    }

    @Override public int compareTo(FrontendGroup o) {
        //ignore users, so you dont have to get all to compare, right?
        if(this.getName().equals(o.getName())) {
            return 0;
        }

        return -1;
    }
}
