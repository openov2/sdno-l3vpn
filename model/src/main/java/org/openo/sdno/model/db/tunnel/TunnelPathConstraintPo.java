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

package org.openo.sdno.model.db.tunnel;

import org.openo.sdno.model.db.FieldConvertUtil;
import org.openo.sdno.model.db.PoModel;
import org.openo.sdno.model.servicemodel.mss.annotation.MOInvField;
import org.openo.sdno.model.servicemodel.mss.annotation.MOResType;
import org.openo.sdno.model.servicemodel.mss.annotation.MOUUIDField;
import org.openo.sdno.model.servicemodel.tunnel.TunnelPathConstraint;

/**
 * Tunnel path constraint class.<br>
 * 
 * @author
 * @version SDNO 0.5 Aug 8, 2016
 */
@MOResType(infoModelName = "wan_tunnelpathconstraint")
public class TunnelPathConstraintPo implements PoModel<TunnelPathConstraint> {

    @MOUUIDField
    @MOInvField(invName = "id")
    private String uuid;

    private Integer setupPriority;

    private Integer holdupPriority;

    private String mplsTESpecId;

    @Override
    public TunnelPathConstraint toSvcModel() {
        final TunnelPathConstraint svcModel = new TunnelPathConstraint();
        FieldConvertUtil.setA2B(this, svcModel);
        return svcModel;
    }

    @Override
    public void fromSvcModel(final TunnelPathConstraint svcModel) {
        FieldConvertUtil.setA2B(svcModel, this);
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    @Override
    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public Integer getSetupPriority() {
        return setupPriority;
    }

    public void setSetupPriority(Integer setupPriority) {
        this.setupPriority = setupPriority;
    }

    public Integer getHoldupPriority() {
        return holdupPriority;
    }

    public void setHoldupPriority(Integer holdupPriority) {
        this.holdupPriority = holdupPriority;
    }

    public String getMplsTESpecId() {
        return mplsTESpecId;
    }

    public void setMplsTESpecId(String mplsTESpecId) {
        this.mplsTESpecId = mplsTESpecId;
    }

}
