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

package de.uniulm.omi.cloudiator.colosseum.client.entities.abstracts;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by Frank on 27.05.2015.
 */
public abstract class HorizontalScalingAction extends ScalingAction {

  private Long amount;
  private Long min;
  private Long max;
  private Long count;

  public HorizontalScalingAction(@Nullable List<Link> link, List<KeyValue> externalReferences,
      Long amount, Long min, Long max,
      Long count) {
    super(link, externalReferences);
    this.amount = amount;
    this.min = min;
    this.max = max;
    this.count = count;
  }

  public HorizontalScalingAction(List<KeyValue> externalReferences, Long amount, Long min, Long max,
      Long count) {
    this(null, externalReferences, amount, min, max, count);
  }

  protected HorizontalScalingAction() {
    super();
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    HorizontalScalingAction that = (HorizontalScalingAction) o;

    if (amount != null ? !amount.equals(that.amount) : that.amount != null) {
      return false;
    }
    if (count != null ? !count.equals(that.count) : that.count != null) {
      return false;
    }
    if (max != null ? !max.equals(that.max) : that.max != null) {
      return false;
    }
    if (min != null ? !min.equals(that.min) : that.min != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = amount != null ? amount.hashCode() : 0;
    result = 31 * result + (min != null ? min.hashCode() : 0);
    result = 31 * result + (max != null ? max.hashCode() : 0);
    result = 31 * result + (count != null ? count.hashCode() : 0);
    return result;
  }
}
