/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */

package org.openo.sdno.wanvpn.inventory.sdk.impl.nbi;

import org.openo.baseservice.roa.util.restclient.RestfulResponse;
import org.openo.sdno.exception.ErrorCode;
import org.openo.sdno.result.ErrorCodeInfo;
import org.openo.sdno.result.InvRsp;

/**
 * PUER inventory super NBI bean.<br>
 * 
 * @author
 * @version SDNO 0.5 2016-6-3
 */
public class PuerInvSuperNbiBean {

    protected static final int QUERY_PAGE_NUM = 50;

    protected InvRsp buildRsp(final RestfulResponse response, final String resType) {
        final ErrorCodeInfo tatalErrorCode =
                new ErrorCodeInfo(ErrorCode.OPERATION_FAIL, response.getResponseContent(), resType);
        final InvRsp responseValue = new InvRsp(ErrorCode.OPERATION_FAIL);
        responseValue.getMsg().setTatalErrorCode(tatalErrorCode);
        return responseValue;
    }
}
