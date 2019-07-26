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
 * IP Sets
 * IP 黑白名单库, 预定义的 IP 黑白名单绑定到转发规则的黑名单或白名单后生效
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询实例的 IP 黑白名单用量信息
 */
public class DescribeIpSetUsageResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例已添加的 IP 黑白名单数量
     */
    private Integer allocatedNum;

    /**
     * 实例还可添加的 IP 黑白名单数量
     */
    private Integer surplusAllocateNum;

    /**
     * 实例最多可添加的 IP 黑白名单数量
     */
    private Integer maxAllocateNum;


    /**
     * get 实例已添加的 IP 黑白名单数量
     *
     * @return
     */
    public Integer getAllocatedNum() {
        return allocatedNum;
    }

    /**
     * set 实例已添加的 IP 黑白名单数量
     *
     * @param allocatedNum
     */
    public void setAllocatedNum(Integer allocatedNum) {
        this.allocatedNum = allocatedNum;
    }

    /**
     * get 实例还可添加的 IP 黑白名单数量
     *
     * @return
     */
    public Integer getSurplusAllocateNum() {
        return surplusAllocateNum;
    }

    /**
     * set 实例还可添加的 IP 黑白名单数量
     *
     * @param surplusAllocateNum
     */
    public void setSurplusAllocateNum(Integer surplusAllocateNum) {
        this.surplusAllocateNum = surplusAllocateNum;
    }

    /**
     * get 实例最多可添加的 IP 黑白名单数量
     *
     * @return
     */
    public Integer getMaxAllocateNum() {
        return maxAllocateNum;
    }

    /**
     * set 实例最多可添加的 IP 黑白名单数量
     *
     * @param maxAllocateNum
     */
    public void setMaxAllocateNum(Integer maxAllocateNum) {
        this.maxAllocateNum = maxAllocateNum;
    }


    /**
     * set 实例已添加的 IP 黑白名单数量
     *
     * @param allocatedNum
     */
    public DescribeIpSetUsageResult allocatedNum(Integer allocatedNum) {
        this.allocatedNum = allocatedNum;
        return this;
    }

    /**
     * set 实例还可添加的 IP 黑白名单数量
     *
     * @param surplusAllocateNum
     */
    public DescribeIpSetUsageResult surplusAllocateNum(Integer surplusAllocateNum) {
        this.surplusAllocateNum = surplusAllocateNum;
        return this;
    }

    /**
     * set 实例最多可添加的 IP 黑白名单数量
     *
     * @param maxAllocateNum
     */
    public DescribeIpSetUsageResult maxAllocateNum(Integer maxAllocateNum) {
        this.maxAllocateNum = maxAllocateNum;
        return this;
    }


}