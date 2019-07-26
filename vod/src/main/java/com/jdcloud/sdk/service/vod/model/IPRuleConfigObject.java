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
 * Domain Management
 * 域名管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * IP黑名单规则配置对象
 */
public class IPRuleConfigObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * IP黑名单列表
     * Required:true
     */
    @Required
    private List<String> ips;


    /**
     * get IP黑名单列表
     *
     * @return
     */
    public List<String> getIps() {
        return ips;
    }

    /**
     * set IP黑名单列表
     *
     * @param ips
     */
    public void setIps(List<String> ips) {
        this.ips = ips;
    }


    /**
     * set IP黑名单列表
     *
     * @param ips
     */
    public IPRuleConfigObject ips(List<String> ips) {
        this.ips = ips;
        return this;
    }


    /**
     * add item to IP黑名单列表
     *
     * @param ip
     */
    public void addIp(String ip) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ip);
    }

}