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

package de.uniulm.omi.cloudiator.colosseum.client;

import de.uniulm.omi.cloudiator.colosseum.client.entities.Cloud;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Entity;

/**
 * Created by Frank on 29.05.2015.
 */
public class Client {

    private final javax.ws.rs.client.Client client;
    private final String baseUrl;

    Client(javax.ws.rs.client.Client client, String baseUrl) {
        this.client = client;
        this.baseUrl = baseUrl;
    }

    public <T extends Entity> ClientController<T> controller(Class<T> clazz) {
        return new ClientController<>(this.client, this.baseUrl, clazz);
    }
}
