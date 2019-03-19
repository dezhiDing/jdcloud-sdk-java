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

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.service.nc.model.DockerRegistryData;

/**
 * 机密数据
 */
public class Secret  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机密数据名称
     */
    private String name;

    /**
     * 私密数据的类型，目前仅支持如下类型：docker-registry：用来和docker registry认证的类型
     */
    private String type;

    /**
     * 创建时间
     */
    private String createdAt;

    /**
     * 机密的数据
     */
    private DockerRegistryData data;


    /**
     * get 机密数据名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 机密数据名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 私密数据的类型，目前仅支持如下类型：docker-registry：用来和docker registry认证的类型
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 私密数据的类型，目前仅支持如下类型：docker-registry：用来和docker registry认证的类型
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * set 创建时间
     *
     * @param createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * get 机密的数据
     *
     * @return
     */
    public DockerRegistryData getData() {
        return data;
    }

    /**
     * set 机密的数据
     *
     * @param data
     */
    public void setData(DockerRegistryData data) {
        this.data = data;
    }


    /**
     * set 机密数据名称
     *
     * @param name
     */
    public Secret name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 私密数据的类型，目前仅支持如下类型：docker-registry：用来和docker registry认证的类型
     *
     * @param type
     */
    public Secret type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createdAt
     */
    public Secret createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set 机密的数据
     *
     * @param data
     */
    public Secret data(DockerRegistryData data) {
        this.data = data;
        return this;
    }


}