package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import java.util.List;

/**
 * Created by Frank on 05.12.2016.
 */
@Path("platformApi") public class PlatformApi extends NamedEntity{

    private String internalProviderName;

    public PlatformApi(List<Link> links, String name, String internalProviderName) {
        super(links, name);
        this.internalProviderName = internalProviderName;
    }

    protected PlatformApi() {
    }

    public String getInternalProviderName() {
        return internalProviderName;
    }

    public void setInternalProviderName(String internalProviderName) {
        this.internalProviderName = internalProviderName;
    }
}
