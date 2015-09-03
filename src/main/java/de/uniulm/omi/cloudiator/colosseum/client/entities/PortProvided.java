package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 02.09.2015.
 */
@Path("portProv")
public class PortProvided extends Port {
    private Integer port;

    public PortProvided(@Nullable List<Link> links, String name, Long applicationComponent, Integer port) {
        super(links, name, applicationComponent);
        this.port = port;
    }

    public PortProvided(String name, Long applicationComponent, Integer port) {
        this(null, name, applicationComponent, port);
    }

    protected PortProvided() {
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof PortProvided))
            return false;
        if (!super.equals(o))
            return false;

        PortProvided that = (PortProvided) o;

        return !(port != null ? !port.equals(that.port) : that.port != null);

    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (port != null ? port.hashCode() : 0);
        return result;
    }
}
