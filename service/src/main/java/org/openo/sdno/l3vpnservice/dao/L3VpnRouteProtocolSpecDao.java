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

import org.openo.sdno.model.db.l3vpn.L3VpnRouteProtocolSpecPo;
import org.openo.sdno.wanvpn.dao.vpn.AbstractRouteProtocolSpecDao;
import org.springframework.stereotype.Repository;

/**
 * L3VPN route protocol data access object class.<br>
 * 
 * @author
 * @version SDNO 0.5 August 2, 2016
 */
@Repository("l3VpnRouteProtocolSpecDao")
public class L3VpnRouteProtocolSpecDao extends AbstractRouteProtocolSpecDao<L3VpnRouteProtocolSpecPo> {

    @Override
    protected Class<L3VpnRouteProtocolSpecPo> getPoClass() {
        return L3VpnRouteProtocolSpecPo.class;
    }
}
