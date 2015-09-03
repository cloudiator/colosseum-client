package de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 09.06.2015.
 */
public abstract class Component extends NamedEntity {
    public Component(@Nullable List<Link> link, String name) {
        super(link, name);
        this.name = name;
    }

    public Component(String name) {
        this(null, name);
    }

    protected Component() {
        super();
    }
}
