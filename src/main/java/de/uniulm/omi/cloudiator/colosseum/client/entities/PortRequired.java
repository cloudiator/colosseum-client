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

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by Frank on 02.09.2015.
 */
@Path("portReq")
public class PortRequired extends Port {

  private String updateAction;
  private Boolean isMandatory = false;

  public PortRequired(@Nullable List<Link> links, String name, Long applicationComponent,
      String updateAction, @Nullable Boolean isMandatory) {
    super(links, name, applicationComponent);

    this.updateAction = updateAction;
    if (isMandatory != null) {
      this.isMandatory = isMandatory;
    }
  }

  public PortRequired(String name, Long applicationComponent, String updateAction,
      Boolean isMandatory) {
    this(null, name, applicationComponent, updateAction, isMandatory);
  }

  public PortRequired(String name, Long applicationComponent, String updateAction) {
    this(null, name, applicationComponent, updateAction, null);
  }

  protected PortRequired() {
  }

  public String getUpdateAction() {
    return updateAction;
  }

  public void setUpdateAction(String updateAction) {
    this.updateAction = updateAction;
  }

  public Boolean getIsMandatory() {
    return isMandatory;
  }

  public void setIsMandatory(Boolean mandatory) {
    isMandatory = mandatory;
  }
}
