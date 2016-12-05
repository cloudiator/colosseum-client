package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by Frank on 05.12.2016.
 */
@Path("platformEnvironmentTemplate") public class PlatformEnvironmentTemplate extends AbstractEntity {
    private Long platform;
    private Long platformHardware;
    private Long platformRuntime;

    public PlatformEnvironmentTemplate(@Nullable List<Link> link, Long platform, Long platformHardware, Long platformRuntime) {
        super(link);
        this.platform = platform;
        this.platformHardware = platformHardware;
        this.platformRuntime = platformRuntime;
    }

    protected PlatformEnvironmentTemplate() {
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
