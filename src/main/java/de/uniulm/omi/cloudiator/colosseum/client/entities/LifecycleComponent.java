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
public class LifecycleComponent extends NamedEntity<LifecycleComponent> {

    private String download;
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

    public LifecycleComponent(@Nullable List<Link> links, String name, String download, String init, String preInstall, String install, String postInstall, String start, String startDetection, String stopDetection, String preStart, String postStart, String preStop, String stop, String postStop, String shutdown) {
        super(links, name);
        this.download = download;
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

    public LifecycleComponent(String name, String download, String init, String preInstall, String install, String postInstall, String start, String startDetection, String stopDetection, String preStart, String postStart, String preStop, String stop, String postStop, String shutdown) {
        this(null, name, download, init, preInstall, install, postInstall, start, startDetection, stopDetection, preStart, postStart, preStop, stop, postStop, shutdown);
    }

    protected LifecycleComponent() {
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
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

    @Override public int compareTo(LifecycleComponent o) {
        if(this.getName().equals(o.getName()) &&
            this.getDownload().equals(o.getDownload()) &&
            this.getInit().equals(o.getInit()) &&
            this.getInstall().equals(o.getInstall()) &&
            this.getPostInstall().equals(o.getPostInstall()) &&
            this.getPreStart().equals(o.getPreStart()) &&
            this.getStart().equals(o.getStart()) &&
            this.getPreStop().equals(o.getPreStop()) &&
            this.getStop().equals(o.getStop()) &&
            this.getPostStop().equals(o.getPostStop()) &&
            this.getStartDetection().equals(o.getStartDetection()) &&
            this.getStopDetection().equals(o.getStopDetection()) &&
            this.getShutdown().equals(o.getShutdown())) {
            return 0;
        }

        return -1;
    }
}
