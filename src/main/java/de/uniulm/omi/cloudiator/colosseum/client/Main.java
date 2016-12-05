package de.uniulm.omi.cloudiator.colosseum.client;

import de.uniulm.omi.cloudiator.colosseum.client.entities.Application;
import de.uniulm.omi.cloudiator.colosseum.client.entities.ApplicationComponent;
import de.uniulm.omi.cloudiator.colosseum.client.entities.ApplicationInstance;
import de.uniulm.omi.cloudiator.colosseum.client.entities.Platform;
import de.uniulm.omi.cloudiator.colosseum.client.entities.PlatformApi;
import de.uniulm.omi.cloudiator.colosseum.client.entities.PlatformComponent;
import de.uniulm.omi.cloudiator.colosseum.client.entities.PlatformCredential;
import de.uniulm.omi.cloudiator.colosseum.client.entities.PlatformEnvironment;
import de.uniulm.omi.cloudiator.colosseum.client.entities.PlatformEnvironmentTemplate;
import de.uniulm.omi.cloudiator.colosseum.client.entities.PlatformHardware;
import de.uniulm.omi.cloudiator.colosseum.client.entities.PlatformInstance;
import de.uniulm.omi.cloudiator.colosseum.client.entities.PlatformRuntime;
import de.uniulm.omi.cloudiator.colosseum.client.entities.Tenant;

/**
 * Created by Frank on 05.12.2016.
 */
public class Main {


    public static void main(String[] args) {
        Client client = ClientBuilder.getNew().credentials("john.doe@example.com", "admin", "admin").url("http://127.0.0.1:9000/api").build();

        Tenant tenant = client.controller(Tenant.class).getList().get(0);
        Application application = client.controller(Application.class).create(new Application("testapplication"));
        PlatformComponent platformComponent = client.controller(PlatformComponent.class).create(new PlatformComponent(null, "platformcomponent1", "giturl", "artifactpath"));
        ApplicationComponent applicationComponent = client.controller(ApplicationComponent.class).create(new ApplicationComponent(application.getId(), platformComponent.getId(), null));
        PlatformApi platformApi = client.controller(PlatformApi.class).create(new PlatformApi(null, "platformapi1", "internalprovidername1"));
        Platform platform = client.controller(Platform.class).create(new Platform(null, "Platform1", "endpoint1", platformApi.getId()));
        PlatformCredential platformCredential = client.controller(PlatformCredential.class).create(new PlatformCredential(null, "user1", "secret1", platform.getId(), tenant.getId()));
        PlatformHardware platformHardware = client.controller(PlatformHardware.class).create(new PlatformHardware(null, 2, 1024l, 200f));
        PlatformRuntime platformRuntime = client.controller(PlatformRuntime.class).create(new PlatformRuntime(null, "Java", "Language", 1.8f)); //TODO float ist stupid, what is with version "1.9.2beta"?
        PlatformEnvironment platformEnvironment = client.controller(PlatformEnvironment.class).create(new PlatformEnvironment(null, "platformenvironment1", platform.getId(), platformHardware.getId(), platformRuntime.getId()));
        PlatformEnvironmentTemplate platformEnvironmentTemplate = client.controller(PlatformEnvironmentTemplate.class).create(new PlatformEnvironmentTemplate(null, platform.getId(), platformHardware.getId(), platformRuntime.getId()));
        //TODO what is the template good for?
        ApplicationInstance applicationInstance = client.controller(ApplicationInstance.class).create(new ApplicationInstance(application.getId()));
        PlatformInstance platformInstance = client.controller(PlatformInstance.class).create(new PlatformInstance(null, applicationComponent.getId(), applicationInstance.getId(), platformEnvironment.getId(), null));
    }
}
