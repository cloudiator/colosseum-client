package de.uniulm.omi.cloudiator.colosseum.client.entities.enums;

/**
 * Created by Frank on 08.03.2016.
 */
public enum ContainerType {

  DOCKER("dockering"),
  PLAIN("plain");

  private final String myName;

  ContainerType(String myNameParam) {
    myName = myNameParam;
  }

  /**
   * @return returns the ContainerType matching the parameter. Null otherwise.
   */
  public static ContainerType fromString(String containername) {
    for (ContainerType t : ContainerType.values()) {
      if (t.myName.equalsIgnoreCase(containername)) {
        return t;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return myName;
  }
}
