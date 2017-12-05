package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class InstanceBuilder {

  private Long applicationComponent;
  private Long applicationInstance;
  private Long virtualMachine;

  public InstanceBuilder applicationComponent(Long applicationComponent) {
    this.applicationComponent = applicationComponent;
    return this;
  }

  public InstanceBuilder applicationInstance(Long applicationInstance) {
    this.applicationInstance = applicationInstance;
    return this;
  }

  public InstanceBuilder virtualMachine(Long virtualMachine) {
    this.virtualMachine = virtualMachine;
    return this;
  }

  public Instance build() {
    return new Instance(null, null, null, null, applicationComponent, applicationInstance,
        virtualMachine);
  }
}
