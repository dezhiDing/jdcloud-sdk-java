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
 * customer
 * 客户管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.partner.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询客户信息
 */
public class QueryMyCustomerListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户pin（客户账户）
     */
    private String customerPin;

    /**
     * 客户昵称
     */
    private String aliasName;

    /**
     * 关联开始时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private String startRelTime;

    /**
     * 关联结束时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private String endRelTime;

    /**
     * 当前页序号
     */
    private Integer pageIndex;

    /**
     * 当前条数
     */
    private Integer pageSize;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 客户pin（客户账户）
     *
     * @return
     */
    public String getCustomerPin() {
        return customerPin;
    }

    /**
     * set 客户pin（客户账户）
     *
     * @param customerPin
     */
    public void setCustomerPin(String customerPin) {
        this.customerPin = customerPin;
    }

    /**
     * get 客户昵称
     *
     * @return
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * set 客户昵称
     *
     * @param aliasName
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * get 关联开始时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @return
     */
    public String getStartRelTime() {
        return startRelTime;
    }

    /**
     * set 关联开始时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param startRelTime
     */
    public void setStartRelTime(String startRelTime) {
        this.startRelTime = startRelTime;
    }

    /**
     * get 关联结束时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @return
     */
    public String getEndRelTime() {
        return endRelTime;
    }

    /**
     * set 关联结束时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param endRelTime
     */
    public void setEndRelTime(String endRelTime) {
        this.endRelTime = endRelTime;
    }

    /**
     * get 当前页序号
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 当前条数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 当前条数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get regionId
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 客户pin（客户账户）
     *
     * @param customerPin
     */
    public QueryMyCustomerListRequest customerPin(String customerPin) {
        this.customerPin = customerPin;
        return this;
    }

    /**
     * set 客户昵称
     *
     * @param aliasName
     */
    public QueryMyCustomerListRequest aliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * set 关联开始时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param startRelTime
     */
    public QueryMyCustomerListRequest startRelTime(String startRelTime) {
        this.startRelTime = startRelTime;
        return this;
    }

    /**
     * set 关联结束时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param endRelTime
     */
    public QueryMyCustomerListRequest endRelTime(String endRelTime) {
        this.endRelTime = endRelTime;
        return this;
    }

    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public QueryMyCustomerListRequest pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 当前条数
     *
     * @param pageSize
     */
    public QueryMyCustomerListRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public QueryMyCustomerListRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}