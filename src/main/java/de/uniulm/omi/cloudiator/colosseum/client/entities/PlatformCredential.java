package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by Frank on 05.12.2016.
 */
@Path("platformCredential") public class PlatformCredential extends AbstractEntity {
    private String user;
    private String secret;
    private Long platform;
    private Long tenant;

    public PlatformCredential(@Nullable List<Link> link, String user, String secret, Long platform, Long tenant) {
        super(link);
        this.user = user;
        this.secret = secret;
        this.platform = platform;
        this.tenant = tenant;
    }

    protected PlatformCredential() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Long getPlatform() {
        return platform;
    }

    public void setPlatform(Long platform) {
        this.platform = platform;
    }

    public Long getTenant() {
        return tenant;
    }

    public void setTenant(Long tenant) {
        this.tenant = tenant;
    }
}
