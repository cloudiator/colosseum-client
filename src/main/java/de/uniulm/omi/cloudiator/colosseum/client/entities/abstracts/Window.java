package de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 09.06.2015.
 */
public abstract class Window extends AbstractEntity{
    public Window(@Nullable List<Link> link){
        super(link);
    }

    protected Window(){

    }
}
