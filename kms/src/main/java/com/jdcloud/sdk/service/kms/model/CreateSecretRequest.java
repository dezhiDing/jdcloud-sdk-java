/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Secret Management Service
 * 基于硬件保护机密的安全数据托管服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.kms.model.SecretCfg;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建机密
 */
public class CreateSecretRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * secretCfg
     * Required:true
     */
    @Required
    private SecretCfg secretCfg;


    /**
     * get secretCfg
     *
     * @return
     */
    public SecretCfg getSecretCfg() {
        return secretCfg;
    }

    /**
     * set secretCfg
     *
     * @param secretCfg
     */
    public void setSecretCfg(SecretCfg secretCfg) {
        this.secretCfg = secretCfg;
    }


    /**
     * set secretCfg
     *
     * @param secretCfg
     */
    public CreateSecretRequest secretCfg(SecretCfg secretCfg) {
        this.secretCfg = secretCfg;
        return this;
    }


}