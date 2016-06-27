package de.uniulm.omi.cloudiator.colosseum.client.examples.internal;

import de.uniulm.omi.cloudiator.colosseum.client.entities.Cloud;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by daniel on 27.06.16.
 */
public class ConfigurationLoader {

    public Set<CloudConfiguration> load(Properties properties) {



    }

    public static class CloudConfiguration {

        private final String name;
        private final String endpoint;
        private final String apiName;
        private final String apiInternalProvider;
        private final long hardwareId;
        private final long locationId;
        private final long imageId;
        private final String imageLoginName;
        private final String imageOperatingSystem;
        private final Map<String, String> properties;



        public CloudConfiguration(String name, String endpoint, String apiName,
            String apiInternalProvider, long hardwareId, long locationId, long imageId,
            String imageLoginName, String imageOperatingSystem, Map<String, String> properties) {
            this.name = name;
            this.endpoint = endpoint;
            this.apiName = apiName;
            this.apiInternalProvider = apiInternalProvider;
            this.hardwareId = hardwareId;
            this.locationId = locationId;
            this.imageId = imageId;
            this.imageLoginName = imageLoginName;
            this.imageOperatingSystem = imageOperatingSystem;
            this.properties = properties;
        }
    }

}
