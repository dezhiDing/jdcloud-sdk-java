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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加直播APP
 */
public class AddLiveAppRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 直播的推流域名(不支持泛域名)
     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;


    /**
     * get 直播的推流域名(不支持泛域名)
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 直播的推流域名(不支持泛域名)
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }


    /**
     * set 直播的推流域名(不支持泛域名)
     *
     * @param publishDomain
     */
    public AddLiveAppRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public AddLiveAppRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}