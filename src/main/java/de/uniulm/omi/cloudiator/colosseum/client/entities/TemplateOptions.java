package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

/**
 * Created by Daniel Seybold on 08.10.2015.
 */
@Path("templateOptions")
public class TemplateOptions extends AbstractEntity {

    private Map<String, String> tags;

    public TemplateOptions(@Nullable List<Link> link, Map<String, String> tags){
        super(link);
        this.tags = tags;
    }

    public TemplateOptions(Map<String, String> tags){
        this(null, tags);
    }

    protected TemplateOptions(){
        //
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
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
