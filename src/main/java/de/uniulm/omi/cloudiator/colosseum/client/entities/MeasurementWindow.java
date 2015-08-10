package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts.Window;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Frank on 10.08.2015.
 */
@Path("measurementWindow")
public class MeasurementWindow extends Window {

    private Long measurements;

    public MeasurementWindow(@Nullable List<Link> link, Long measurements) {
        super(link);
        this.measurements = measurements;
    }

    public MeasurementWindow(Long measurements) {
        this(null, measurements);
    }

    protected MeasurementWindow(){

    }

    public Long getMeasurements() {
        return measurements;
    }

    public void setMeasurements(Long measurements) {
        this.measurements = measurements;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof MeasurementWindow))
            return false;

        MeasurementWindow that = (MeasurementWindow) o;

        if (measurements != null ?
            !measurements.equals(that.measurements) :
            that.measurements != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        return measurements != null ? measurements.hashCode() : 0;
    }
}
