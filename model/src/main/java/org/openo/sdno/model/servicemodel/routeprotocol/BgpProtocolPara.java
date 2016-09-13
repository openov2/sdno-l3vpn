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

package org.openo.sdno.model.servicemodel.routeprotocol;

import java.util.List;

import org.openo.sdno.model.common.NVString;
import org.openo.sdno.model.paradesc.ContainerSizeDesc;
import org.openo.sdno.model.paradesc.IPDesc;
import org.openo.sdno.model.paradesc.IntegerDesc;
import org.openo.sdno.model.paradesc.StringDesc;
import org.openo.sdno.model.servicemodel.AbstractSvcModel;

/**
 * Routing protocol parameter class.<br>
 * 
 * @author
 * @version SDNO 0.5 Aug 4, 2016
 */
public class BgpProtocolPara extends AbstractSvcModel {

    @StringDesc(maxLen = 36)
    private String uuid;

    @StringDesc(maxLen = 36)
    private String peerAsNumber;

    @IntegerDesc(minVal = 0)
    private Integer bgpMaxPrefix;

    @IPDesc
    private String peerIp;

    @ContainerSizeDesc(maxSize = 1000)
    private List<NVString> addtionalInfo;

    public List<NVString> getAddtionalInfo() {
        return addtionalInfo;
    }

    public void setAddtionalInfo(List<NVString> addtionalInfo) {
        this.addtionalInfo = addtionalInfo;
    }

    /**
     * @return Returns the peerAsNumber.
     */
    public String getPeerAsNumber() {
        return peerAsNumber;
    }

    /**
     * @param peerAsNumber The peerAsNumber to set.
     */
    public void setPeerAsNumber(String peerAsNumber) {
        this.peerAsNumber = peerAsNumber;
    }

    /**
     * @return Returns the bgpMaxPrefix.
     */
    public Integer getBgpMaxPrefix() {
        return bgpMaxPrefix;
    }

    /**
     * @param bgpMaxPrefix The bgpMaxPrefix to set.
     */
    public void setBgpMaxPrefix(Integer bgpMaxPrefix) {
        this.bgpMaxPrefix = bgpMaxPrefix;
    }

    /**
     * @return Returns the peerIp.
     */
    public String getPeerIp() {
        return peerIp;
    }

    /**
     * @param peerIp The peerIp to set.
     */
    public void setPeerIp(String peerIp) {
        this.peerIp = peerIp;
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    @Override
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
