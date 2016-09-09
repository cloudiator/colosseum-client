package de.uniulm.omi.cloudiator.colosseum.client.entities;

/**
 * Created by Frank on 27.07.2016.
 */
public class MonitorInstanceBuilder {

    private Long monitor;
    private String apiEndpoint;
    private Long virtualMachine;
    private Long component;
    private Integer port;

    public MonitorInstanceBuilder monitor(Long monitor){
        this.monitor = monitor;
        return this;
    }

    public MonitorInstanceBuilder apiEndpoint(String apiEndpoint){
        this.apiEndpoint = apiEndpoint;
        return this;
    }

    public MonitorInstanceBuilder virtualMachine(Long virtualMachine){
        this.virtualMachine = virtualMachine;
        return this;
    }

    public MonitorInstanceBuilder component(Long component){
        this.component = component;
        return this;
    }

    public MonitorInstanceBuilder port(Integer port){
        this.port = port;
        return this;
    }

    public MonitorInstance build(){
        return new MonitorInstance(monitor, apiEndpoint, virtualMachine, component, port);
    }
}
