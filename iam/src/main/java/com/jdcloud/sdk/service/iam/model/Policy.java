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

package com.jdcloud.sdk.service.iam.model;


/**
 * policy
 */
public class Policy  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略id
     */
    private String policyId;

    /**
     * 策略名称
     */
    private String name;

    /**
     * jrn描述
     */
    private String jrn;

    /**
     * 描述
     */
    private String description;

    /**
     * 策略类型:0-系统策略，1-用户策略
     */
    private String policyType;

    /**
     * 策略版本号
     */
    private String version;

    /**
     * 默认策略文档版本
     */
    private Integer defaultEdition;

    /**
     * 策略创建时间
     */
    private String createTime;

    /**
     * 策略更新时间
     */
    private String updateTime;


    /**
     * get 策略id
     *
     * @return
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * set 策略id
     *
     * @param policyId
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * get 策略名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 策略名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get jrn描述
     *
     * @return
     */
    public String getJrn() {
        return jrn;
    }

    /**
     * set jrn描述
     *
     * @param jrn
     */
    public void setJrn(String jrn) {
        this.jrn = jrn;
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
     * get 策略类型:0-系统策略，1-用户策略
     *
     * @return
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * set 策略类型:0-系统策略，1-用户策略
     *
     * @param policyType
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * get 策略版本号
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 策略版本号
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get 默认策略文档版本
     *
     * @return
     */
    public Integer getDefaultEdition() {
        return defaultEdition;
    }

    /**
     * set 默认策略文档版本
     *
     * @param defaultEdition
     */
    public void setDefaultEdition(Integer defaultEdition) {
        this.defaultEdition = defaultEdition;
    }

    /**
     * get 策略创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 策略创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 策略更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 策略更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 策略id
     *
     * @param policyId
     */
    public Policy policyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * set 策略名称
     *
     * @param name
     */
    public Policy name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set jrn描述
     *
     * @param jrn
     */
    public Policy jrn(String jrn) {
        this.jrn = jrn;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public Policy description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 策略类型:0-系统策略，1-用户策略
     *
     * @param policyType
     */
    public Policy policyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * set 策略版本号
     *
     * @param version
     */
    public Policy version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 默认策略文档版本
     *
     * @param defaultEdition
     */
    public Policy defaultEdition(Integer defaultEdition) {
        this.defaultEdition = defaultEdition;
        return this;
    }

    /**
     * set 策略创建时间
     *
     * @param createTime
     */
    public Policy createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 策略更新时间
     *
     * @param updateTime
     */
    public Policy updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}