package de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 27.05.2015.
 */
public abstract class ComponentHorizontalScalingAction<T> extends HorizontalScalingAction<T> {

    private Long applicationComponent;

    public ComponentHorizontalScalingAction(@Nullable List<Link> link, Long amount, Long min,
        Long max, Long count, Long applicationComponent) {
        super(link, amount, min, max, count);
        this.applicationComponent = applicationComponent;
    }

    public ComponentHorizontalScalingAction(Long amount, Long min, Long max, Long count,
        Long applicationComponent) {
        this(null, amount, min, max, count, applicationComponent);
    }

    protected ComponentHorizontalScalingAction(){
    }

    public void setApplicationComponent(Long applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public Long getApplicationComponent() {
        return applicationComponent;
    }
}