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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("lifecycleComponent")
public class LifecycleComponent extends NamedEntity {

    private String init;
    private String preInstall;
    private String install;
    private String postInstall;
    private String start;
    private String startDetection;
    private String stopDetection;
    private String preStart;
    private String postStart;
    private String preStop;
    private String stop;
    private String postStop;
    private String shutdown;

    public LifecycleComponent(@Nullable List<Link> links, String name, String init, String preInstall, String install, String postInstall, String start, String startDetection, String stopDetection, String preStart, String postStart, String preStop, String stop, String postStop, String shutdown) {
        super(links, name);
        this.init = init;
        this.preInstall = preInstall;
        this.install = install;
        this.postInstall = postInstall;
        this.start = start;
        this.startDetection = startDetection;
        this.stopDetection = stopDetection;
        this.preStart = preStart;
        this.postStart = postStart;
        this.preStop = preStop;
        this.stop = stop;
        this.postStop = postStop;
        this.shutdown = shutdown;
    }

    public LifecycleComponent(String name, String init, String preInstall, String install, String postInstall, String start, String startDetection, String stopDetection, String preStart, String postStart, String preStop, String stop, String postStop, String shutdown) {
        this(null, name, init, preInstall, install, postInstall, start, startDetection, stopDetection, preStart, postStart, preStop, stop, postStop, shutdown);
    }

    protected LifecycleComponent() {
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public String getPreInstall() {
        return preInstall;
    }

    public void setPreInstall(String preInstall) {
        this.preInstall = preInstall;
    }

    public String getInstall() {
        return install;
    }

    public void setInstall(String install) {
        this.install = install;
    }

    public String getPostInstall() {
        return postInstall;
    }

    public void setPostInstall(String postInstall) {
        this.postInstall = postInstall;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStartDetection() {
        return startDetection;
    }

    public void setStartDetection(String startDetection) {
        this.startDetection = startDetection;
    }

    public String getStopDetection() {
        return stopDetection;
    }

    public void setStopDetection(String stopDetection) {
        this.stopDetection = stopDetection;
    }

    public String getPostStart() {
        return postStart;
    }

    public void setPostStart(String postStart) {
        this.postStart = postStart;
    }

    public String getPreStop() {
        return preStop;
    }

    public void setPreStop(String preStop) {
        this.preStop = preStop;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getPostStop() {
        return postStop;
    }

    public void setPostStop(String postStop) {
        this.postStop = postStop;
    }

    public String getShutdown() {
        return shutdown;
    }

    public void setShutdown(String shutdown) {
        this.shutdown = shutdown;
    }

    public String getPreStart() {
        return preStart;
    }

    public void setPreStart(String preStart) {
        this.preStart = preStart;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;

        LifecycleComponent that = (LifecycleComponent) o;

        if (init != null ? !init.equals(that.init) : that.init != null)
            return false;
        if (install != null ? !install.equals(that.install) : that.install != null)
            return false;
        if (postInstall != null ? !postInstall.equals(that.postInstall) : that.postInstall != null)
            return false;
        if (postStart != null ? !postStart.equals(that.postStart) : that.postStart != null)
            return false;
        if (postStop != null ? !postStop.equals(that.postStop) : that.postStop != null)
            return false;
        if (preInstall != null ? !preInstall.equals(that.preInstall) : that.preInstall != null)
            return false;
        if (preStart != null ? !preStart.equals(that.preStart) : that.preStart != null)
            return false;
        if (preStop != null ? !preStop.equals(that.preStop) : that.preStop != null)
            return false;
        if (shutdown != null ? !shutdown.equals(that.shutdown) : that.shutdown != null)
            return false;
        if (start != null ? !start.equals(that.start) : that.start != null)
            return false;
        if (startDetection != null ?
            !startDetection.equals(that.startDetection) :
            that.startDetection != null)
            return false;
        if (stop != null ? !stop.equals(that.stop) : that.stop != null)
            return false;
        if (stopDetection != null ?
            !stopDetection.equals(that.stopDetection) :
            that.stopDetection != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (init != null ? init.hashCode() : 0);
        result = 31 * result + (preInstall != null ? preInstall.hashCode() : 0);
        result = 31 * result + (install != null ? install.hashCode() : 0);
        result = 31 * result + (postInstall != null ? postInstall.hashCode() : 0);
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (startDetection != null ? startDetection.hashCode() : 0);
        result = 31 * result + (stopDetection != null ? stopDetection.hashCode() : 0);
        result = 31 * result + (preStart != null ? preStart.hashCode() : 0);
        result = 31 * result + (postStart != null ? postStart.hashCode() : 0);
        result = 31 * result + (preStop != null ? preStop.hashCode() : 0);
        result = 31 * result + (stop != null ? stop.hashCode() : 0);
        result = 31 * result + (postStop != null ? postStop.hashCode() : 0);
        result = 31 * result + (shutdown != null ? shutdown.hashCode() : 0);
        return result;
    }
}
