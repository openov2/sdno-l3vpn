/*
 * Copyright (c) 2016, Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.openo.sdno.model.uniformsbi.comnontypes.enums;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AdminStatusTest {

    @Test
    public void testAdminDown() {
        AdminStatus demo = AdminStatus.ADMIN_DOWN;
        assertTrue(demo.getIntValueByName("adminDown") == 1);

    }

    @Test
    public void testAdminUp() {
        AdminStatus demo = AdminStatus.ADMIN_UP;
        assertTrue(demo.getIntValueByName("adminUp") == 0);

    }

    @Test
    public void testError() {
        AdminStatus demo = AdminStatus.ADMIN_UP;
        assertTrue(demo.getIntValueByName("name") == -1);

    }

}
