package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by daniel on 16.08.16.
 */
public class TemplateOptionsBuilder {

    private List<KeyValue> tags;
    private String userData;

    public TemplateOptionsBuilder() {
        tags = new ArrayList<>();
    }

    public TemplateOptionsBuilder addTag(String key, String value) {
        this.tags.add(new KeyValue(key, value));
        return this;
    }

    public TemplateOptionsBuilder addTags(Map<String, String> tags) {
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            addTag(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public TemplateOptionsBuilder userData(String userData) {
        this.userData = userData;
        return this;
    }

    public TemplateOptions build() {
        return new TemplateOptions(tags, userData);
    }
}
