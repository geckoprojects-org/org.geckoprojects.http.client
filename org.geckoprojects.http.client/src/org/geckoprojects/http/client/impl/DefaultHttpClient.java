/*******************************************************************************
 * Copyright 2021 Data In Motion Consulting GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *******************************************************************************/
package org.geckoprojects.http.client.impl;

import java.net.http.HttpClient;

import org.geckoprojects.http.client.Constants;
import org.geckoprojects.http.client.HttpClientName;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.component.propertytypes.ServiceDescription;

@HttpClientName(value = ".default")
@ServiceDescription(DefaultHttpClient.DESCRIPTION)
@Component(service = HttpClient.class, scope = ServiceScope.PROTOTYPE, configurationPid = Constants.PID_HTTP_CLIENT_DEFAULT)
public class DefaultHttpClient extends AbstractHttpClient {

    protected final static String DESCRIPTION = "The default java.net.http.HttpClient.";

    HttpClient inner = HttpClient.newHttpClient();

    @Override
    protected HttpClient inner() {

        return inner;
    }

}
