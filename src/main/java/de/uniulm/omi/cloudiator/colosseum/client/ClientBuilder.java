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

package de.uniulm.omi.cloudiator.colosseum.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AuthenticationFilter;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Credential;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import org.glassfish.jersey.filter.LoggingFilter;

/**
 * Created by daniel on 21.01.15.
 */
public class ClientBuilder {

  private String url;
  private Credential credentials;
  private Logger logger;

  private ClientBuilder() {
  }

  public static ClientBuilder getNew() {
    return new ClientBuilder();
  }

  public ClientBuilder url(String url) {
    this.url = url;
    return this;
  }

  public ClientBuilder credentials(String email, String tenant, String password) {
    this.credentials = new Credential(email, tenant, password);
    return this;
  }

  public ClientBuilder logger(Logger logger) {
    this.logger = logger;
    return this;
  }

  public de.uniulm.omi.cloudiator.colosseum.client.Client build() {
    if (this.logger == null) {
      this.logger = Logger.getGlobal();
    }

    final Client client =
        javax.ws.rs.client.ClientBuilder.newBuilder().register(JacksonJsonProvider.class)
            .register(new LoggingFilter(this.logger, true))
            .register(new AuthenticationFilter(this.credentials, this.url)).build();
    return new de.uniulm.omi.cloudiator.colosseum.client.Client(client, this.url);
  }

}
