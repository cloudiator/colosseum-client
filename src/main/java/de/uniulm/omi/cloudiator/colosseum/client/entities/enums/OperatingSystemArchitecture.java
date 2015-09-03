package de.uniulm.omi.cloudiator.colosseum.client.entities.enums;

/**
 * Created by Frank on 28.05.2015.
 */
public enum OperatingSystemArchitecture {

    AMD64("amd64"),
    I386("i386");

    private final String text;

    private OperatingSystemArchitecture(final String text) {
        this.text = text;
    }

    @Override public String toString() {
        return text;
    }
}
