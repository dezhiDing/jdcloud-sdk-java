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
 * Monitoring Rules APIs
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.monitor.model.CreateAlarmParam;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建报警规则，可以为某一个实例创建报警规则，也可以为多个实例同时创建报警规则。
 */
public class CreateAlarmRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 幂等性校验参数,最长36位,若两个请求clientToken相等，则返回第一次创建的规则id，只创建一次规则
     * Required:true
     */
    @Required
    private String clientToken;

    /**
     * createAlarmSpec
     * Required:true
     */
    @Required
    private CreateAlarmParam createAlarmSpec;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 幂等性校验参数,最长36位,若两个请求clientToken相等，则返回第一次创建的规则id，只创建一次规则
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 幂等性校验参数,最长36位,若两个请求clientToken相等，则返回第一次创建的规则id，只创建一次规则
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * get createAlarmSpec
     *
     * @return
     */
    public CreateAlarmParam getCreateAlarmSpec() {
        return createAlarmSpec;
    }

    /**
     * set createAlarmSpec
     *
     * @param createAlarmSpec
     */
    public void setCreateAlarmSpec(CreateAlarmParam createAlarmSpec) {
        this.createAlarmSpec = createAlarmSpec;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 幂等性校验参数,最长36位,若两个请求clientToken相等，则返回第一次创建的规则id，只创建一次规则
     *
     * @param clientToken
     */
    public CreateAlarmRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set createAlarmSpec
     *
     * @param createAlarmSpec
     */
    public CreateAlarmRequest createAlarmSpec(CreateAlarmParam createAlarmSpec) {
        this.createAlarmSpec = createAlarmSpec;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public CreateAlarmRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}