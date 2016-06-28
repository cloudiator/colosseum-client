package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class LifecycleComponentBuilder {
    private String name;
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

    public LifecycleComponentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public LifecycleComponentBuilder init(String init) {
        this.init = init;
        return this;
    }

    public LifecycleComponentBuilder preInstall(String preInstall) {
        this.preInstall = preInstall;
        return this;
    }

    public LifecycleComponentBuilder install(String install) {
        this.install = install;
        return this;
    }

    public LifecycleComponentBuilder postInstall(String postInstall) {
        this.postInstall = postInstall;
        return this;
    }

    public LifecycleComponentBuilder start(String start) {
        this.start = start;
        return this;
    }

    public LifecycleComponentBuilder startDetection(String startDetection) {
        this.startDetection = startDetection;
        return this;
    }

    public LifecycleComponentBuilder stopDetection(String stopDetection) {
        this.stopDetection = stopDetection;
        return this;
    }

    public LifecycleComponentBuilder preStart(String preStart) {
        this.preStart = preStart;
        return this;
    }

    public LifecycleComponentBuilder postStart(String postStart) {
        this.postStart = postStart;
        return this;
    }

    public LifecycleComponentBuilder preStop(String preStop) {
        this.preStop = preStop;
        return this;
    }

    public LifecycleComponentBuilder stop(String stop) {
        this.stop = stop;
        return this;
    }

    public LifecycleComponentBuilder postStop(String postStop) {
        this.postStop = postStop;
        return this;
    }

    public LifecycleComponentBuilder shutdown(String shutdown) {
        this.shutdown = shutdown;
        return this;
    }

    public LifecycleComponent build() {
        return new LifecycleComponent(name, init, preInstall, install, postInstall, start,
            startDetection, stopDetection, preStart, postStart, preStop, stop, postStop, shutdown);
    }
}
