package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class CloudBuilder {
    private String name;
    private String endpoint;
    private Long api;

    public CloudBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CloudBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public CloudBuilder api(Long api) {
        this.api = api;
        return this;
    }

    public Cloud build() {
        return new Cloud(name, endpoint, api);
    }
}
