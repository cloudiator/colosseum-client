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
@Path("applicationInstance")
public class ApplicationInstance extends AbstractEntity {

  private Long application;

  public ApplicationInstance(@Nullable List<Link> links, Long application) {
    super(links);
    this.application = application;
  }

  public ApplicationInstance(Long application) {
    this(null, application);
  }

  protected ApplicationInstance() {
  }

  public Long getApplication() {
    return application;
  }

  public void setApplication(Long application) {
    this.application = application;
  }
}
