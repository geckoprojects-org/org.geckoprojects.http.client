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

import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public class AbstractCookieStore implements CookieStore {

    private final CookieStore delegate;

    public AbstractCookieStore() {

        delegate = new CookieManager().getCookieStore();
    }

    @Override
    public void add(URI uri, HttpCookie cookie) {

        delegate.add(uri, cookie);
    }

    @Override
    public List<HttpCookie> get(URI uri) {

        return delegate.get(uri);
    }

    @Override
    public List<HttpCookie> getCookies() {

        return delegate.getCookies();
    }

    @Override
    public List<URI> getURIs() {

        return delegate.getURIs();
    }

    @Override
    public boolean remove(URI uri, HttpCookie cookie) {

        return delegate.remove(uri, cookie);
    }

    @Override
    public boolean removeAll() {

        return delegate.removeAll();
    }
}