package de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 27.05.2015.
 */
public abstract class ScalingAction<T> extends AbstractEntity<T> {

    public ScalingAction(@Nullable List<Link> link) {
        super(link);
    }

    protected ScalingAction() {
        this(null);
    }
}