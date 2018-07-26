/*
 * Copyright 2018-2025 JDCLOUD.COM
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
 * 云监控规则相关接口
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询监控规则
 */
public class DescribeAlarmsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品名称
     */
    private String serviceCode;

    /**
     * 资源Id
     */
    private String resourceId;

    /**
     * 规则报警状态, 1：正常, 2：报警，4：数据不足
     */
    private Integer status;

    /**
     * 是否为正在报警的规则，0为忽略，1为是，与 status 同时只能生效一个,isAlarming 优先生效
     */
    private Integer isAlarming;

    /**
     * 规则状态：1为启用，0为禁用
     */
    private Integer enabled;

    /**
     * 当前所在页，默认为1
     */
    private Integer pageNumber;

    /**
     * ，默认为20；取值范围[1, 100]
     */
    private Integer pageSize;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 产品名称
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品名称
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 资源Id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源Id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 规则报警状态, 1：正常, 2：报警，4：数据不足
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 规则报警状态, 1：正常, 2：报警，4：数据不足
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 是否为正在报警的规则，0为忽略，1为是，与 status 同时只能生效一个,isAlarming 优先生效
     *
     * @return
     */
    public Integer getIsAlarming() {
        return isAlarming;
    }

    /**
     * set 是否为正在报警的规则，0为忽略，1为是，与 status 同时只能生效一个,isAlarming 优先生效
     *
     * @param isAlarming
     */
    public void setIsAlarming(Integer isAlarming) {
        this.isAlarming = isAlarming;
    }

    /**
     * get 规则状态：1为启用，0为禁用
     *
     * @return
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * set 规则状态：1为启用，0为禁用
     *
     * @param enabled
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * get 当前所在页，默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前所在页，默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get ，默认为20；取值范围[1, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set ，默认为20；取值范围[1, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
     * set 产品名称
     *
     * @param serviceCode
     */
    public DescribeAlarmsRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 资源Id
     *
     * @param resourceId
     */
    public DescribeAlarmsRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 规则报警状态, 1：正常, 2：报警，4：数据不足
     *
     * @param status
     */
    public DescribeAlarmsRequest status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 是否为正在报警的规则，0为忽略，1为是，与 status 同时只能生效一个,isAlarming 优先生效
     *
     * @param isAlarming
     */
    public DescribeAlarmsRequest isAlarming(Integer isAlarming) {
        this.isAlarming = isAlarming;
        return this;
    }

    /**
     * set 规则状态：1为启用，0为禁用
     *
     * @param enabled
     */
    public DescribeAlarmsRequest enabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 当前所在页，默认为1
     *
     * @param pageNumber
     */
    public DescribeAlarmsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set ，默认为20；取值范围[1, 100]
     *
     * @param pageSize
     */
    public DescribeAlarmsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public DescribeAlarmsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}