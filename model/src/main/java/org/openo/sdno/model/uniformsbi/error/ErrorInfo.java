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

package org.openo.sdno.model.uniformsbi.error;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Error information model class.<br>
 * 
 * @author
 * @version SDNO 0.5 August 4, 2016
 */
@XmlRootElement(name = "error-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class ErrorInfo {

    @XmlElement(name = "error-code")
    private String errorCode = null;

    @XmlElement(name = "error-paras")
    private ErrorParas errorParas = null;

    public String getErrorCode() {
        return errorCode;
    }

    public ErrorParas getErrorParas() {
        return errorParas;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorParas(ErrorParas errorParas) {
        this.errorParas = errorParas;
    }

}
