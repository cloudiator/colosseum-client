package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts.ComponentHorizontalScalingAction;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 10.08.2015.
 */
@Path("componentHorizontalInScalingAction")
public class ComponentHorizontalInScalingAction extends ComponentHorizontalScalingAction {
    public ComponentHorizontalInScalingAction(@Nullable List<Link> link, @Nullable List<String> externalReferences, Long amount, Long min,
        Long max, Long count, Long applicationComponent) {
        super(link, externalReferences, amount, min, max, count, applicationComponent);
    }

    public ComponentHorizontalInScalingAction(@Nullable List<String> externalReferences, Long amount, Long min, Long max, Long count,
        Long applicationComponent) {
        this(null, externalReferences, amount, min, max, count, applicationComponent);
    }

    public ComponentHorizontalInScalingAction(Long amount, Long min, Long max, Long count,
        Long applicationComponent) {
        this(null, null, amount, min, max, count, applicationComponent);
    }

    protected ComponentHorizontalInScalingAction(){
    }
}
