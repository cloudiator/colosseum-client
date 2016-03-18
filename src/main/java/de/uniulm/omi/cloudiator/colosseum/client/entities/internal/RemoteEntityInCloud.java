package de.uniulm.omi.cloudiator.colosseum.client.entities.internal;

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.RemoteState;

import java.util.List;

/**
 * Created by Frank on 24.11.2015.
 */
public class RemoteEntityInCloud extends RemoteEntity {
    private Long cloud;
    private List<Long> cloudCredentials;
    private Long owner;

    public RemoteEntityInCloud(List<Link> links, String remoteId, RemoteState remoteState, String providerId, String swordId, Long cloud, List<Long> cloudCredentials, Long owner) {
        super(links, remoteId, remoteState, providerId, swordId);
        this.cloud = cloud;
        this.cloudCredentials = cloudCredentials;
        this.owner = owner;
    }

    public RemoteEntityInCloud(String remoteId, RemoteState remoteState, String providerId, String swordId, Long cloud, List<Long> cloudCredentials, Long owner) {
        super(null, remoteId, remoteState, providerId, swordId);
        this.cloud = cloud;
        this.cloudCredentials = cloudCredentials;
        this.owner = owner;
    }

    protected RemoteEntityInCloud(){

    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
    }

    public List<Long> getCloudCredentials() {
        return cloudCredentials;
    }

    public void setCloudCredentials(List<Long> cloudCredentials) {
        this.cloudCredentials = cloudCredentials;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RemoteEntityInCloud)) return false;
        if (!super.equals(o)) return false;

        RemoteEntityInCloud that = (RemoteEntityInCloud) o;

        return !(cloud != null ? !cloud.equals(that.cloud) : that.cloud != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cloud != null ? cloud.hashCode() : 0);
        return result;
    }
}
