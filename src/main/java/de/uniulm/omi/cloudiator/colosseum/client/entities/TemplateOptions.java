package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Created by Daniel Seybold on 08.10.2015.
 */
@Path("templateOptions")
public class TemplateOptions extends AbstractEntity {

  private List<KeyValue> tags = new ArrayList<>();
  private String userData;

  public TemplateOptions(@Nullable List<Link> link, List<KeyValue> tags, String userData) {
    super(link);
    this.tags = tags;
    this.userData = userData;
  }

  public TemplateOptions(List<KeyValue> tags, String userData) {
    this(null, tags, userData);
  }

  protected TemplateOptions() {
    //
  }

  public List<KeyValue> getTags() {
    return tags;
  }

  public void setTags(List<KeyValue> tags) {
    this.tags = tags;
  }

  public void addTag(KeyValue kv) {
    this.tags.add(kv);
  }

  public void addTag(String key, String value) {
    this.tags.add(new KeyValue(key, value));
  }

  public String getUserData() {
    return userData;
  }

  public void setUserData(String userData) {
    this.userData = userData;
  }
}
