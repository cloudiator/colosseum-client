package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by Frank on 05.12.2016.
 */
@Path("platformInstance") public class PlatformInstance extends AbstractEntity {
    private Long applicationComponent;
    private Long applicationInstance;
    private Long platformEnvironment;
    private String endpoint;

    public PlatformInstance(@Nullable List<Link> link, Long applicationComponent, Long applicationInstance, Long platformEnvironment, String endpoint) {
        super(link);
        this.applicationComponent = applicationComponent;
        this.applicationInstance = applicationInstance;
        this.platformEnvironment = platformEnvironment;
        this.endpoint = endpoint;
    }

    protected PlatformInstance() {
    }

    public Long getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(Long applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public Long getApplicationInstance() {
        return applicationInstance;
    }

    public void setApplicationInstance(Long applicationInstance) {
        this.applicationInstance = applicationInstance;
    }

    public Long getPlatformEnvironment() {
        return platformEnvironment;
    }

    public void setPlatformEnvironment(Long platformEnvironment) {
        this.platformEnvironment = platformEnvironment;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
