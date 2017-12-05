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

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.RemoteState;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.RemoteEntity;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by frank on 21.01.15.
 */
@Path("instance")
public class Instance extends RemoteEntity {

  private Long applicationComponent;
  private Long applicationInstance;
  private Long virtualMachine;

  public Instance(@Nullable List<Link> links, String remoteId, RemoteState remoteState,
      String providerId, String swordId, Long applicationComponent, Long applicationInstance,
      Long virtualMachine) {
    super(links, remoteId, remoteState, providerId, swordId);
    this.applicationComponent = applicationComponent;
    this.virtualMachine = virtualMachine;
    this.applicationInstance = applicationInstance;
  }

  public Instance(String remoteId, RemoteState remoteState, String providerId, String swordId,
      Long applicationComponent, Long applicationInstance, Long virtualMachine) {
    this(null, remoteId, remoteState, providerId, swordId, applicationComponent,
        applicationInstance, virtualMachine);
  }

  protected Instance() {
  }

  public Long getApplicationComponent() {
    return applicationComponent;
  }

  public void setApplicationComponent(Long applicationComponent) {
    this.applicationComponent = applicationComponent;
  }

  public Long getVirtualMachine() {
    return virtualMachine;
  }

  public void setVirtualMachine(Long virtualMachine) {
    this.virtualMachine = virtualMachine;
  }

  public Long getApplicationInstance() {
    return applicationInstance;
  }

  public void setApplicationInstance(Long applicationInstance) {
    this.applicationInstance = applicationInstance;
  }
}
