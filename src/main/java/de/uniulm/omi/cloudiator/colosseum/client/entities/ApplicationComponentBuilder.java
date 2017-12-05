package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.ContainerType;

public class ApplicationComponentBuilder {

  private Long application;
  private Long component;
  private Long virtualMachineTemplate;
  private ContainerType containerType = null;

  public ApplicationComponentBuilder application(Long application) {
    this.application = application;
    return this;
  }

  public ApplicationComponentBuilder component(Long component) {
    this.component = component;
    return this;
  }

  public ApplicationComponentBuilder virtualMachineTemplate(Long virtualMachineTemplate) {
    this.virtualMachineTemplate = virtualMachineTemplate;
    return this;
  }

  public ApplicationComponentBuilder containerType(ContainerType containerType) {
    this.containerType = containerType;
    return this;
  }

  public ApplicationComponent build() {
    return new ApplicationComponent(application, component, virtualMachineTemplate,
        containerType);
  }
}
