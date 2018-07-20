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
 * 快照相关接口
 * 快照相关接口，提供创建快照，查询快照信息，删除快照，修改快照信息等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询云硬盘快照信息详情
 */
public class DescribeSnapshotRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 快照ID
     * Required:true
     */
    @Required
    private String snapshotId;


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
     * get 快照ID
     *
     * @return
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * set 快照ID
     *
     * @param snapshotId
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeSnapshotRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 快照ID
     *
     * @param snapshotId
     */
    public DescribeSnapshotRequest snapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }


}