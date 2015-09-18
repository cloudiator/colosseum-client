package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 10.09.2015.
 */
@Path("cloudProperty")
public class CloudProperty extends AbstractEntity {

    private String key;
    private String value;
    private Long cloud;

    public CloudProperty(@Nullable List<Link> link, String key, String value, Long cloud) {
        super(link);
        this.key = key;
        this.value = value;
        this.cloud = cloud;
    }

    public CloudProperty(String key, String value, Long cloud) {
        this.key = key;
        this.value = value;
        this.cloud = cloud;
    }

    protected CloudProperty(){
        //
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getCloud() {
        return cloud;
    }

    public void setCloud(Long cloud) {
        this.cloud = cloud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CloudProperty)) return false;

        CloudProperty that = (CloudProperty) o;

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        return !(cloud != null ? !cloud.equals(that.cloud) : that.cloud != null);

    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (cloud != null ? cloud.hashCode() : 0);
        return result;
    }
}
