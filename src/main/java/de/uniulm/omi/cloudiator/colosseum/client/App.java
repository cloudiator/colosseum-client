/*
 * Copyright (c) 2015 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.uniulm.omi.cloudiator.colosseum.client;

import de.uniulm.omi.cloudiator.colosseum.client.entities.*;
import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App {

    public static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        /*****
         *
         *  Very simple and fast-forward example of using the client:
         *
         */
        //An example
        String url = "http://localhost:9000/api";
        String username = "john.doe@example.com";
        String password = "admin";
        String tenant = "admin";

        ClientBuilder clientBuilder = ClientBuilder.getNew()
            // the base url
            .url(url)
                // the login credentials
            .credentials(username, tenant, password);

        Client client = clientBuilder.build();

        //get the controller for the cloud entity
        final ClientController<Cloud> controller = client.controller(Cloud.class);

        //get the controller for the api entity
        final ClientController<Api> apiController = client.controller(Api.class);

        //create a new API
        Api api = apiController.create(new Api("ApiName-" + random.nextInt(10000),
            "InternalProviderName-" + random.nextInt(100)));

        //create a new Cloud
        controller
            .create(new Cloud("MyCloud-" + random.nextInt(10000), "endpointTest.com", api.getId()));

        //fetch all clouds
        List<Cloud> clouds = controller.getList();

        //fetch the first cloud from the list
        Cloud cloud = clouds.get(0);

        //create a another Cloud
        cloud = controller
            .create(new Cloud("MyCloud-" + random.nextInt(1000), "endpointTest.com", api.getId()));

        //update a cloud
        cloud.setName("MyNewName-" + random.nextInt(100));
        controller.update(cloud);

        //delete a cloud
        controller.delete(cloud);



        /*****
         *
         * Helper classes to make the client communication more convenient.
         *
         * The ClientWrapper offers methods to get the CloudController
         * in an simplified way.
         *
         * The SingletonWrapper checks if the entity with adequate values
         * are already stored in the database - if so, it returns the
         * already existing object.
         *
         */
        ClientWrapper cw = new ClientWrapper(client);
        SingletonFactory factory = new SingletonFactory(client);



        /******
         *
         * More advanced example of a deployment
         *
         */
        /** TODO the creation of a new user does always fail */
        FrontendUser johnDoe =
            factory.singleton(new FrontendUser("John", "Doe", "john.doe@example.com", null, null));
        List<Long> frontendUsers = new ArrayList<>();
        frontendUsers.add(johnDoe.getId());
        Tenant adminGroup = factory.singleton(new Tenant("admin", frontendUsers));
        Api openstackApi = factory.singleton(new Api("openstack", "openstack-nova"));
        Application couchbaseApplication = factory.singleton(new Application("Cloudbase"));
        Cloud omistackCloud = factory.singleton(
            new Cloud("omistack", "http://omistack.e-technik.uni-ulm.de:5000/v2.0",
                openstackApi.getId()));
        CloudCredential adminOmistack = factory.singleton(
            new CloudCredential("paasage:user", "password",
                omistackCloud.getId(), adminGroup.getId()));
        List<Long> cloudCredentials = new ArrayList<>();
        cloudCredentials.add(adminOmistack.getId());
        // Pause so the syncing of the cloud may happen before we find the hardware, etc.
        //if(true)return;
        Thread.sleep(150000);
        HardwareOffer mediumFlavour = factory.singleton(new HardwareOffer(4, 4096l, null));
        GeoLocation ulm =
            factory.singleton(new GeoLocation("BW", "Ulm", "Deutschland", "ISO-OMG", 1.0f, 1.0f));
        Location location = factory.singleton(
            new Location(omistackCloud.getId(), "regionOne", null, LocationScope.HOST, true,
                ulm.getId(), cloudCredentials));
        List<Long> locations = new ArrayList();
        locations.add(location.getId());
        Hardware omistackMediumFlavour = factory.singleton(
            new Hardware(omistackCloud.getId(), mediumFlavour.getId(), "hardware_wf_", locations,
                cloudCredentials));
        OperatingSystemVendor ubuntu =
            factory.singleton(new OperatingSystemVendor("Ubuntu", OperatingSystemVendorType.NIX));
        OperatingSystem ubuntuCurrent = factory.singleton(
            new OperatingSystem(OperatingSystemArchitecture.AMD64, ubuntu.getId(), "14.04"));
        Image rawUbuntuImage = factory.singleton(
            new Image("Ubuntu Server 14.04", null, omistackCloud.getId(), locations, null /* should be os, not working currently */,
                cloudCredentials));
        VirtualMachineTemplate mediumUbuntuServer = factory.singleton(
            new VirtualMachineTemplate(omistackCloud.getId(), rawUbuntuImage.getId(),
                location.getId(), omistackMediumFlavour.getId()));
        LifecycleComponent couchbaseComponent = factory.singleton(
            new LifecycleComponent("CouchbaseComponent", "...", "...", "...", "...", "...", "...",
                "...", "...", "...", "...", "...", "...", "..."));
        ApplicationComponent couchbaseAppComponent = factory.singleton(
            new ApplicationComponent(couchbaseApplication.getId(), couchbaseComponent.getId(),
                mediumUbuntuServer.getId()));
        ApplicationInstance couchbaseApplicationInstance =
            factory.singleton(new ApplicationInstance(couchbaseApplication.getId()));
        VirtualMachine couchNode_1 = factory.singleton(
            new VirtualMachine("frank_srl_couchbase_1", omistackCloud.getId(),
                rawUbuntuImage.getId(), omistackMediumFlavour.getId(), location.getId(),
                "whatshouldthisclouduuidbe?1"));
        VirtualMachine couchNode_2 = factory.singleton(
            new VirtualMachine("frank_srl_couchbase_2", omistackCloud.getId(),
                rawUbuntuImage.getId(), omistackMediumFlavour.getId(), location.getId(),
                "whatshouldthisclouduuidbe?2"));
        VirtualMachine couchNode_3 = factory.singleton(
            new VirtualMachine("frank_srl_couchbase_3", omistackCloud.getId(),
                rawUbuntuImage.getId(), omistackMediumFlavour.getId(), location.getId(),
                "whatshouldthisclouduuidbe?3"));
        Instance couchNodeInstance_1 = factory.singleton(
            new Instance(couchbaseAppComponent.getId(), couchbaseApplicationInstance.getId(),
                couchNode_1.getId()));
        Instance couchNodeInstance_2 = factory.singleton(
            new Instance(couchbaseAppComponent.getId(), couchbaseApplicationInstance.getId(),
                couchNode_2.getId()));
        Instance couchNodeInstance_3 = factory.singleton(
            new Instance(couchbaseAppComponent.getId(), couchbaseApplicationInstance.getId(),
                couchNode_3.getId()));
        IpAddress couchNodeIpPublic_1 =
            factory.singleton(new IpAddress("134.60.64.49", couchNode_1.getId(), "PUBLIC"));
        IpAddress couchNodeIpPublic_2 =
            factory.singleton(new IpAddress("134.60.64.48", couchNode_2.getId(), "PUBLIC"));
        IpAddress couchNodeIpPublic_3 =
            factory.singleton(new IpAddress("134.60.64.40", couchNode_3.getId(), "PUBLIC"));
        IpAddress couchNodeIpPrivate_1 =
            factory.singleton(new IpAddress("192.168.3.80", couchNode_1.getId(), "PRIVATE"));
        IpAddress couchNodeIpPrivate_2 =
            factory.singleton(new IpAddress("192.168.3.83", couchNode_2.getId(), "PRIVATE"));
        IpAddress couchNodeIpPrivate_3 =
            factory.singleton(new IpAddress("192.168.3.82", couchNode_3.getId(), "PRIVATE"));
        Communication couchbaseCommunication = factory.singleton(
            new Communication(couchbaseAppComponent.getId(), couchbaseAppComponent.getId(), 123));
        CommunicationChannel communication1_2 = factory.singleton(
            new CommunicationChannel(couchbaseCommunication.getId(), couchNodeInstance_1.getId(),
                couchNodeInstance_2.getId()));
        // The communication chanel has to be set up between each instance to handle synchronization...

        //Example: How to change an object in the database:
        openstackApi.setName("openstack");
        cw.Api().update(openstackApi);



        //if(true)return;


        // delete existing monitors:
        for(ComposedMonitor m : cw.ComposedMonitor().getList()){
            cw.ComposedMonitor().delete(m);
        }
        for(RawMonitor m : cw.RawMonitor().getList()){
            cw.RawMonitor().delete(m);
        }


        //if(true)return;


        /******
         *
         * Example scalability rule:
         *
         */
        //schedule
        Schedule schedule = factory.singleton(new Schedule(5l, TimeUnit.SECONDS));

        //time window
        TimeWindow timeWindow = factory.singleton(new TimeWindow(20l, TimeUnit.MINUTES));

        //sensor description
        SensorDescription sensorDescription = factory.singleton(new SensorDescription(
            "de.uniulm.omi.cloudiator.visor.sensors.CpuUsageSensor", "cpu_usage", true));

        //raw monitor
        RawMonitor rawMonitor = factory.singleton(
            new RawMonitor(null, couchbaseApplication.getId(), null, null, null,
                sensorDescription.getId(), schedule.getId()));


        //if(true)return;


        // external references for ScalingAction
        List<String> extRefScalingActions = new ArrayList<>();
        extRefScalingActions.add("some_weird_external_reference_123");

        //scaling action
        ComponentHorizontalOutScalingAction scalingAction = factory.singleton(
            new ComponentHorizontalOutScalingAction(extRefScalingActions, 1l, 2l, 3l, 4l,
                couchbaseAppComponent.getId()));

        //monitor instance
        // this is done automatically:
        //MonitorInstance monitorInstance = factory.singleton(
        //    new MonitorInstance(rawMonitor.getId(), couchNodeIpPrivate_1.getId(),
        //        couchNode_1.getId(), couchbaseComponent.getId()));

        //formula quantifier
        FormulaQuantifier formulaQuantifier = factory.singleton(new FormulaQuantifier(true, 1.0));

        //constant monitor
        ConstantMonitor constantMonitor = factory.singleton(new ConstantMonitor(null, 20.0));

        // monitors (for composed monitor)
        List<Long> monitors = new ArrayList();
        monitors.add(rawMonitor.getId());
        //monitors.add(constantMonitor.getId());

        // scaling actions (for composed monitor)
        List<Long> actions = new ArrayList();
        actions.add(scalingAction.getId());

        //composed monitor
        ComposedMonitor composedMonitor = factory.singleton(
            new ComposedMonitor(null, FlowOperator.MAP, FormulaOperator.AVG, formulaQuantifier.getId(),
                timeWindow.getId(), monitors, actions, schedule.getId()));


        Thread.sleep(1000);

        int i = 1;
        for(MonitorInstance mi : cw.MonitorInstance().getList()){
            if(mi.getMonitor().equals(composedMonitor.getId())){
                mi.getExternalReferences().add("CPU_raw_metric_context___Bind_with_vm_cloudbaseVM_" + i);
                i++;
                cw.MonitorInstance().update(mi);
            }
        }
        // Subscribe to last monitor for listening to values:
        MonitorSubscription monitorSubscription =
            cw.MonitorSubscription().create(new MonitorSubscription(composedMonitor.getId(),
                "localhost", SubscriptionType.CDO, FilterType.ANY, 0.0));

    }
}
