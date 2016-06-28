package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class PortProvidedBuilder {

    private String name;
    private Long applicationComponent;
    private Integer port;

    public PortProvidedBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PortProvidedBuilder applicationComponent(Long applicationComponent) {
        this.applicationComponent = applicationComponent;
        return this;
    }

    public PortProvidedBuilder port(Integer port) {
        this.port = port;
        return this;
    }

    public PortProvided build() {
        return new PortProvided(name, applicationComponent, port);
    }
}
