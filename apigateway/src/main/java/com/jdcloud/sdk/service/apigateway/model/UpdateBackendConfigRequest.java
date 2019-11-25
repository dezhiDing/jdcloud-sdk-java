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
 * 后端配置
 * 后端配置
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.apigateway.model.SimpleParameter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改后端配置
 */
public class UpdateBackendConfigRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 接口ID
     */
    private String backendConfigId;

    /**
     * 分组ID
     */
    private String baseGroupId;

    /**
     * 环境：test、preview、online
     * Required:true
     */
    @Required
    private String environment;

    /**
     * 后端地址
     */
    private String backendUrl;

    /**
     * 后端服务类型：mock、HTTP/HTTPS
     * Required:true
     */
    @Required
    private String backendServiceType;

    /**
     * header参数列表
     */
    private List<SimpleParameter> headerParams;

    /**
     * query参数列表
     */
    private List<SimpleParameter> queryParams;

    /**
     * 描述
     */
    private String description;

    /**
     * 发布日期，格式为毫秒级时间戳
     */
    private Long createTime;

    /**
     * 排序，赋值0时为默认的后端配置
     * Required:true
     */
    @Required
    private Integer sort;

    /**
     * 排序，用于展示使用
     */
    private Integer userSort;

    /**
     * vpc网关id
     */
    private String jdsfId;

    /**
     * vpc后端地址
     */
    private String jdsfParam;

    /**
     * vpc网关所属region
     */
    private String jdsfRegion;

    /**
     * vpc网关创建者的pin
     */
    private String jdsfPin;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 分组ID
     * Required:true
     */
    @Required
    private String apiGroupId;


    /**
     * get 接口ID
     *
     * @return
     */
    public String getBackendConfigId() {
        return backendConfigId;
    }

    /**
     * set 接口ID
     *
     * @param backendConfigId
     */
    public void setBackendConfigId(String backendConfigId) {
        this.backendConfigId = backendConfigId;
    }

    /**
     * get 分组ID
     *
     * @return
     */
    public String getBaseGroupId() {
        return baseGroupId;
    }

    /**
     * set 分组ID
     *
     * @param baseGroupId
     */
    public void setBaseGroupId(String baseGroupId) {
        this.baseGroupId = baseGroupId;
    }

    /**
     * get 环境：test、preview、online
     *
     * @return
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * set 环境：test、preview、online
     *
     * @param environment
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * get 后端地址
     *
     * @return
     */
    public String getBackendUrl() {
        return backendUrl;
    }

    /**
     * set 后端地址
     *
     * @param backendUrl
     */
    public void setBackendUrl(String backendUrl) {
        this.backendUrl = backendUrl;
    }

    /**
     * get 后端服务类型：mock、HTTP/HTTPS
     *
     * @return
     */
    public String getBackendServiceType() {
        return backendServiceType;
    }

    /**
     * set 后端服务类型：mock、HTTP/HTTPS
     *
     * @param backendServiceType
     */
    public void setBackendServiceType(String backendServiceType) {
        this.backendServiceType = backendServiceType;
    }

    /**
     * get header参数列表
     *
     * @return
     */
    public List<SimpleParameter> getHeaderParams() {
        return headerParams;
    }

    /**
     * set header参数列表
     *
     * @param headerParams
     */
    public void setHeaderParams(List<SimpleParameter> headerParams) {
        this.headerParams = headerParams;
    }

    /**
     * get query参数列表
     *
     * @return
     */
    public List<SimpleParameter> getQueryParams() {
        return queryParams;
    }

    /**
     * set query参数列表
     *
     * @param queryParams
     */
    public void setQueryParams(List<SimpleParameter> queryParams) {
        this.queryParams = queryParams;
    }

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
     * get 发布日期，格式为毫秒级时间戳
     *
     * @return
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * set 发布日期，格式为毫秒级时间戳
     *
     * @param createTime
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * get 排序，赋值0时为默认的后端配置
     *
     * @return
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * set 排序，赋值0时为默认的后端配置
     *
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * get 排序，用于展示使用
     *
     * @return
     */
    public Integer getUserSort() {
        return userSort;
    }

    /**
     * set 排序，用于展示使用
     *
     * @param userSort
     */
    public void setUserSort(Integer userSort) {
        this.userSort = userSort;
    }

    /**
     * get vpc网关id
     *
     * @return
     */
    public String getJdsfId() {
        return jdsfId;
    }

    /**
     * set vpc网关id
     *
     * @param jdsfId
     */
    public void setJdsfId(String jdsfId) {
        this.jdsfId = jdsfId;
    }

    /**
     * get vpc后端地址
     *
     * @return
     */
    public String getJdsfParam() {
        return jdsfParam;
    }

    /**
     * set vpc后端地址
     *
     * @param jdsfParam
     */
    public void setJdsfParam(String jdsfParam) {
        this.jdsfParam = jdsfParam;
    }

    /**
     * get vpc网关所属region
     *
     * @return
     */
    public String getJdsfRegion() {
        return jdsfRegion;
    }

    /**
     * set vpc网关所属region
     *
     * @param jdsfRegion
     */
    public void setJdsfRegion(String jdsfRegion) {
        this.jdsfRegion = jdsfRegion;
    }

    /**
     * get vpc网关创建者的pin
     *
     * @return
     */
    public String getJdsfPin() {
        return jdsfPin;
    }

    /**
     * set vpc网关创建者的pin
     *
     * @param jdsfPin
     */
    public void setJdsfPin(String jdsfPin) {
        this.jdsfPin = jdsfPin;
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
     * set 接口ID
     *
     * @param backendConfigId
     */
    public UpdateBackendConfigRequest backendConfigId(String backendConfigId) {
        this.backendConfigId = backendConfigId;
        return this;
    }

    /**
     * set 分组ID
     *
     * @param baseGroupId
     */
    public UpdateBackendConfigRequest baseGroupId(String baseGroupId) {
        this.baseGroupId = baseGroupId;
        return this;
    }

    /**
     * set 环境：test、preview、online
     *
     * @param environment
     */
    public UpdateBackendConfigRequest environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * set 后端地址
     *
     * @param backendUrl
     */
    public UpdateBackendConfigRequest backendUrl(String backendUrl) {
        this.backendUrl = backendUrl;
        return this;
    }

    /**
     * set 后端服务类型：mock、HTTP/HTTPS
     *
     * @param backendServiceType
     */
    public UpdateBackendConfigRequest backendServiceType(String backendServiceType) {
        this.backendServiceType = backendServiceType;
        return this;
    }

    /**
     * set header参数列表
     *
     * @param headerParams
     */
    public UpdateBackendConfigRequest headerParams(List<SimpleParameter> headerParams) {
        this.headerParams = headerParams;
        return this;
    }

    /**
     * set query参数列表
     *
     * @param queryParams
     */
    public UpdateBackendConfigRequest queryParams(List<SimpleParameter> queryParams) {
        this.queryParams = queryParams;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public UpdateBackendConfigRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 发布日期，格式为毫秒级时间戳
     *
     * @param createTime
     */
    public UpdateBackendConfigRequest createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 排序，赋值0时为默认的后端配置
     *
     * @param sort
     */
    public UpdateBackendConfigRequest sort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * set 排序，用于展示使用
     *
     * @param userSort
     */
    public UpdateBackendConfigRequest userSort(Integer userSort) {
        this.userSort = userSort;
        return this;
    }

    /**
     * set vpc网关id
     *
     * @param jdsfId
     */
    public UpdateBackendConfigRequest jdsfId(String jdsfId) {
        this.jdsfId = jdsfId;
        return this;
    }

    /**
     * set vpc后端地址
     *
     * @param jdsfParam
     */
    public UpdateBackendConfigRequest jdsfParam(String jdsfParam) {
        this.jdsfParam = jdsfParam;
        return this;
    }

    /**
     * set vpc网关所属region
     *
     * @param jdsfRegion
     */
    public UpdateBackendConfigRequest jdsfRegion(String jdsfRegion) {
        this.jdsfRegion = jdsfRegion;
        return this;
    }

    /**
     * set vpc网关创建者的pin
     *
     * @param jdsfPin
     */
    public UpdateBackendConfigRequest jdsfPin(String jdsfPin) {
        this.jdsfPin = jdsfPin;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UpdateBackendConfigRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public UpdateBackendConfigRequest apiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }


    /**
     * add item to header参数列表
     *
     * @param headerParam
     */
    public void addHeaderParam(SimpleParameter headerParam) {
        if (this.headerParams == null) {
            this.headerParams = new ArrayList<>();
        }
        this.headerParams.add(headerParam);
    }

    /**
     * add item to query参数列表
     *
     * @param queryParam
     */
    public void addQueryParam(SimpleParameter queryParam) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList<>();
        }
        this.queryParams.add(queryParam);
    }

}