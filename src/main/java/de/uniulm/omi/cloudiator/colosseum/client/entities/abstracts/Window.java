package de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 09.06.2015.
 */
public abstract class Window extends AbstractEntity{
    Long interval;

    public Window(@Nullable List<Link> link, Long interval) {
        super(link);
        this.interval = interval;
    }

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public Window(Long interval) {
        this(null, interval);
    }

    protected Window() {
        super();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Window window = (Window) o;

        if (interval != null ? !interval.equals(window.interval) : window.interval != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        return interval != null ? interval.hashCode() : 0;
    }
}
