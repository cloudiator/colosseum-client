package de.uniulm.omi.cloudiator.colosseum.client.entities.enums;

/**
 * Created by Frank on 05.08.2015.
 */
public enum SubscriptionType {

    CDO("CDO"),
    CDO_EVENT("CDO");

    private final String text;

    private SubscriptionType(final String text) {
        this.text = text;
    }

    @Override public String toString() {
        return text;
    }
}
