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
 * API分组
 * 提供API分组的创建、查询、删除、修改等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建API分组
 */
public class CreateApiGroupResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建的API分组ID
     */
    private String apiGroupId;

    /**
     * 修订版本号
     */
    private String revision;


    /**
     * get 创建的API分组ID
     *
     * @return
     */
    public String getApiGroupId() {
        return apiGroupId;
    }

    /**
     * set 创建的API分组ID
     *
     * @param apiGroupId
     */
    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
    }

    /**
     * get 修订版本号
     *
     * @return
     */
    public String getRevision() {
        return revision;
    }

    /**
     * set 修订版本号
     *
     * @param revision
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }


    /**
     * set 创建的API分组ID
     *
     * @param apiGroupId
     */
    public CreateApiGroupResult apiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }

    /**
     * set 修订版本号
     *
     * @param revision
     */
    public CreateApiGroupResult revision(String revision) {
        this.revision = revision;
        return this;
    }


}