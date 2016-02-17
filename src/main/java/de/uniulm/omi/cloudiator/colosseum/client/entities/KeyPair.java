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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.RemoteEntityInCloud;

import java.util.List;

/**
 * Created by Frank on 17.02.2016.
 */
@Path("keyPair")
public class KeyPair extends RemoteEntityInCloud {

    private String privateKey;
    private String publicKey;
    private Long virtualMachine;

    public KeyPair(List<Link> links, String remoteId, RemoteState remoteState, String cloudProviderId, Long cloud,
                    List<Long> cloudCredentials, Long owner, String privateKey, String publicKey, Long virtualMachine) {
        super(links, remoteId, remoteState, cloudProviderId, cloud, cloudCredentials, owner);
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        this.virtualMachine = virtualMachine;
    }

    public KeyPair(String remoteId, RemoteState remoteState, String cloudProviderId, Long cloud,
                    List<Long> cloudCredentials, Long owner, String privateKey, String publicKey,
                    Long virtualMachine) {
        this(null, remoteId, remoteState, cloudProviderId, cloud,
                cloudCredentials, owner, privateKey, publicKey, virtualMachine);
    }

    protected KeyPair() {
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public Long getVirtualMachine() {
        return virtualMachine;
    }

    public void setVirtualMachine(Long virtualMachine) {
        this.virtualMachine = virtualMachine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KeyPair)) return false;
        if (!super.equals(o)) return false;

        KeyPair keyPair = (KeyPair) o;

        return !(virtualMachine != null ? !virtualMachine.equals(keyPair.virtualMachine) : keyPair.virtualMachine != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (virtualMachine != null ? virtualMachine.hashCode() : 0);
        return result;
    }
}
