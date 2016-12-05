package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by Frank on 05.12.2016.
 */
@Path("platformHardware") public class PlatformHardware extends AbstractEntity {
    protected Integer numberOfCores;
    protected Long mbOfRam;
    protected Float localDiskSpace;

    public PlatformHardware(@Nullable List<Link> link, Integer numberOfCores, Long mbOfRam, Float localDiskSpace) {
        super(link);
        this.numberOfCores = numberOfCores;
        this.mbOfRam = mbOfRam;
        this.localDiskSpace = localDiskSpace;
    }

    protected PlatformHardware() {
    }

    public Integer getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public Long getMbOfRam() {
        return mbOfRam;
    }

    public void setMbOfRam(Long mbOfRam) {
        this.mbOfRam = mbOfRam;
    }

    public Float getLocalDiskSpace() {
        return localDiskSpace;
    }

    public void setLocalDiskSpace(Float localDiskSpace) {
        this.localDiskSpace = localDiskSpace;
    }
}
