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

package com.jdcloud.sdk.service.renewal.model;


/**
 * relationResource
 */
public class RelationResource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源ID
     */
    private String resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 产品线
     */
    private String serviceCode;

    /**
     * 计费类型
     */
    private Integer billingType;

    /**
     * 到期时间
     */
    private String expireTime;

    /**
     * 地域
     */
    private String dataCenter;

    /**
     * 是否开通自动续费(0:未开通,1:已开通)
     */
    private Integer autoRenew;

    /**
     * 倒计时
     */
    private Integer lastTime;

    /**
     * 关联资源特殊需求
     */
    private String remark;


    /**
     * get 资源ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * get 产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 计费类型
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }

    /**
     * get 到期时间
     *
     * @return
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * set 到期时间
     *
     * @param expireTime
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * get 地域
     *
     * @return
     */
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * set 地域
     *
     * @param dataCenter
     */
    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    /**
     * get 是否开通自动续费(0:未开通,1:已开通)
     *
     * @return
     */
    public Integer getAutoRenew() {
        return autoRenew;
    }

    /**
     * set 是否开通自动续费(0:未开通,1:已开通)
     *
     * @param autoRenew
     */
    public void setAutoRenew(Integer autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * get 倒计时
     *
     * @return
     */
    public Integer getLastTime() {
        return lastTime;
    }

    /**
     * set 倒计时
     *
     * @param lastTime
     */
    public void setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * get 关联资源特殊需求
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 关联资源特殊需求
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public RelationResource resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public RelationResource resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public RelationResource serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public RelationResource billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * set 到期时间
     *
     * @param expireTime
     */
    public RelationResource expireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * set 地域
     *
     * @param dataCenter
     */
    public RelationResource dataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * set 是否开通自动续费(0:未开通,1:已开通)
     *
     * @param autoRenew
     */
    public RelationResource autoRenew(Integer autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * set 倒计时
     *
     * @param lastTime
     */
    public RelationResource lastTime(Integer lastTime) {
        this.lastTime = lastTime;
        return this;
    }

    /**
     * set 关联资源特殊需求
     *
     * @param remark
     */
    public RelationResource remark(String remark) {
        this.remark = remark;
        return this;
    }


}