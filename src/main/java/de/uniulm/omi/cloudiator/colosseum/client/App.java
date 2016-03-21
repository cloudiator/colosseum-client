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
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.KeyValue;

import java.util.ArrayList;
import java.util.HashMap;
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
    }
}
