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
@Path("tenant")
public class Tenant extends NamedEntity {

  private List<Long> frontendUsers;

  public Tenant(List<Link> links, String name, List<Long> frontendUsers) {
    super(links, name);
    this.frontendUsers = frontendUsers;
  }

  public Tenant(String name, List<Long> frontendUsers) {
    this(null, name, frontendUsers);
  }

  protected Tenant() {
  }

  public List<Long> getFrontendUsers() {
    return frontendUsers;
  }

  public void setFrontendUsers(List<Long> frontendUsers) {
    this.frontendUsers = frontendUsers;
  }
}
