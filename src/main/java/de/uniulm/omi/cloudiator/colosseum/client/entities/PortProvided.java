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

package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 02.09.2015.
 */
@Path("portProv")
public class PortProvided extends Port {
    private Integer port;

    public PortProvided(@Nullable List<Link> links, String name, Long applicationComponent, Integer port) {
        super(links, name, applicationComponent);
        this.port = port;
    }

    public PortProvided(String name, Long applicationComponent, Integer port) {
        this(null, name, applicationComponent, port);
    }

    protected PortProvided() {
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof PortProvided))
            return false;
        if (!super.equals(o))
            return false;

        PortProvided that = (PortProvided) o;

        return !(port != null ? !port.equals(that.port) : that.port != null);

    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (port != null ? port.hashCode() : 0);
        return result;
    }
}
