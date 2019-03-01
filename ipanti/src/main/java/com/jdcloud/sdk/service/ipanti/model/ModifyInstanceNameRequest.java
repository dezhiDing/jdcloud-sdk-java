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
 * Anti DDos Pro Instance APIs
 * Anti DDos Pro Instance APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.ipanti.model.RenameInstanceSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改实例名称
 */
public class ModifyInstanceNameRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修改实例名称请求参数
     * Required:true
     */
    @Required
    private RenameInstanceSpec renameInstanceSpec;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例 ID
     * Required:true
     */
    @Required
    private Long instanceId;


    /**
     * get 修改实例名称请求参数
     *
     * @return
     */
    public RenameInstanceSpec getRenameInstanceSpec() {
        return renameInstanceSpec;
    }

    /**
     * set 修改实例名称请求参数
     *
     * @param renameInstanceSpec
     */
    public void setRenameInstanceSpec(RenameInstanceSpec renameInstanceSpec) {
        this.renameInstanceSpec = renameInstanceSpec;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例 ID
     *
     * @return
     */
    public Long getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例 ID
     *
     * @param instanceId
     */
    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 修改实例名称请求参数
     *
     * @param renameInstanceSpec
     */
    public ModifyInstanceNameRequest renameInstanceSpec(RenameInstanceSpec renameInstanceSpec) {
        this.renameInstanceSpec = renameInstanceSpec;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyInstanceNameRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例 ID
     *
     * @param instanceId
     */
    public ModifyInstanceNameRequest instanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}