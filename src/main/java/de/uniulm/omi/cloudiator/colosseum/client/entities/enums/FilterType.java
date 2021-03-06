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

package de.uniulm.omi.cloudiator.colosseum.client.entities.enums;

/**
 * Created by Frank on 05.08.2015.
 */
public enum FilterType {

  ANY("ANY"),
  GTE("GTE"),
  GT("GT"),
  E("E"),
  LT("LT"),
  LTE("LTE");

  private final String text;

  private FilterType(final String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }
}
