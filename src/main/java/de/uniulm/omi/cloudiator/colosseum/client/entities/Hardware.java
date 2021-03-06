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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedRemoteEntityInLocation;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by frank on 21.01.15.
 */
@Path("hardware")
public class Hardware extends NamedRemoteEntityInLocation {

  private Long hardwareOffer;

  public Hardware(@Nullable List<Link> links, String remoteId, RemoteState remoteState,
      String providerId, String swordId, Long cloud, List<Long> cloudCredentials, Long owner,
      Long location, String name, Long hardwareOffer) {
    super(links, remoteId, remoteState, providerId, swordId, cloud, cloudCredentials, owner,
        location, name);
    this.hardwareOffer = hardwareOffer;
  }

  public Hardware(String remoteId, RemoteState remoteState, String providerId, String swordId,
      Long cloud, List<Long> cloudCredentials, Long owner, Long location, String name,
      Long hardwareOffer) {
    this(null, remoteId, remoteState, providerId, swordId, cloud, cloudCredentials, owner,
        location, name, hardwareOffer);
  }

  protected Hardware() {
  }

  public Long getHardwareOffer() {
    return hardwareOffer;
  }

  public void setHardwareOffer(Long hardwareOffer) {
    this.hardwareOffer = hardwareOffer;
  }
}
