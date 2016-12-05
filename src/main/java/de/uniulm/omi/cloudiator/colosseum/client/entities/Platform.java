package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.FilterType;
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.SubscriptionType;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by Frank on 05.12.2016.
 */
@Path("platform") public class Platform extends NamedEntity {
    private String endpoint;
    private Long platformApi;

    public Platform(@Nullable List<Link> link, String name, String endpoint, Long platformApi) {
        super(link, name);
        this.platformApi = platformApi;
        this.endpoint = endpoint;
    }

    protected Platform() {
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Long getPlatformApi() {
        return platformApi;
    }

    public void setPlatformApi(Long platformApi) {
        this.platformApi = platformApi;
    }
}
