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

package org.openo.sdno.l3vpnservice.dao;

import org.openo.sdno.model.db.l3vpn.L3VpnIpTpSpecPo;
import org.openo.sdno.wanvpn.dao.vpn.AbstractIpTpSpecDao;
import org.springframework.stereotype.Repository;

/**
 * IP TP data access object class.<br>
 * 
 * @author
 * @version SDNO 0.5 August 2, 2016
 */
@Repository("l3VpnIpTpSpecDao")
public class L3VpnIpTpSpecDao extends AbstractIpTpSpecDao<L3VpnIpTpSpecPo> {

    @Override
    protected Class<L3VpnIpTpSpecPo> getPoClass() {
        return L3VpnIpTpSpecPo.class;
    }

}
