package de.uniulm.omi.cloudiator.colosseum.client;

import de.uniulm.omi.cloudiator.colosseum.client.entities.Api;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;

/**
 * Created by Frank on 29.05.2015.
 */
public class SingletonFactory {

    public final Client client;

    public SingletonFactory(Client client) {
        this.client = client;
    }

    public <T extends AbstractEntity> T singleton(T obj){
        for(T onlineObj : client.controller((Class<T>)obj.getClass()).getList()){
            if(onlineObj.equals(obj)){
                return onlineObj;
            }
        }

        return client.controller((Class<T>)obj.getClass()).create(obj);
    }
}
