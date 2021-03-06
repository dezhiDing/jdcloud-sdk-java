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
 * 直播域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置转推鉴权信息
 */
public class SetForwardAuthenticationRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 鉴权类型，0表示无鉴权，1表示参数鉴权，2表示路径鉴权
     */
    private Integer accesskeyType;

    /**
     * 密码，长度为8到32
     */
    private String accesskeyKey;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get 鉴权类型，0表示无鉴权，1表示参数鉴权，2表示路径鉴权
     *
     * @return
     */
    public Integer getAccesskeyType() {
        return accesskeyType;
    }

    /**
     * set 鉴权类型，0表示无鉴权，1表示参数鉴权，2表示路径鉴权
     *
     * @param accesskeyType
     */
    public void setAccesskeyType(Integer accesskeyType) {
        this.accesskeyType = accesskeyType;
    }

    /**
     * get 密码，长度为8到32
     *
     * @return
     */
    public String getAccesskeyKey() {
        return accesskeyKey;
    }

    /**
     * set 密码，长度为8到32
     *
     * @param accesskeyKey
     */
    public void setAccesskeyKey(String accesskeyKey) {
        this.accesskeyKey = accesskeyKey;
    }

    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * set 鉴权类型，0表示无鉴权，1表示参数鉴权，2表示路径鉴权
     *
     * @param accesskeyType
     */
    public SetForwardAuthenticationRequest accesskeyType(Integer accesskeyType) {
        this.accesskeyType = accesskeyType;
        return this;
    }

    /**
     * set 密码，长度为8到32
     *
     * @param accesskeyKey
     */
    public SetForwardAuthenticationRequest accesskeyKey(String accesskeyKey) {
        this.accesskeyKey = accesskeyKey;
        return this;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public SetForwardAuthenticationRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}