package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import java.util.List;

/**
 * Created by Frank on 05.12.2016.
 */
@Path("platformComponent") public class PlatformComponent extends NamedEntity {
    private String gitUrl;
    private String artifactPath;

    public PlatformComponent(List<Link> links, String name, String gitUrl, String artifactPath) {
        super(links, name);
        this.gitUrl = gitUrl;
        this.artifactPath = artifactPath;
    }

    protected PlatformComponent() {
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getArtifactPath() {
        return artifactPath;
    }

    public void setArtifactPath(String artifactPath) {
        this.artifactPath = artifactPath;
    }
}
