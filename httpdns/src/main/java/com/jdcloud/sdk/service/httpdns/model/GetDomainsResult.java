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
 * 域名
 * httpdns OpenAPI域名接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.httpdns.model;

import com.jdcloud.sdk.service.httpdns.model.DomainData;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询使用httpdns服务的域名
 */
public class GetDomainsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分页查询返回的域名数据结构
     */
    private DomainData data;


    /**
     * get 分页查询返回的域名数据结构
     *
     * @return
     */
    public DomainData getData() {
        return data;
    }

    /**
     * set 分页查询返回的域名数据结构
     *
     * @param data
     */
    public void setData(DomainData data) {
        this.data = data;
    }


    /**
     * set 分页查询返回的域名数据结构
     *
     * @param data
     */
    public GetDomainsResult data(DomainData data) {
        this.data = data;
        return this;
    }


}