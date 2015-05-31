package de.uniulm.omi.cloudiator.colosseum.client;

import de.uniulm.omi.cloudiator.colosseum.client.entities.Api;
import de.uniulm.omi.cloudiator.colosseum.client.entities.Cloud;
import de.uniulm.omi.cloudiator.colosseum.client.entities.CloudApi;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;

/**
 * Created by Frank on 29.05.2015.
 */
public class ClientWrapper {
    private final Client client;

    public ClientWrapper(Client client){

        this.client = client;
    }

    public <T extends AbstractEntity> ClientController<T> get (Class<T> type){
        return client.controller(type);
    }

    public ClientController<Api> Api(){
        return client.controller(Api.class);
    }

    public ClientController<Cloud> Cloud(){
        return client.controller(Cloud.class);
    }

    public ClientController<CloudApi> CloudApi(){
        return this.get(CloudApi.class);
    }

}
