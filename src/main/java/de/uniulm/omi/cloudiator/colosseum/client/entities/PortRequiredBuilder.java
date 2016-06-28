package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class PortRequiredBuilder {

    private String name;
    private Long applicationComponent;
    private String updateAction;
    private Boolean isMandatory = null;

    public PortRequiredBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PortRequiredBuilder applicationComponent(Long applicationComponent) {
        this.applicationComponent = applicationComponent;
        return this;
    }

    public PortRequiredBuilder updateAction(String updateAction) {
        this.updateAction = updateAction;
        return this;
    }

    public PortRequiredBuilder isMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
        return this;
    }

    public PortRequired build() {
        return new PortRequired(name, applicationComponent, updateAction, isMandatory);
    }
}
