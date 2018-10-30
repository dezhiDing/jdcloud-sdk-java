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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 重启RDS实例，例如修改了一些配置参数后，需要重启实例才能生效。可以结合主备切换的功能，轮流重启备机，降低对业务的影响&lt;br&gt;**注意：如果实例正在进行备份，那么重启主实例将会终止备份操作。** 可以查看备份策略中的备份开始时间确认是否有备份正在运行。如果确实需要在实例备份时重启主实例，建议重启后，手工进行一次实例的全备。
 */
public class RebootInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否重启主节点。&lt;br&gt; - 仅SQL Server 支持该参数
     */
    private Boolean rebootMaster;

    /**
     * 是否重启备节点。&lt;br&gt; - 仅SQL Server 支持该参数
     */
    private Boolean rebootSlave;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 是否重启主节点。&lt;br&gt; - 仅SQL Server 支持该参数
     *
     * @return
     */
    public Boolean getRebootMaster() {
        return rebootMaster;
    }

    /**
     * set 是否重启主节点。&lt;br&gt; - 仅SQL Server 支持该参数
     *
     * @param rebootMaster
     */
    public void setRebootMaster(Boolean rebootMaster) {
        this.rebootMaster = rebootMaster;
    }

    /**
     * get 是否重启备节点。&lt;br&gt; - 仅SQL Server 支持该参数
     *
     * @return
     */
    public Boolean getRebootSlave() {
        return rebootSlave;
    }

    /**
     * set 是否重启备节点。&lt;br&gt; - 仅SQL Server 支持该参数
     *
     * @param rebootSlave
     */
    public void setRebootSlave(Boolean rebootSlave) {
        this.rebootSlave = rebootSlave;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 是否重启主节点。&lt;br&gt; - 仅SQL Server 支持该参数
     *
     * @param rebootMaster
     */
    public RebootInstanceRequest rebootMaster(Boolean rebootMaster) {
        this.rebootMaster = rebootMaster;
        return this;
    }

    /**
     * set 是否重启备节点。&lt;br&gt; - 仅SQL Server 支持该参数
     *
     * @param rebootSlave
     */
    public RebootInstanceRequest rebootSlave(Boolean rebootSlave) {
        this.rebootSlave = rebootSlave;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public RebootInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public RebootInstanceRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}