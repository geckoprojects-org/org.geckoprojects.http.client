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

package org.geckoprojects.http.client.impl.cookie.store;

import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.Collections;
import java.util.List;

import org.geckoprojects.http.client.Constants;
import org.geckoprojects.http.client.CookieStoreName;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

@CookieStoreName("EMPTY")
@Component(service = CookieStore.class, scope = ServiceScope.SINGLETON, configurationPid = Constants.PID_HTTP_CLIENT_COOKIE_STORE_EMPTY)
public class EmptyCookieStore implements CookieStore {

    @Override
    public void add(URI uri, HttpCookie cookie) {

    }

    @Override
    public List<HttpCookie> get(URI uri) {

        return Collections.emptyList();
    }

    @Override
    public List<HttpCookie> getCookies() {

        return Collections.emptyList();
    }

    @Override
    public List<URI> getURIs() {

        return Collections.emptyList();
    }

    @Override
    public boolean remove(URI uri, HttpCookie cookie) {

        return false;
    }

    @Override
    public boolean removeAll() {

        return false;
    }
}