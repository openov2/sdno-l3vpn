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

package org.openo.sdno.l3vpnservice.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openo.baseservice.remoteservice.exception.ServiceException;
import org.openo.sdno.wanvpn.util.query.BatchQueryParams;
import org.openo.sdno.wanvpn.util.query.BatchQueryResult;
import org.openo.sdno.model.servicemodel.brs.LtpMO;
import org.openo.sdno.result.Result;
import org.openo.sdno.wanvpn.inventory.sdk.inf.BaseInvDao;
import org.openo.sdno.wanvpn.inventory.sdk.result.ResultRsp;

import mockit.Mocked;

public class NEServiceImplTest {

    @Mocked
    private HttpServletRequest httpServletRequest;

    @Test
    public void queryPortsByNeIdTest() throws Exception {
        final NEServiceImpl service = new NEServiceImpl();
        service.setInvTpService(new BaseInvDao<LtpMO>() {

            @Override
            public Result<List<LtpMO>> queryAllMOs() throws ServiceException {
                return null;
            }

            @Override
            public Result<LtpMO> queryMOById(final String uuid) throws ServiceException {
                return null;
            }

            @Override
            public Result<List<LtpMO>> queryMOByParam(final Map<String, String> paramMap) throws ServiceException {
                final LtpMO ltpMO = new LtpMO();
                ltpMO.setId("123");
                ltpMO.setName("ltp");
                return new Result<>(0, Collections.singletonList(ltpMO));
            }

            @Override
            public ResultRsp<List<LtpMO>> queryPageMOByParam(final Map<String, String> paramMap)
                    throws ServiceException {
                // TODO Auto-generated method stub
                return null;
            }
        });

        final BatchQueryResult<LtpMO> ports = service.getNePorts("1", new BatchQueryParams(), httpServletRequest);
        Assert.assertNotNull(ports);
        Assert.assertTrue(CollectionUtils.isNotEmpty(ports.getData()));
    }

}
