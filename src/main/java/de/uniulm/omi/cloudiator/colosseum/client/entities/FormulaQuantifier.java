/*
 * Copyright (c) 2015 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by frank on 21.01.15.
 */
@Path("formulaQuantifier")
public class FormulaQuantifier extends AbstractEntity {

  private Boolean relative;
  private Double value;

  public FormulaQuantifier(@Nullable List<Link> link, Boolean relative, Double value) {
    super(link);
    this.relative = relative;
    this.value = value;
  }

  public FormulaQuantifier(Boolean relative, Double value) {
    this(null, relative, value);
  }

  protected FormulaQuantifier() {

  }

  public Boolean getRelative() {
    return relative;
  }

  public void setRelative(Boolean relative) {
    this.relative = relative;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

}
