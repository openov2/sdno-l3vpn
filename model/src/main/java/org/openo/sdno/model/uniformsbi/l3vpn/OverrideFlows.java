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

package org.openo.sdno.model.uniformsbi.l3vpn;

import java.util.List;

/**
 * <br>
 *
 * @author zhaozhongchao@huawei.com
 * @version SDNO 0.5 Dec 6, 2016
 */
public class OverrideFlows {

    private List<OverrideFlow> overrideFlow;

    /**
     * @return Returns the overrideFlow.
     */
    public List<OverrideFlow> getOverrideFlow() {
        return overrideFlow;
    }

    /**
     * @param overrideFlow The overrideFlow to set.
     */
    public void setOverrideFlow(List<OverrideFlow> overrideFlow) {
        this.overrideFlow = overrideFlow;
    }

}
