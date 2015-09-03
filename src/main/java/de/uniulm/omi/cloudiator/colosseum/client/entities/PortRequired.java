package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 02.09.2015.
 */
@Path("portReq")
public class PortRequired extends Port {
    public PortRequired(@Nullable List<Link> links, String name, Long applicationComponent) {
        super(links, name, applicationComponent);
    }

    public PortRequired(String name, Long applicationComponent) {
        this(null, name, applicationComponent);
    }

    protected PortRequired() {
    }
}
