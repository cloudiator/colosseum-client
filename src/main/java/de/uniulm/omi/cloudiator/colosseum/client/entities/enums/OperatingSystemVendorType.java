package de.uniulm.omi.cloudiator.colosseum.client.entities.enums;

/**
 * Created by Frank on 28.05.2015.
 */
public enum OperatingSystemVendorType {

    NIX("*nix"),
    WINDOWS("windows");

    private final String text;

    private OperatingSystemVendorType(String text) {
        this.text = text;
    }

    @Override public String toString() {
        return text;
    }
}
