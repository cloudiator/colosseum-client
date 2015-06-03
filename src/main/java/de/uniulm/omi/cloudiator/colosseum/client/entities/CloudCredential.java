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
@Path("cloudCredential")
public class CloudCredential extends AbstractEntity {

    private String user;
    private String secret;
    private Long cloud;
    private Long frontendGroup;

    public CloudCredential(@Nullable List<Link> links, String user, String secret, Long cloud, Long frontendGroup) {
        super(links);
        this.user = user;
        this.secret = secret;
        this.cloud = cloud;
        this.frontendGroup = frontendGroup;
    }

    public CloudCredential(String user, String secret, Long cloud, Long frontendGroup) {
        this(null, user, secret, cloud, frontendGroup);
    }

    protected CloudCredential() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
    }

    public Long getFrontendGroup() {
        return frontendGroup;
    }

    public void setFrontendGroup(Long frontendGroup) {
        this.frontendGroup = frontendGroup;
    }

    @Override public boolean equals(Object o) {
        //ignore secret, right?
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        CloudCredential that = (CloudCredential) o;

        if (cloud != null ? !cloud.equals(that.cloud) : that.cloud != null)
            return false;
        if (frontendGroup != null ?
            !frontendGroup.equals(that.frontendGroup) :
            that.frontendGroup != null)
            return false;
        if (user != null ? !user.equals(that.user) : that.user != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (cloud != null ? cloud.hashCode() : 0);
        result = 31 * result + (frontendGroup != null ? frontendGroup.hashCode() : 0);
        return result;
    }
}
