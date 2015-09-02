package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.OperatingSystemVendorType;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.NamedEntity;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 02.09.2015.
 */
public abstract class Port extends NamedEntity {
    private Long applicationComponent;

    public Port(@Nullable List<Link> links, String name, Long applicationComponent) {
        super(links, name);
        this.applicationComponent = applicationComponent;
    }

    public Port(String name, Long applicationComponent) {
        this(null, name, applicationComponent);
    }

    protected Port() {
    }

    public Long getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(Long applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Port))
            return false;
        if (!super.equals(o))
            return false;

        Port port = (Port) o;

        return !(applicationComponent != null ?
            !applicationComponent.equals(port.applicationComponent) :
            port.applicationComponent != null);

    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (applicationComponent != null ? applicationComponent.hashCode() : 0);
        return result;
    }
}
