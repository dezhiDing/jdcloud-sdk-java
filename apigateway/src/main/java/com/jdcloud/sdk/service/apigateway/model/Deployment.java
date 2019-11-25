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

package com.jdcloud.sdk.service.apigateway.model;


/**
 * 部署列表
 */
public class Deployment  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部署ID
     */
    private String deploymentId;

    /**
     * 发布的修订版本号
     */
    private String revision;

    /**
     * 路径
     */
    private String path;

    /**
     * 环境：test、preview、online
     */
    private String environment;

    /**
     * 后端服务类型：mock、unique、vpc
     */
    private String backendServiceType;

    /**
     * 后端地址
     */
    private String backendUrl;

    /**
     * 描述
     */
    private String description;

    /**
     * 发布日期，格式为毫秒级时间戳
     */
    private Long createTime;

    /**
     * 微服务网关名称
     */
    private String jdsfName;

    /**
     * 微服务注册中心ID
     */
    private String jdsfRegistryName;

    /**
     * 微服务ID
     */
    private String jdsfId;


    /**
     * get 部署ID
     *
     * @return
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * set 部署ID
     *
     * @param deploymentId
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * get 发布的修订版本号
     *
     * @return
     */
    public String getRevision() {
        return revision;
    }

    /**
     * set 发布的修订版本号
     *
     * @param revision
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * get 路径
     *
     * @return
     */
    public String getPath() {
        return path;
    }

    /**
     * set 路径
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
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
     * get 后端服务类型：mock、unique、vpc
     *
     * @return
     */
    public String getBackendServiceType() {
        return backendServiceType;
    }

    /**
     * set 后端服务类型：mock、unique、vpc
     *
     * @param backendServiceType
     */
    public void setBackendServiceType(String backendServiceType) {
        this.backendServiceType = backendServiceType;
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
     * get 微服务网关名称
     *
     * @return
     */
    public String getJdsfName() {
        return jdsfName;
    }

    /**
     * set 微服务网关名称
     *
     * @param jdsfName
     */
    public void setJdsfName(String jdsfName) {
        this.jdsfName = jdsfName;
    }

    /**
     * get 微服务注册中心ID
     *
     * @return
     */
    public String getJdsfRegistryName() {
        return jdsfRegistryName;
    }

    /**
     * set 微服务注册中心ID
     *
     * @param jdsfRegistryName
     */
    public void setJdsfRegistryName(String jdsfRegistryName) {
        this.jdsfRegistryName = jdsfRegistryName;
    }

    /**
     * get 微服务ID
     *
     * @return
     */
    public String getJdsfId() {
        return jdsfId;
    }

    /**
     * set 微服务ID
     *
     * @param jdsfId
     */
    public void setJdsfId(String jdsfId) {
        this.jdsfId = jdsfId;
    }


    /**
     * set 部署ID
     *
     * @param deploymentId
     */
    public Deployment deploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * set 发布的修订版本号
     *
     * @param revision
     */
    public Deployment revision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * set 路径
     *
     * @param path
     */
    public Deployment path(String path) {
        this.path = path;
        return this;
    }

    /**
     * set 环境：test、preview、online
     *
     * @param environment
     */
    public Deployment environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * set 后端服务类型：mock、unique、vpc
     *
     * @param backendServiceType
     */
    public Deployment backendServiceType(String backendServiceType) {
        this.backendServiceType = backendServiceType;
        return this;
    }

    /**
     * set 后端地址
     *
     * @param backendUrl
     */
    public Deployment backendUrl(String backendUrl) {
        this.backendUrl = backendUrl;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public Deployment description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 发布日期，格式为毫秒级时间戳
     *
     * @param createTime
     */
    public Deployment createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 微服务网关名称
     *
     * @param jdsfName
     */
    public Deployment jdsfName(String jdsfName) {
        this.jdsfName = jdsfName;
        return this;
    }

    /**
     * set 微服务注册中心ID
     *
     * @param jdsfRegistryName
     */
    public Deployment jdsfRegistryName(String jdsfRegistryName) {
        this.jdsfRegistryName = jdsfRegistryName;
        return this;
    }

    /**
     * set 微服务ID
     *
     * @param jdsfId
     */
    public Deployment jdsfId(String jdsfId) {
        this.jdsfId = jdsfId;
        return this;
    }


}