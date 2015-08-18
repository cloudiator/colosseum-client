package de.uniulm.omi.cloudiator.colosseum.client.entities.internal;

import java.util.List;

/**
 * Created by Frank on 18.08.2015.
 */
public abstract class NamedRemoteEntity extends RemoteEntity {
    private String name;

    public NamedRemoteEntity(List<Link> links, String remoteId, String cloudProviderId, String name) {
        super(links, remoteId, cloudProviderId);
        this.name = name;
    }

    public NamedRemoteEntity(String remoteId, String cloudProviderId, String name) {
        this(null, remoteId, cloudProviderId, name);
    }

    protected NamedRemoteEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof NamedRemoteEntity))
            return false;
        if (!super.equals(o))
            return false;

        NamedRemoteEntity that = (NamedRemoteEntity) o;

        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
