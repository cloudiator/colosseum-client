package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class VirtualMachineBuilder {

  private Long cloud;
  private Long location;
  private String name;
  private Long image;
  private Long hardware;
  private Long templateOptions = null;

  public static VirtualMachineBuilder of(VirtualMachineTemplate virtualMachineTemplate) {
    return new VirtualMachineBuilder().cloud(virtualMachineTemplate.getCloud())
        .hardware(virtualMachineTemplate.getHardware()).image(virtualMachineTemplate.getImage())
        .location(virtualMachineTemplate.getLocation())
        .templateOptions(virtualMachineTemplate.getTemplateOptions());
  }

  public VirtualMachineBuilder cloud(Long cloud) {
    this.cloud = cloud;
    return this;
  }

  public VirtualMachineBuilder location(Long location) {
    this.location = location;
    return this;
  }

  public VirtualMachineBuilder name(String name) {
    this.name = name;
    return this;
  }

  public VirtualMachineBuilder image(Long image) {
    this.image = image;
    return this;
  }

  public VirtualMachineBuilder hardware(Long hardware) {
    this.hardware = hardware;
    return this;
  }

  public VirtualMachineBuilder templateOptions(Long templateOptions) {
    this.templateOptions = templateOptions;
    return this;
  }

  public VirtualMachine build() {
    return new VirtualMachine(null, null, null, null, cloud, null, null, location, name, image,
        hardware, templateOptions);
  }
}
