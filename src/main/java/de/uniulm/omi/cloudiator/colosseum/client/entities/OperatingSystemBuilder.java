package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.common.os.OperatingSystemArchitecture;
import de.uniulm.omi.cloudiator.common.os.OperatingSystemFamily;

public class OperatingSystemBuilder {

    private OperatingSystemFamily operatingSystemFamily;
    private OperatingSystemArchitecture operatingSystemArchitecture;
    private String version;

    public OperatingSystemBuilder operatingSystemFamily(
        OperatingSystemFamily operatingSystemFamily) {
        this.operatingSystemFamily = operatingSystemFamily;
        return this;
    }

    public OperatingSystemBuilder operatingSystemArchitecture(
        OperatingSystemArchitecture operatingSystemArchitecture) {
        this.operatingSystemArchitecture = operatingSystemArchitecture;
        return this;
    }

    public OperatingSystemBuilder version(String version) {
        this.version = version;
        return this;
    }

    public OperatingSystem build() {
        return new OperatingSystem(operatingSystemFamily, operatingSystemArchitecture, version);
    }
}
