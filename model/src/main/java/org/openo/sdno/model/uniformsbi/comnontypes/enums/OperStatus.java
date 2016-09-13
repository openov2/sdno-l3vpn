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

package org.openo.sdno.model.uniformsbi.comnontypes.enums;

import org.codehaus.jackson.annotate.JsonCreator;

/**
 * The enum class of operation class.<br>
 * 
 * @author
 * @version SDNO 0.5 2016-6-6
 */
public enum OperStatus {
    OPERATE_UP("operateUp"), OPERATE_DOWN("operateDown");

    private String name;

    private OperStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Create OperStatus by name.<br>
     * 
     * @param name status name
     * @return OperStatus Object
     * @since SDNO 0.5
     */
    @JsonCreator
    public static OperStatus fromName(String name) {
        if(OPERATE_UP.getName().equals(name)) {
            return OPERATE_UP;
        } else if(OPERATE_DOWN.getName().equals(name)) {
            return OPERATE_DOWN;
        }
        return OPERATE_DOWN;
    }
}
