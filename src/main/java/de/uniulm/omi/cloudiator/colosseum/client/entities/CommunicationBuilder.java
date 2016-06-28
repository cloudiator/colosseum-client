package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class CommunicationBuilder {

    private Long requiredPort;
    private Long providedPort;

    public CommunicationBuilder requiredPort(Long requiredPort) {
        this.requiredPort = requiredPort;
        return this;
    }

    public CommunicationBuilder providedPort(Long providedPort) {
        this.providedPort = providedPort;
        return this;
    }

    public Communication build() {
        return new Communication(requiredPort, providedPort);
    }
}
