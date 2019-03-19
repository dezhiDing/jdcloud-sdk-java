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
 * 查询直播截图张数数据
 */
public class DescribeLiveSnapshotDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 您的推流加速域名
     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 直播流所属应用名称
     */
    private String appName;

    /**
     * 直播流名称
     */
    private String streamName;

    /**
     * 起始时间:
  - UTC 时间格式 e.g: 2019-03-12T00:00:00Z

     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 结束时间:
  - UTC 时间格式 e.g: 2019-03-12T00:00:00Z

     */
    private String endTime;


    /**
     * get 您的推流加速域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 您的推流加速域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 直播流所属应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 直播流所属应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 直播流名称
     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 直播流名称
     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * get 起始时间:
  - UTC 时间格式 e.g: 2019-03-12T00:00:00Z

     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 起始时间:
  - UTC 时间格式 e.g: 2019-03-12T00:00:00Z

     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间:
  - UTC 时间格式 e.g: 2019-03-12T00:00:00Z

     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间:
  - UTC 时间格式 e.g: 2019-03-12T00:00:00Z

     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * set 您的推流加速域名
     *
     * @param publishDomain
     */
    public DescribeLiveSnapshotDataRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 直播流所属应用名称
     *
     * @param appName
     */
    public DescribeLiveSnapshotDataRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 直播流名称
     *
     * @param streamName
     */
    public DescribeLiveSnapshotDataRequest streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set 起始时间:
  - UTC 时间格式 e.g: 2019-03-12T00:00:00Z

     *
     * @param startTime
     */
    public DescribeLiveSnapshotDataRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间:
  - UTC 时间格式 e.g: 2019-03-12T00:00:00Z

     *
     * @param endTime
     */
    public DescribeLiveSnapshotDataRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


}