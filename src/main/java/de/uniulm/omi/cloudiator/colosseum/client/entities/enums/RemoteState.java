package de.uniulm.omi.cloudiator.colosseum.client.entities.enums;

/**
 * Created by Frank on 24.11.2015.
 */
public enum RemoteState {
    OK("OK"),
    INPROGRESS("INPROGRESS"),
    ERROR("ERROR");

    private final String text;

    private RemoteState(final String text) {
        this.text = text;
    }

    @Override public String toString() {
        return text;
    }
}
