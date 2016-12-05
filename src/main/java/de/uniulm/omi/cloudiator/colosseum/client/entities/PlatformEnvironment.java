package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import java.util.List;

/**
 * Created by Frank on 05.12.2016.
 */
@Path("platformEnvironment") public class PlatformEnvironment extends NamedEntity{
    private Long platform;
    private Long platformHardware;
    private Long platformRuntime;

    public PlatformEnvironment(List<Link> links, String name, Long platform, Long platformHardware, Long platformRuntime) {
        super(links, name);
        this.platform = platform;
        this.platformHardware = platformHardware;
        this.platformRuntime = platformRuntime;
    }

    protected PlatformEnvironment() {
    }

    public Long getPlatform() {
        return platform;
    }

    public void setPlatform(Long platform) {
        this.platform = platform;
    }

    public Long getPlatformHardware() {
        return platformHardware;
    }

    public void setPlatformHardware(Long platformHardware) {
        this.platformHardware = platformHardware;
    }

    public Long getPlatformRuntime() {
        return platformRuntime;
    }

    public void setPlatformRuntime(Long platformRuntime) {
        this.platformRuntime = platformRuntime;
    }
}
