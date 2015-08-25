package de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 09.06.2015.
 */
public abstract class Monitor extends ExternalReferencedEntity{

    public Monitor(@Nullable List<Link> link, @Nullable List<String> externalReferences) {
        super(link, externalReferences);
    }

    public Monitor(@Nullable List<String> externalReferences) {
        super(externalReferences);
    }

    protected Monitor() {
        super();
    }
}
