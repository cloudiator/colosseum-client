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

package de.uniulm.omi.cloudiator.colosseum.client.entities.internal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by daniel on 21.01.15.
 */
public interface Entity {

  @JsonIgnore
  public String getSelfLink();

  @Nullable
  @JsonIgnore
  public Long getId();

  @JsonIgnore
  public List<Link> getLink();

  @JsonProperty
  public void setLink(@Nullable List<Link> link);

  Predicate<? super Entity> exists();

}
