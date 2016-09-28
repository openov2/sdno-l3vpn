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

package org.openo.sdno.model.servicemodel.tunnel;

import java.util.List;

import org.openo.sdno.model.paradesc.StringDesc;
import org.openo.sdno.model.servicemodel.AbstractSvcModel;

/**
 * 
 * Path Constraints class<br>
 * 
 * @author
 * @version     SDNO 0.5  Aug 4, 2016
 */
public class PathConstraints extends AbstractSvcModel {

    @StringDesc(pattern = "[a-zA-Z0-9\\-\\_]{1,36}")
    private String uuid;

    private List<TunnelSpecificPathConstraint> tunnelConstraints;

    public List<TunnelSpecificPathConstraint> getTunnelConstraints() {
        return tunnelConstraints;
    }

    public void setTunnelConstraints(final List<TunnelSpecificPathConstraint> tunnelConstraints) {
        this.tunnelConstraints = tunnelConstraints;
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
