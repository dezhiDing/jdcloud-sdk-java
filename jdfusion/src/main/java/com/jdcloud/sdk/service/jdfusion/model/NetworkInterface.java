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

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 网卡接口规范
 */
public class NetworkInterface  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 以太网地址
     */
    private String macAddress;

    /**
     * 弹性网卡ID
     */
    private String networkInterfaceId;

    /**
     * 源和目标IP地址校验,取值为0或者1
     */
    private Integer sanityCheck;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * 虚拟网络ID
     */
    private String vpcId;

    /**
     * primaryIp
     */
    private Ip primaryIp;

    /**
     * 网卡辅IP
     */
    private List<Ip> secondaryIps;

    /**
     * 所属安全组列表
     */
    private List<SecurityGroup> securityGroups;


    /**
     * get 以太网地址
     *
     * @return
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * set 以太网地址
     *
     * @param macAddress
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * get 弹性网卡ID
     *
     * @return
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * set 弹性网卡ID
     *
     * @param networkInterfaceId
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * get 源和目标IP地址校验,取值为0或者1
     *
     * @return
     */
    public Integer getSanityCheck() {
        return sanityCheck;
    }

    /**
     * set 源和目标IP地址校验,取值为0或者1
     *
     * @param sanityCheck
     */
    public void setSanityCheck(Integer sanityCheck) {
        this.sanityCheck = sanityCheck;
    }

    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 虚拟网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 虚拟网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get primaryIp
     *
     * @return
     */
    public Ip getPrimaryIp() {
        return primaryIp;
    }

    /**
     * set primaryIp
     *
     * @param primaryIp
     */
    public void setPrimaryIp(Ip primaryIp) {
        this.primaryIp = primaryIp;
    }

    /**
     * get 网卡辅IP
     *
     * @return
     */
    public List<Ip> getSecondaryIps() {
        return secondaryIps;
    }

    /**
     * set 网卡辅IP
     *
     * @param secondaryIps
     */
    public void setSecondaryIps(List<Ip> secondaryIps) {
        this.secondaryIps = secondaryIps;
    }

    /**
     * get 所属安全组列表
     *
     * @return
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * set 所属安全组列表
     *
     * @param securityGroups
     */
    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }


    /**
     * set 以太网地址
     *
     * @param macAddress
     */
    public NetworkInterface macAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * set 弹性网卡ID
     *
     * @param networkInterfaceId
     */
    public NetworkInterface networkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * set 源和目标IP地址校验,取值为0或者1
     *
     * @param sanityCheck
     */
    public NetworkInterface sanityCheck(Integer sanityCheck) {
        this.sanityCheck = sanityCheck;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public NetworkInterface subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 虚拟网络ID
     *
     * @param vpcId
     */
    public NetworkInterface vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set primaryIp
     *
     * @param primaryIp
     */
    public NetworkInterface primaryIp(Ip primaryIp) {
        this.primaryIp = primaryIp;
        return this;
    }

    /**
     * set 网卡辅IP
     *
     * @param secondaryIps
     */
    public NetworkInterface secondaryIps(List<Ip> secondaryIps) {
        this.secondaryIps = secondaryIps;
        return this;
    }

    /**
     * set 所属安全组列表
     *
     * @param securityGroups
     */
    public NetworkInterface securityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }


    /**
     * add item to 网卡辅IP
     *
     * @param secondaryIp
     */
    public void addSecondaryIp(Ip secondaryIp) {
        if (this.secondaryIps == null) {
            this.secondaryIps = new ArrayList<>();
        }
        this.secondaryIps.add(secondaryIp);
    }

    /**
     * add item to 所属安全组列表
     *
     * @param securityGroup
     */
    public void addSecurityGroup(SecurityGroup securityGroup) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroup);
    }

}