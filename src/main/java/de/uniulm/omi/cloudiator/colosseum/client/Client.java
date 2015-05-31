package de.uniulm.omi.cloudiator.colosseum.client;

import de.uniulm.omi.cloudiator.colosseum.client.entities.Cloud;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Entity;

/**
 * Created by Frank on 29.05.2015.
 */
public class Client {

    private final javax.ws.rs.client.Client client;
    private final String baseUrl;

    Client(javax.ws.rs.client.Client client, String baseUrl) {
        this.client = client;
        this.baseUrl = baseUrl;
    }

    public <T extends Entity> ClientController<T> controller(Class<T> clazz) {
        return new ClientController<>(this.client, this.baseUrl, clazz);
    }
}
