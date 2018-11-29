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

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 导入机密
 */
public class ImportSecretRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 密钥包的内容
     */
    private String secretPackage;


    /**
     * get 密钥包的内容
     *
     * @return
     */
    public String getSecretPackage() {
        return secretPackage;
    }

    /**
     * set 密钥包的内容
     *
     * @param secretPackage
     */
    public void setSecretPackage(String secretPackage) {
        this.secretPackage = secretPackage;
    }


    /**
     * set 密钥包的内容
     *
     * @param secretPackage
     */
    public ImportSecretRequest secretPackage(String secretPackage) {
        this.secretPackage = secretPackage;
        return this;
    }


}