package de.uniulm.omi.cloudiator.colosseum.client.entities.enums;

/**
 * Created by Frank on 29.05.2015.
 */
public enum LocationScope {
    REGION("Region"),
    ZONE("Zone"),
    HOST("Host");

    private final String text;

    private LocationScope(String text) {
        this.text = text;
    }

    @Override public String toString() {
        return text;
    }

}
