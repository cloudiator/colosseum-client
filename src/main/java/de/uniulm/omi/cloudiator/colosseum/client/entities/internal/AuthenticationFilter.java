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

package de.uniulm.omi.cloudiator.colosseum.client.entities.internal;

import static com.google.common.base.Preconditions.checkState;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import java.io.IOException;
import javax.annotation.Nullable;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.MediaType;

/**
 * @todo The authentication should be probably rewritten, that
 * the client only tries to authenticate when he receives a 402
 * back from the server. This would avoid this time sync stuff.
 * <p>
 * Alternative: always create a new token. This could however induce
 * load on the server and lead to massive drain of entropy?
 */
public class AuthenticationFilter implements ClientRequestFilter {

  private final Credential credential;
  private final String baseUrl;
  @Nullable
  private TokenStore token;

  public AuthenticationFilter(final Credential credential, final String baseUrl) {
    this.credential = credential;
    this.baseUrl = baseUrl;
  }

  protected Token getToken() {
    if (this.token == null || this.token.isTokenExpired()) {
      this.authenticate();
    }
    return this.token.getToken();
  }

  private void authenticate() {
    long timeBeforeRequest = System.currentTimeMillis();
    Token token = ClientBuilder.newBuilder().register(JacksonJsonProvider.class).build()
        .target(this.baseUrl + "/login").request(MediaType.APPLICATION_JSON_TYPE).post(
            javax.ws.rs.client.Entity.entity(this.credential, MediaType.APPLICATION_JSON_TYPE))
        .readEntity(Token.class);
    this.token = new TokenStore(token, timeBeforeRequest);
  }

  @Override
  public void filter(ClientRequestContext requestContext) throws IOException {
    requestContext.getHeaders().add("X-Auth-Token", this.getToken().getToken());
    requestContext.getHeaders().add("X-Auth-UserId", this.getToken().getUserId());
    requestContext.getHeaders().add("X-Tenant", this.credential.getTenant());
  }

  /**
   * This class stores the token and a timestamp
   * to work around time synchronization on server
   * and client.
   */
  private static class TokenStore {

    /**
     * A buffer avoiding short time failures
     */
    private static final double TOKEN_PERCENTAGE = 0.7;

    private final Token token;
    private final long timestamp;

    private TokenStore(Token token, long timestamp) {
      this.token = token;
      this.timestamp = timestamp;
    }

    private boolean isTokenExpired() {
      //timespan that token is valid
      final double tokenTimespan =
          (Long.valueOf(token.getExpiresAt()) - Long.valueOf(token.getCreatedOn()))
              * TOKEN_PERCENTAGE;
      checkState(tokenTimespan > 0, "Illegal token validity.");
      //timespan expired on system since token creation
      double systemTimespan = System.currentTimeMillis() - timestamp;
      return systemTimespan >= tokenTimespan;
    }

    private Token getToken() {
      return token;
    }
  }
}
