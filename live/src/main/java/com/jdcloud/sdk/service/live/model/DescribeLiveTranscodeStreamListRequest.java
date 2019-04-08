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
 * 查询转码流信息
 */
public class DescribeLiveTranscodeStreamListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名

     * Required:true
     */
    @Required
    private String domainName;

    /**
     * 应用名称

     * Required:true
     */
    @Required
    private String appName;

    /**
     * 流名称

     * Required:true
     */
    @Required
    private String streamName;


    /**
     * get 推流域名

     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 推流域名

     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
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
     * get 流名称

     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名称

     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }


    /**
     * set 推流域名

     *
     * @param domainName
     */
    public DescribeLiveTranscodeStreamListRequest domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 应用名称

     *
     * @param appName
     */
    public DescribeLiveTranscodeStreamListRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 流名称

     *
     * @param streamName
     */
    public DescribeLiveTranscodeStreamListRequest streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }


}