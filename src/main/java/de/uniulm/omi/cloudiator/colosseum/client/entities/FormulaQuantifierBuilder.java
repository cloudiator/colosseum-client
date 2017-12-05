package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class FormulaQuantifierBuilder {

  private Boolean relative;
  private Double value;

  public FormulaQuantifierBuilder relative(Boolean relative) {
    this.relative = relative;
    return this;
  }

  public FormulaQuantifierBuilder value(Double value) {
    this.value = value;
    return this;
  }

  public FormulaQuantifier build() {
    return new FormulaQuantifier(relative, value);
  }
}
