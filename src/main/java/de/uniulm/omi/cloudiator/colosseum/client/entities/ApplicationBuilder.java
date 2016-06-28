package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class ApplicationBuilder {

    private String name;

    public ApplicationBuilder name(String name) {
        this.name = name;
        return this;
    }

    public Application build() {
        return new Application(name);
    }
}
