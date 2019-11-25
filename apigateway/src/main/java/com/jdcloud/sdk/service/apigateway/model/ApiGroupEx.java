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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;


/**
 * 提供给Tag组展示的api分组，仅包含id，region和name
 */
public class ApiGroupEx  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分组ID
     */
    private String apiGroupId;

    /**
     * 名称
     */
    private String groupName;

    /**
     * 区域
     */
    private String regionId;


    /**
     * get 分组ID
     *
     * @return
     */
    public String getApiGroupId() {
        return apiGroupId;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set 名称
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * get 区域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public ApiGroupEx apiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }

    /**
     * set 名称
     *
     * @param groupName
     */
    public ApiGroupEx groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * set 区域
     *
     * @param regionId
     */
    public ApiGroupEx regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}