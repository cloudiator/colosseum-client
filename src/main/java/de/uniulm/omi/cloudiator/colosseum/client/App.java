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

        ClientBuilder clientBuilder = ClientBuilder.getNew()
            // the base url
            .url(url)
            // the login credentials
            .credentials(username, password);

        Client client = clientBuilder.build();

        //get the controller for the cloud entity
        final ClientController<Cloud> controller = client.controller(Cloud.class);

        //get the controller for the api entity
        final ClientController<Api> apiController = client.controller(Api.class);

        //create a new API
        Api api = apiController.create(new Api("ApiName-" + random.nextInt(1000), "InternalProviderName-" + random.nextInt(100)));

        //create a new Cloud
        controller.create(new Cloud("MyCloud-" + random.nextInt(1000), "endpointTest.com", api.getId()));

        //fetch all clouds
        List<Cloud> clouds = controller.getList();

        //fetch the first cloud from the list
        Cloud cloud = clouds.get(0);

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
        FrontendUser johnDoe = factory.singleton(new FrontendUser("John", "Doe", "john.doe@example.com", null, null));
        FrontendGroup adminGroup = factory.singleton(new FrontendGroup("admin", null));
        Api openstackApi = factory.singleton(new Api("openstack", "openstack-nova"));
        Application couchbaseApplication = factory.singleton(new Application("Cloudbase"));
        Cloud omistackCloud = factory.singleton(new Cloud("omistack",
            "http://url.com/", openstackApi.getId()));
        CloudCredential adminOmistack = factory.singleton(new CloudCredential("tenant:user", "secret", omistackCloud.getId(), adminGroup.getId()));
        /** TODO how to add cloudcredentials to location? */
        HardwareOffer mediumFlavour = factory.singleton(new HardwareOffer(4, 2048l, 20000000l));
        GeoLocation ulm = factory.singleton(new GeoLocation("BW", "Ulm", "Deutschland", "ISO-OMG", 1.0f, 1.0f));
        /** TODO Location does not work, since the Locations shoud be added to the frontendusergroup directly */
        Location location = factory.singleton(new Location(omistackCloud.getId(), "regionOne", null, LocationScope.HOST, true, ulm.getId() ));
        List<Long> locations = new ArrayList();
        locations.add(location.getId());
        Hardware omistackMediumFlavour = factory.singleton(new Hardware(omistackCloud.getId(), mediumFlavour.getId(), null, locations));
        OperatingSystemVendor ubuntu = factory.singleton(new OperatingSystemVendor("ubuntu", OperatingSystemVendorType.NIX));
        OperatingSystem ubuntuCurrent = factory.singleton(new OperatingSystem(OperatingSystemArchitecture.AMD64, ubuntu.getId(), "14.04"));
        Image rawUbuntuImage = factory.singleton(new Image("Ubuntu Server 14.04", null, omistackCloud.getId(), locations, null /* should be os, not working currently */));
        VirtualMachineTemplate mediumUbuntuServer = factory.singleton(new VirtualMachineTemplate(omistackCloud.getId(), rawUbuntuImage.getId(), location.getId(), omistackMediumFlavour.getId()));
        LifecycleComponent couchbaseComponent = factory.singleton(new LifecycleComponent("CouchbaseComponent", "...", "...", "...",
            "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "..."));
        ApplicationComponent couchbaseAppComponent = factory.singleton(new ApplicationComponent(couchbaseApplication.getId(), couchbaseComponent.getId(), mediumUbuntuServer.getId()));


        //to change an object in the database:
        openstackApi.setName("openstack");
        cw.Api().update(openstackApi);





        /******
         *
         * Example scalability rule:
         *
         */
            //        //schedule
            //        Schedule schedule = scheduleController.create(new Schedule(5l, TimeUnit.SECONDS));
            //
            //        //time window
            //        TimeWindow timeWindow = timeWindowController.create(new TimeWindow(20l, TimeUnit.MINUTES));
            //
            //        //sensor description
            //        SensorDescription sensorDescription = sensorDescriptionController.create(new SensorDescription("de.uniulm.omi.cloudiator.visor.monitoring.sensors.CpuUsageSensor", "cpu_usage", true));
            //
            //        //raw monitor
            //        RawMonitor rawMonitor = rawMonitorController.create(new RawMonitor(app.getId(), null, null, null, sensorDescription.getId(), schedule.getId()));
            //
            //        //monitor instance
            //        //MonitorInstance monitorInstance = monitorInstanceController.create(new MonitorInstance(monitor, ipaddress, vm, component))
            //
            //        //formula quantifier
            //        FormulaQuantifier formulaQuantifier = formulaQuantifierController.create(new FormulaQuantifier(true, 1.0));
            //
            //        //constant monitor
            //        ConstantMonitor constantMonitor = constantMonitorController.create(new ConstantMonitor(20.0));
            //
            //        //scaling action
            //        ComponentHorizontalOutScalingAction scalingAction = componentHorizontalOutScalingActionController.create(new ComponentHorizontalOutScalingAction(1l, 2l, 3l, 4l, ac.getId()));
            //
            //        // monitors (for composed monitor)
            //        List<Long> monitors = new ArrayList();
            //        monitors.add(rawMonitor.getId());
            //
            //        // scaling actions (for composed monitor)
            //        List<Long> actions = new ArrayList();
            //        monitors.add(scalingAction.getId());
            //
            //        //composed monitor
            //        ComposedMonitor composedMonitor = composedMonitorController.create(new ComposedMonitor(
            //            FlowOperator.REDUCE, FormulaOperator.AND, formulaQuantifier.getId(), timeWindow.getId(), monitors, actions, schedule.getInterval()));
    }
}
