package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Daniel Seybold on 08.10.2015.
 */
@Path("templateOptions")
public class TemplateOptions extends AbstractEntity {

    private List<KeyValue> tags = new ArrayList<>();

    public TemplateOptions(@Nullable List<Link> link, List<KeyValue> tags){
        super(link);
        this.tags = tags;
    }

    public TemplateOptions(List<KeyValue> tags){
        this(null, tags);
    }

    protected TemplateOptions(){
        //
    }

    public List<KeyValue> getTags() {
        return tags;
    }

    public void setTags(List<KeyValue> tags) {
        this.tags = tags;
    }

    public void addTag(KeyValue kv){
        this.tags.add(kv);
    }

    public void addTag(String key, String value){
        this.tags.add(new KeyValue(key, value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TemplateOptions)) return false;

        TemplateOptions that = (TemplateOptions) o;

        return !(tags != null ? !tags.equals(that.tags) : that.tags != null);

    }

    @Override
    public int hashCode() {
        return tags != null ? tags.hashCode() : 0;
    }
}
