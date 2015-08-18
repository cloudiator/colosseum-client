package de.uniulm.omi.cloudiator.colosseum.client.entities.internal;

import java.util.List;

/**
 * Created by Frank on 18.08.2015.
 */
public abstract class RemoteEntity extends AbstractEntity {

    private String remoteId;
    private String cloudProviderId;

    public RemoteEntity(List<Link> links, String remoteId, String cloudProviderId) {
        super(links);
        this.remoteId = remoteId;
        this.cloudProviderId = cloudProviderId;
    }

    public RemoteEntity(String remoteId, String cloudProviderId) {
        this(null, remoteId, cloudProviderId);
    }

    protected RemoteEntity() {
    }

    public String getRemoteId() {
        return remoteId;
    }

    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    public String getCloudProviderId() {
        return cloudProviderId;
    }

    public void setCloudProviderId(String cloudProviderId) {
        this.cloudProviderId = cloudProviderId;
    }

    @Override public boolean equals(Object o) {
        // ignoring all the fields here
        return true;
    }

    @Override public int hashCode() {
        // ignoring all the fields here
        return 0;
    }
}
