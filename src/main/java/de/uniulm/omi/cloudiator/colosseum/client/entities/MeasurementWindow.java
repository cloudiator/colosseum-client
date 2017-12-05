/*
 * Copyright (c) 2014-2015 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts.Window;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import java.util.List;
import javax.annotation.Nullable;

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

  protected MeasurementWindow() {

  }

  public Long getMeasurements() {
    return measurements;
  }

  public void setMeasurements(Long measurements) {
    this.measurements = measurements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MeasurementWindow)) {
      return false;
    }

    MeasurementWindow that = (MeasurementWindow) o;

    if (measurements != null ?
        !measurements.equals(that.measurements) :
        that.measurements != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return measurements != null ? measurements.hashCode() : 0;
  }
}
