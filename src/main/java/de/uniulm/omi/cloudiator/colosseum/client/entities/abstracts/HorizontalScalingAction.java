package de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Frank on 27.05.2015.
 */
public abstract class HorizontalScalingAction<T> extends ScalingAction<T> {

    private Long amount;
    private Long min;
    private Long max;
    private Long count;

    public HorizontalScalingAction(@Nullable List<Link> link, Long amount, Long min, Long max,
        Long count) {
        super(link);
        this.amount = amount;
        this.min = min;
        this.max = max;
        this.count = count;
    }

    public HorizontalScalingAction(Long amount, Long min, Long max, Long count) {
        this(null, amount, min, max, count);
    }

    protected HorizontalScalingAction() {
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}