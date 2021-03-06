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
 * 云物理服务器
 * 云物理服务器负载均衡实例操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询负载均衡实例列表
 */
public class QueryLoadBalancersRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为20；取值范围[20, 100]
     */
    private Integer pageSize;

    /**
     * 状态
     */
    private String status;

    /**
     * 名称
     */
    private String name;

    /**
     * 私有网络ID，精确匹配
     */
    private String vpcId;

    /**
     * 是否绑定eip
     */
    private Boolean bindEip;

    /**
     * loadBalancerId - 负载均衡实例ID，精确匹配，支持多个

     */
    private List<Filter> filters;

    /**
     * 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码；默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认为20；取值范围[20, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为20；取值范围[20, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 私有网络ID，精确匹配
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络ID，精确匹配
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 是否绑定eip
     *
     * @return
     */
    public Boolean getBindEip() {
        return bindEip;
    }

    /**
     * set 是否绑定eip
     *
     * @param bindEip
     */
    public void setBindEip(Boolean bindEip) {
        this.bindEip = bindEip;
    }

    /**
     * get loadBalancerId - 负载均衡实例ID，精确匹配，支持多个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set loadBalancerId - 负载均衡实例ID，精确匹配，支持多个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public QueryLoadBalancersRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认为20；取值范围[20, 100]
     *
     * @param pageSize
     */
    public QueryLoadBalancersRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public QueryLoadBalancersRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public QueryLoadBalancersRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 私有网络ID，精确匹配
     *
     * @param vpcId
     */
    public QueryLoadBalancersRequest vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 是否绑定eip
     *
     * @param bindEip
     */
    public QueryLoadBalancersRequest bindEip(Boolean bindEip) {
        this.bindEip = bindEip;
        return this;
    }

    /**
     * set loadBalancerId - 负载均衡实例ID，精确匹配，支持多个

     *
     * @param filters
     */
    public QueryLoadBalancersRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public QueryLoadBalancersRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to loadBalancerId - 负载均衡实例ID，精确匹配，支持多个

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}