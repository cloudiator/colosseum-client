package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class VirtualMachineTemplateBuilder {

  private Long cloud;
  private Long image;
  private Long location;
  private Long hardware;
  private Long templateOptions;

  public VirtualMachineTemplateBuilder cloud(Long cloud) {
    this.cloud = cloud;
    return this;
  }

  public VirtualMachineTemplateBuilder image(Long image) {
    this.image = image;
    return this;
  }

  public VirtualMachineTemplateBuilder location(Long location) {
    this.location = location;
    return this;
  }

  public VirtualMachineTemplateBuilder hardware(Long hardware) {
    this.hardware = hardware;
    return this;
  }

  public VirtualMachineTemplateBuilder templateOptions(Long templateOptions) {
    this.templateOptions = templateOptions;
    return this;
  }

  public VirtualMachineTemplate build() {
    return new VirtualMachineTemplate(cloud, image, location, hardware, templateOptions);
  }
}
