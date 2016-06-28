package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class ApplicationInstanceBuilder {
    private Long application;

    public ApplicationInstanceBuilder application(Long application) {
        this.application = application;
        return this;
    }

    public ApplicationInstance build() {
        return new ApplicationInstance(application);
    }
}
