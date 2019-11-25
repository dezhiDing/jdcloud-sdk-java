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
 * 订阅密钥
 * 订阅密钥相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建密钥
 */
public class CreateSubscriptionKeyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 描述
     */
    private String description;

    /**
     * 密钥名称
     */
    private String name;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 密钥名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 密钥名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 描述
     *
     * @param description
     */
    public CreateSubscriptionKeyRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 密钥名称
     *
     * @param name
     */
    public CreateSubscriptionKeyRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateSubscriptionKeyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}