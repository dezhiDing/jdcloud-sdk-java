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

package com.jdcloud.sdk.service.ag.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 可用组详情
 */
public class AvailabilityGroup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 可用组id
     */
    private String id;

    /**
     * 可用组name
     */
    private String name;

    /**
     * 描述，length:0-256
     */
    private String description;

    /**
     * 实例模板的Id
     */
    private String instanceTemplateId;

    /**
     * 可用区域
     */
    private List<String> azs;

    /**
     * 可用组类型，支持vm
     */
    private String agType;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 可用组中实例的数量
     */
    private Number count;

    /**
     * 是否开启自动伸缩
     */
    private Boolean autoScaling;


    /**
     * get 可用组id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 可用组id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 可用组name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 可用组name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 描述，length:0-256
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述，length:0-256
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 实例模板的Id
     *
     * @return
     */
    public String getInstanceTemplateId() {
        return instanceTemplateId;
    }

    /**
     * set 实例模板的Id
     *
     * @param instanceTemplateId
     */
    public void setInstanceTemplateId(String instanceTemplateId) {
        this.instanceTemplateId = instanceTemplateId;
    }

    /**
     * get 可用区域
     *
     * @return
     */
    public List<String> getAzs() {
        return azs;
    }

    /**
     * set 可用区域
     *
     * @param azs
     */
    public void setAzs(List<String> azs) {
        this.azs = azs;
    }

    /**
     * get 可用组类型，支持vm
     *
     * @return
     */
    public String getAgType() {
        return agType;
    }

    /**
     * set 可用组类型，支持vm
     *
     * @param agType
     */
    public void setAgType(String agType) {
        this.agType = agType;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 可用组中实例的数量
     *
     * @return
     */
    public Number getCount() {
        return count;
    }

    /**
     * set 可用组中实例的数量
     *
     * @param count
     */
    public void setCount(Number count) {
        this.count = count;
    }

    /**
     * get 是否开启自动伸缩
     *
     * @return
     */
    public Boolean getAutoScaling() {
        return autoScaling;
    }

    /**
     * set 是否开启自动伸缩
     *
     * @param autoScaling
     */
    public void setAutoScaling(Boolean autoScaling) {
        this.autoScaling = autoScaling;
    }


    /**
     * set 可用组id
     *
     * @param id
     */
    public AvailabilityGroup id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 可用组name
     *
     * @param name
     */
    public AvailabilityGroup name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 描述，length:0-256
     *
     * @param description
     */
    public AvailabilityGroup description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 实例模板的Id
     *
     * @param instanceTemplateId
     */
    public AvailabilityGroup instanceTemplateId(String instanceTemplateId) {
        this.instanceTemplateId = instanceTemplateId;
        return this;
    }

    /**
     * set 可用区域
     *
     * @param azs
     */
    public AvailabilityGroup azs(List<String> azs) {
        this.azs = azs;
        return this;
    }

    /**
     * set 可用组类型，支持vm
     *
     * @param agType
     */
    public AvailabilityGroup agType(String agType) {
        this.agType = agType;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public AvailabilityGroup createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 可用组中实例的数量
     *
     * @param count
     */
    public AvailabilityGroup count(Number count) {
        this.count = count;
        return this;
    }

    /**
     * set 是否开启自动伸缩
     *
     * @param autoScaling
     */
    public AvailabilityGroup autoScaling(Boolean autoScaling) {
        this.autoScaling = autoScaling;
        return this;
    }


    /**
     * add item to 可用区域
     *
     * @param az
     */
    public void addAz(String az) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(az);
    }

}