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

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * forwardRuleSpec
 */
public class ForwardRuleSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 协议: TCP或者UDP
     * Required:true
     */
    @Required
    private String protocol;

    /**
     * 端口号, 取值范围[1, 65535]
     * Required:true
     */
    @Required
    private Integer port;

    /**
     * 转发规则
- wrr 带权重的轮询
- wlc 加权最小连接
- rr  不带权重的轮询
- sh  源地址hash

     * Required:true
     */
    @Required
    private String algorithm;

    /**
     * 回源类型: A 或者 CNAME
     * Required:true
     */
    @Required
    private String originType;

    /**
     * originAddr
     */
    private List<OriginAddrItem> originAddr;

    /**
     * 备用的回源地址列表, 可以配置为一个域名或者多个 ip 地址
     */
    private List<String> onlineAddr;

    /**
     * 回源域名
     */
    private String originDomain;

    /**
     * 回源端口号, 取值范围[1, 65535]
     * Required:true
     */
    @Required
    private Integer originPort;


    /**
     * get 协议: TCP或者UDP
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set 协议: TCP或者UDP
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * get 端口号, 取值范围[1, 65535]
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 端口号, 取值范围[1, 65535]
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * get 转发规则
- wrr 带权重的轮询
- wlc 加权最小连接
- rr  不带权重的轮询
- sh  源地址hash

     *
     * @return
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * set 转发规则
- wrr 带权重的轮询
- wlc 加权最小连接
- rr  不带权重的轮询
- sh  源地址hash

     *
     * @param algorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * get 回源类型: A 或者 CNAME
     *
     * @return
     */
    public String getOriginType() {
        return originType;
    }

    /**
     * set 回源类型: A 或者 CNAME
     *
     * @param originType
     */
    public void setOriginType(String originType) {
        this.originType = originType;
    }

    /**
     * get originAddr
     *
     * @return
     */
    public List<OriginAddrItem> getOriginAddr() {
        return originAddr;
    }

    /**
     * set originAddr
     *
     * @param originAddr
     */
    public void setOriginAddr(List<OriginAddrItem> originAddr) {
        this.originAddr = originAddr;
    }

    /**
     * get 备用的回源地址列表, 可以配置为一个域名或者多个 ip 地址
     *
     * @return
     */
    public List<String> getOnlineAddr() {
        return onlineAddr;
    }

    /**
     * set 备用的回源地址列表, 可以配置为一个域名或者多个 ip 地址
     *
     * @param onlineAddr
     */
    public void setOnlineAddr(List<String> onlineAddr) {
        this.onlineAddr = onlineAddr;
    }

    /**
     * get 回源域名
     *
     * @return
     */
    public String getOriginDomain() {
        return originDomain;
    }

    /**
     * set 回源域名
     *
     * @param originDomain
     */
    public void setOriginDomain(String originDomain) {
        this.originDomain = originDomain;
    }

    /**
     * get 回源端口号, 取值范围[1, 65535]
     *
     * @return
     */
    public Integer getOriginPort() {
        return originPort;
    }

    /**
     * set 回源端口号, 取值范围[1, 65535]
     *
     * @param originPort
     */
    public void setOriginPort(Integer originPort) {
        this.originPort = originPort;
    }


    /**
     * set 协议: TCP或者UDP
     *
     * @param protocol
     */
    public ForwardRuleSpec protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set 端口号, 取值范围[1, 65535]
     *
     * @param port
     */
    public ForwardRuleSpec port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * set 转发规则
- wrr 带权重的轮询
- wlc 加权最小连接
- rr  不带权重的轮询
- sh  源地址hash

     *
     * @param algorithm
     */
    public ForwardRuleSpec algorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * set 回源类型: A 或者 CNAME
     *
     * @param originType
     */
    public ForwardRuleSpec originType(String originType) {
        this.originType = originType;
        return this;
    }

    /**
     * set originAddr
     *
     * @param originAddr
     */
    public ForwardRuleSpec originAddr(List<OriginAddrItem> originAddr) {
        this.originAddr = originAddr;
        return this;
    }

    /**
     * set 备用的回源地址列表, 可以配置为一个域名或者多个 ip 地址
     *
     * @param onlineAddr
     */
    public ForwardRuleSpec onlineAddr(List<String> onlineAddr) {
        this.onlineAddr = onlineAddr;
        return this;
    }

    /**
     * set 回源域名
     *
     * @param originDomain
     */
    public ForwardRuleSpec originDomain(String originDomain) {
        this.originDomain = originDomain;
        return this;
    }

    /**
     * set 回源端口号, 取值范围[1, 65535]
     *
     * @param originPort
     */
    public ForwardRuleSpec originPort(Integer originPort) {
        this.originPort = originPort;
        return this;
    }


    /**
     * add item to originAddr
     *
     * @param originAddr
     */
    public void addOriginAddr(OriginAddrItem originAddr) {
        if (this.originAddr == null) {
            this.originAddr = new ArrayList<>();
        }
        this.originAddr.add(originAddr);
    }

    /**
     * add item to 备用的回源地址列表, 可以配置为一个域名或者多个 ip 地址
     *
     * @param onlineAddr
     */
    public void addOnlineAddr(String onlineAddr) {
        if (this.onlineAddr == null) {
            this.onlineAddr = new ArrayList<>();
        }
        this.onlineAddr.add(onlineAddr);
    }

}