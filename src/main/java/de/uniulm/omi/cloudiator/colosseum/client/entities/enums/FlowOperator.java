package de.uniulm.omi.cloudiator.colosseum.client.entities.enums;

/**
 * Created by Frank on 27.05.2015.
 */
public enum FlowOperator {

    MAP("MAP"),
    REDUCE("REDUCE");

    private final String text;

    private FlowOperator(final String text) {
        this.text = text;
    }

    @Override public String toString() {
        return text;
    }
}
