/**
 * This document is a part of the source code and related artifacts
 * for CollectionSpace, an open source collections management system
 * for museums and related institutions:
 *
 * http://www.collectionspace.org
 * http://wiki.collectionspace.org
 *
 * Copyright (c) 2009 Regents of the University of California
 *
 * Licensed under the Educational Community License (ECL), Version 2.0.
 * You may not use this file except in compliance with this License.
 *
 * You may obtain a copy of the ECL 2.0 License at
 * https://source.collectionspace.org/collection-space/LICENSE.txt
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.collectionspace.services.client;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.ClientResponse;

/**
 * A CollectionObjectClient.

 * @version $Revision:$
 */
public class TestServiceClient extends AbstractServiceClientImpl {

    /**
     *
     * Returning NULL since this class is a base-level client, used (only)
     * to obtain the base service URL.
     *
     */
    @Override
    public String getServicePathComponent() {
        throw new UnsupportedOperationException();
    }


    @Override
    public CollectionSpaceProxy getProxy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setProxy() {
        throw new UnsupportedOperationException();
    }

    public ClientResponse<Response> delete(String csid) {
	throw new UnsupportedOperationException();
    } 
}
