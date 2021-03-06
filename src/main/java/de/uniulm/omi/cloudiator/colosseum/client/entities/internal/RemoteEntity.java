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

package de.uniulm.omi.cloudiator.colosseum.client.entities.internal;

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.RemoteState;
import java.util.List;
import java.util.Objects;

/**
 * Created by Frank on 18.08.2015.
 */
public abstract class RemoteEntity extends AbstractEntity {

  private String remoteId;
  private RemoteState remoteState;
  private String providerId;
  private String swordId;

  public RemoteEntity(List<Link> links, String remoteId, RemoteState remoteState, String providerId,
      String swordId) {
    super(links);
    this.remoteId = remoteId;
    this.remoteState = remoteState;
    this.providerId = providerId;
    this.swordId = swordId;
  }

  public RemoteEntity(String remoteId, RemoteState remoteState, String providerId, String swordId) {
    this(null, remoteId, remoteState, providerId, swordId);
  }

  protected RemoteEntity() {
  }

  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  public RemoteState getRemoteState() {
    return remoteState;
  }

  public void setRemoteState(RemoteState remoteState) {
    this.remoteState = remoteState;
  }

  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public String getSwordId() {
    return swordId;
  }

  public void setSwordId(String swordId) {
    this.swordId = swordId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RemoteEntity)) {
      return false;
    }
    RemoteEntity that = (RemoteEntity) o;
    return Objects.equals(remoteId, that.remoteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteId);
  }
}
