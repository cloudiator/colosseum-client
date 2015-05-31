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
@Path("communicationChannel")
public class CommunicationChannel extends AbstractEntity<CommunicationChannel> {

    private Long communication;
    private Long provider;
    private Long consumer;

    public CommunicationChannel(@Nullable List<Link> links, Long communication, Long provider, Long consumer) {
        super(links);
        this.communication = communication;
        this.provider = provider;
        this.consumer = consumer;
    }

    public CommunicationChannel(Long communication, Long provider, Long consumer) {
        this(null, communication, provider, consumer);
    }

    protected CommunicationChannel() {
    }

    public Long getCommunication() {
        return communication;
    }

    public void setCommunication(Long communication) {
        this.communication = communication;
    }

    public Long getProvider() {
        return provider;
    }

    public void setProvider(Long provider) {
        this.provider = provider;
    }

    public Long getConsumer() {
        return consumer;
    }

    public void setConsumer(Long consumer) {
        this.consumer = consumer;
    }

    @Override public int compareTo(CommunicationChannel o) {
        //ignore clouduuid, right?
        if(this.getCommunication().equals(o.getCommunication()) &&
            this.getProvider().equals(o.getProvider()) &&
            this.getConsumer().equals(o.getConsumer())) {
            return 0;
        }

        return -1;
    }
}
