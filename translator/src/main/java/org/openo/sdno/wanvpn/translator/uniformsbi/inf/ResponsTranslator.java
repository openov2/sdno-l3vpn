/*
 * Copyright (c) 2016, Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.sdno.wanvpn.translator.uniformsbi.inf;

import org.openo.baseservice.remoteservice.exception.ServiceException;
import org.openo.baseservice.roa.util.restclient.RestfulResponse;
import org.openo.sdno.model.uniformsbi.base.AdapterResponseInfo;

/**
 * The interface of the uniformsbi response translator.<br/>
 * 
 * @author
 * @version SDNO 0.5 Aug 1, 2016
 */
public interface ResponsTranslator {

    /**
     * Translate response to AdapterResponseInfo.<br/>
     * 
     * @param response Response object
     * @return translation result
     * @throws ServiceException when translate failed
     * @since SDNO 0.5
     */
    AdapterResponseInfo tranlate(RestfulResponse response) throws ServiceException;
}