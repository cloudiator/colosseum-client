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

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by daniel on 22.01.15.
 */
public class Credential {

  private String email;
  private String tenant;
  private String password;

  public Credential(String email, String password, String tenant) {
    checkNotNull(email);
    checkArgument(!email.isEmpty());
    checkNotNull(password);
    checkArgument(!password.isEmpty());
    checkNotNull(tenant);
    checkArgument(!tenant.isEmpty());
    this.email = email;
    this.password = password;
    this.tenant = tenant;
  }

  protected Credential() {

  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    checkNotNull(email);
    checkArgument(!email.isEmpty());
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    checkNotNull(password);
    checkArgument(!password.isEmpty());
    this.password = password;
  }

  public String getTenant() {
    return tenant;
  }

  public void setTenant(String tenant) {
    this.tenant = tenant;
  }
}
