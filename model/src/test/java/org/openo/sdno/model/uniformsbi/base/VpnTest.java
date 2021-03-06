/*
 * Copyright 2017 Huawei Technologies Co., Ltd.
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

package org.openo.sdno.model.uniformsbi.base;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openo.sdno.framework.container.util.JsonUtil;
import org.openo.sdno.model.JsonFileUtil;

public class VpnTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() throws IOException {
        String filePath = new File("src/test/resources/vpn.json").getCanonicalPath();
        Vpn vpn = JsonUtil.fromJson(JsonFileUtil.getJsonString(filePath), Vpn.class);
        vpn.setAdminStatusFromString(null);
        vpn.setAdminStatusFromString("up");
        vpn.setAdminStatusFromString("down");
        assertNotNull(vpn);
        assertNotNull(JsonUtil.toJson(vpn));
    }

}
