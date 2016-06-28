package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class CloudPropertyBuilder {

    private String key;
    private String value;
    private Long cloud;


    public CloudPropertyBuilder key(String key) {
        this.key = key;
        return this;
    }

    public CloudPropertyBuilder value(String value) {
        this.value = value;
        return this;
    }

    public CloudPropertyBuilder cloud(Long cloud) {
        this.cloud = cloud;
        return this;
    }

    public CloudProperty build() {
        return new CloudProperty(key, value, cloud);
    }
}
