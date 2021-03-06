package de.uniulm.omi.cloudiator.colosseum.client.entities.internal;

/**
 * Created by Frank on 17.03.2016.
 */
public class KeyValue {

  private String key;
  private String value;

  public KeyValue(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public KeyValue() {
  }

  public static KeyValue of(String key, String value) {
    return new KeyValue(key, value);
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
