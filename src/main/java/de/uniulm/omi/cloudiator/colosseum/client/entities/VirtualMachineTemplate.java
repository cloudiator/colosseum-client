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

import com.google.common.base.Predicate;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Entity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by frank on 21.01.15.
 */
@Path("vmt")
public class VirtualMachineTemplate extends AbstractEntity {

  private Long cloud;
  private Long image;
  private Long location;
  private Long hardware;
  private Long templateOptions;

  public VirtualMachineTemplate(@Nullable List<Link> links, Long cloud, Long image, Long location,
      Long hardware, Long templateOptions) {
    super(links);
    this.cloud = cloud;
    this.image = image;
    this.location = location;
    this.hardware = hardware;
    this.templateOptions = templateOptions;
  }

  public VirtualMachineTemplate(Long cloud, Long image, Long location, Long hardware,
      Long templateOptions) {
    this(null, cloud, image, location, hardware, templateOptions);
  }

  protected VirtualMachineTemplate() {
  }

  public Long getCloud() {
    return cloud;
  }

  public void setCloud(Long cloud) {
    this.cloud = cloud;
  }

  public Long getImage() {
    return image;
  }

  public void setImage(Long image) {
    this.image = image;
  }

  public Long getLocation() {
    return location;
  }

  public void setLocation(Long location) {
    this.location = location;
  }

  public Long getHardware() {
    return hardware;
  }

  public void setHardware(Long hardware) {
    this.hardware = hardware;
  }

  public Long getTemplateOptions() {
    return templateOptions;
  }

  public void setTemplateOptions(Long templateOptions) {
    this.templateOptions = templateOptions;
  }

  @Override
  public Predicate<Entity> exists() {
    return new Predicate<Entity>() {
      @Override
      public boolean apply(@Nullable Entity input) {
        return VirtualMachineTemplate.this.equals(input);
      }
    };
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof VirtualMachineTemplate)) {
      return false;
    }

    VirtualMachineTemplate that = (VirtualMachineTemplate) o;

    if (!cloud.equals(that.cloud)) {
      return false;
    }
    if (!image.equals(that.image)) {
      return false;
    }
    if (!location.equals(that.location)) {
      return false;
    }
    if (!hardware.equals(that.hardware)) {
      return false;
    }
    return templateOptions != null ?
        templateOptions.equals(that.templateOptions) :
        that.templateOptions == null;

  }

  @Override
  public int hashCode() {
    int result = cloud.hashCode();
    result = 31 * result + image.hashCode();
    result = 31 * result + location.hashCode();
    result = 31 * result + hardware.hashCode();
    result = 31 * result + (templateOptions != null ? templateOptions.hashCode() : 0);
    return result;
  }
}
