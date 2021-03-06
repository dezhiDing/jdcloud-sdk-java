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

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * loadBalancer
 */
public class LoadBalancer  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 负载均衡实例ID
     */
    private String loadBalancerId;

    /**
     * 地域，如cn-east-1
     */
    private String region;

    /**
     * IP版本，取值ipv4
     */
    private String ipAddressType;

    /**
     * 网络类型，取值public
     */
    private String netType;

    /**
     * 私有网络ID
     */
    private String vpcId;

    /**
     * 弹性公网IPID
     */
    private String elasticIpId;

    /**
     * 公网IP
     */
    private String publicIp;

    /**
     * 带宽
     */
    private Integer bandwidth;

    /**
     * 状态，取值active|inactive
     */
    private String status;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 计费配置
     */
    private Charge charge;


    /**
     * get 负载均衡实例ID
     *
     * @return
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * set 负载均衡实例ID
     *
     * @param loadBalancerId
     */
    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    /**
     * get 地域，如cn-east-1
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域，如cn-east-1
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get IP版本，取值ipv4
     *
     * @return
     */
    public String getIpAddressType() {
        return ipAddressType;
    }

    /**
     * set IP版本，取值ipv4
     *
     * @param ipAddressType
     */
    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * get 网络类型，取值public
     *
     * @return
     */
    public String getNetType() {
        return netType;
    }

    /**
     * set 网络类型，取值public
     *
     * @param netType
     */
    public void setNetType(String netType) {
        this.netType = netType;
    }

    /**
     * get 私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 弹性公网IPID
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 弹性公网IPID
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }

    /**
     * get 公网IP
     *
     * @return
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * set 公网IP
     *
     * @param publicIp
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * get 带宽
     *
     * @return
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * set 带宽
     *
     * @param bandwidth
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * get 状态，取值active|inactive
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态，取值active|inactive
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
     * get 计费配置
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }


    /**
     * set 负载均衡实例ID
     *
     * @param loadBalancerId
     */
    public LoadBalancer loadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }

    /**
     * set 地域，如cn-east-1
     *
     * @param region
     */
    public LoadBalancer region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set IP版本，取值ipv4
     *
     * @param ipAddressType
     */
    public LoadBalancer ipAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
        return this;
    }

    /**
     * set 网络类型，取值public
     *
     * @param netType
     */
    public LoadBalancer netType(String netType) {
        this.netType = netType;
        return this;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public LoadBalancer vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 弹性公网IPID
     *
     * @param elasticIpId
     */
    public LoadBalancer elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }

    /**
     * set 公网IP
     *
     * @param publicIp
     */
    public LoadBalancer publicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * set 带宽
     *
     * @param bandwidth
     */
    public LoadBalancer bandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set 状态，取值active|inactive
     *
     * @param status
     */
    public LoadBalancer status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public LoadBalancer name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public LoadBalancer description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public LoadBalancer createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public LoadBalancer charge(Charge charge) {
        this.charge = charge;
        return this;
    }


}