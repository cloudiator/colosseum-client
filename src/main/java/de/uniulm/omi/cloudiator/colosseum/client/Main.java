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
        Application application = client.controller(Application.class).updateOrCreate(new Application("cardDesginerApplication"));
        PlatformComponent platformComponent = client.controller(PlatformComponent.class).updateOrCreate(new PlatformComponent(null, "cardDesginerComponent", "https://github.com/seybi87/openshift-dummy-app.git", null));
        ApplicationComponent applicationComponent = client.controller(ApplicationComponent.class).updateOrCreate(new ApplicationComponent(application.getId(), platformComponent.getId(), null));
        PlatformApi platformApi = client.controller(PlatformApi.class).updateOrCreate(new PlatformApi(null, "openshift", "openshift"));
        Platform platform = client.controller(Platform.class).updateOrCreate(new Platform(null, "openshift", "https://openshift.redhat.com", platformApi.getId()));
        //PlatformCredential platformCredential = client.controller(PlatformCredential.class).updateOrCreate(new PlatformCredential(null, "daniel.seybold@uni-ulm.de", "tR5e3jvr23", platform.getId(), tenant.getId()));
        PlatformCredential platformCredential = client.controller(PlatformCredential.class).get(1);
        PlatformHardware platformHardware = client.controller(PlatformHardware.class).updateOrCreate(new PlatformHardware(null, 1, 1000l, 10.0f));
        PlatformRuntime platformRuntime = client.controller(PlatformRuntime.class).updateOrCreate(new PlatformRuntime(null, "Java", "Server", 1.7f)); //TODO float ist stupid, what is with version "1.9.2beta"?
        PlatformEnvironment platformEnvironment = client.controller(PlatformEnvironment.class).updateOrCreate(new PlatformEnvironment(null, "cardDesignerEnv", platform.getId(), platformHardware.getId(), platformRuntime.getId()));
        //PlatformEnvironment platformEnvironment = client.controller(PlatformEnvironment.class).get(1);
        PlatformEnvironmentTemplate platformEnvironmentTemplate = client.controller(PlatformEnvironmentTemplate.class).updateOrCreate(new PlatformEnvironmentTemplate(null, platform.getId(), platformHardware.getId(), platformRuntime.getId()));
        //TODO what is the template good for?
        ApplicationInstance applicationInstance = client.controller(ApplicationInstance.class).updateOrCreate(new ApplicationInstance(application.getId()));
        PlatformInstance platformInstance = client.controller(PlatformInstance.class).updateOrCreate(new PlatformInstance(null, applicationComponent.getId(), applicationInstance.getId(), platformEnvironment.getId(), null));
    }
}
