package de.uniulm.omi.cloudiator.colosseum.client.entities.enums;

/**
 * Created by Frank on 05.08.2015.
 */
public enum FilterType {

    ANY("ANY"),
    GTE("GTE"),
    GT("GT"),
    E("E"),
    LT("LT"),
    LTE("LTE");

    private final String text;

    private FilterType(final String text) {
        this.text = text;
    }

    @Override public String toString() {
        return text;
    }
}
