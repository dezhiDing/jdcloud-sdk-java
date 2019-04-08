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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.live.model.RecordTime;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加打点录制任务
- 您可以调用此接口精确提取已录制的文件中所需要的部分

 */
public class AddLiveRecordTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 录制时间集合
- 最大支持10段,多段合并成一个文件
- 多段时间跨度最小不能小于10s
- 多段时间跨度最大不能超过8小时

     * Required:true
     */
    @Required
    private List<RecordTime> recordTimes;

    /**
     * 存储桶
     * Required:true
     */
    @Required
    private String saveBucket;

    /**
     * 存储地址
     * Required:true
     */
    @Required
    private String saveEndpoint;

    /**
     * 录制文件类型:
- 取值: ts,flv,mp4 (多种类型之前用;隔开)
- 不区分大小写

     * Required:true
     */
    @Required
    private String recordFileType;

    /**
     * 录制文件存储路径:
- 默认地址: record/{Date}/{ServerId}/{AppName}/{StreamName}/{StartTime}_{EndTime}

     */
    private String saveObject;

    /**
     * 打点录制任务外键

     */
    private String taskExternalId;

    /**
     * 推流域名
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
     * 流名称
     * Required:true
     */
    @Required
    private String streamName;


    /**
     * get 录制时间集合
- 最大支持10段,多段合并成一个文件
- 多段时间跨度最小不能小于10s
- 多段时间跨度最大不能超过8小时

     *
     * @return
     */
    public List<RecordTime> getRecordTimes() {
        return recordTimes;
    }

    /**
     * set 录制时间集合
- 最大支持10段,多段合并成一个文件
- 多段时间跨度最小不能小于10s
- 多段时间跨度最大不能超过8小时

     *
     * @param recordTimes
     */
    public void setRecordTimes(List<RecordTime> recordTimes) {
        this.recordTimes = recordTimes;
    }

    /**
     * get 存储桶
     *
     * @return
     */
    public String getSaveBucket() {
        return saveBucket;
    }

    /**
     * set 存储桶
     *
     * @param saveBucket
     */
    public void setSaveBucket(String saveBucket) {
        this.saveBucket = saveBucket;
    }

    /**
     * get 存储地址
     *
     * @return
     */
    public String getSaveEndpoint() {
        return saveEndpoint;
    }

    /**
     * set 存储地址
     *
     * @param saveEndpoint
     */
    public void setSaveEndpoint(String saveEndpoint) {
        this.saveEndpoint = saveEndpoint;
    }

    /**
     * get 录制文件类型:
- 取值: ts,flv,mp4 (多种类型之前用;隔开)
- 不区分大小写

     *
     * @return
     */
    public String getRecordFileType() {
        return recordFileType;
    }

    /**
     * set 录制文件类型:
- 取值: ts,flv,mp4 (多种类型之前用;隔开)
- 不区分大小写

     *
     * @param recordFileType
     */
    public void setRecordFileType(String recordFileType) {
        this.recordFileType = recordFileType;
    }

    /**
     * get 录制文件存储路径:
- 默认地址: record/{Date}/{ServerId}/{AppName}/{StreamName}/{StartTime}_{EndTime}

     *
     * @return
     */
    public String getSaveObject() {
        return saveObject;
    }

    /**
     * set 录制文件存储路径:
- 默认地址: record/{Date}/{ServerId}/{AppName}/{StreamName}/{StartTime}_{EndTime}

     *
     * @param saveObject
     */
    public void setSaveObject(String saveObject) {
        this.saveObject = saveObject;
    }

    /**
     * get 打点录制任务外键

     *
     * @return
     */
    public String getTaskExternalId() {
        return taskExternalId;
    }

    /**
     * set 打点录制任务外键

     *
     * @param taskExternalId
     */
    public void setTaskExternalId(String taskExternalId) {
        this.taskExternalId = taskExternalId;
    }

    /**
     * get 推流域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流域名
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
     * set 录制时间集合
- 最大支持10段,多段合并成一个文件
- 多段时间跨度最小不能小于10s
- 多段时间跨度最大不能超过8小时

     *
     * @param recordTimes
     */
    public AddLiveRecordTaskRequest recordTimes(List<RecordTime> recordTimes) {
        this.recordTimes = recordTimes;
        return this;
    }

    /**
     * set 存储桶
     *
     * @param saveBucket
     */
    public AddLiveRecordTaskRequest saveBucket(String saveBucket) {
        this.saveBucket = saveBucket;
        return this;
    }

    /**
     * set 存储地址
     *
     * @param saveEndpoint
     */
    public AddLiveRecordTaskRequest saveEndpoint(String saveEndpoint) {
        this.saveEndpoint = saveEndpoint;
        return this;
    }

    /**
     * set 录制文件类型:
- 取值: ts,flv,mp4 (多种类型之前用;隔开)
- 不区分大小写

     *
     * @param recordFileType
     */
    public AddLiveRecordTaskRequest recordFileType(String recordFileType) {
        this.recordFileType = recordFileType;
        return this;
    }

    /**
     * set 录制文件存储路径:
- 默认地址: record/{Date}/{ServerId}/{AppName}/{StreamName}/{StartTime}_{EndTime}

     *
     * @param saveObject
     */
    public AddLiveRecordTaskRequest saveObject(String saveObject) {
        this.saveObject = saveObject;
        return this;
    }

    /**
     * set 打点录制任务外键

     *
     * @param taskExternalId
     */
    public AddLiveRecordTaskRequest taskExternalId(String taskExternalId) {
        this.taskExternalId = taskExternalId;
        return this;
    }

    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public AddLiveRecordTaskRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public AddLiveRecordTaskRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public AddLiveRecordTaskRequest streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }


    /**
     * add item to 录制时间集合
- 最大支持10段,多段合并成一个文件
- 多段时间跨度最小不能小于10s
- 多段时间跨度最大不能超过8小时

     *
     * @param recordTime
     */
    public void addRecordTime(RecordTime recordTime) {
        if (this.recordTimes == null) {
            this.recordTimes = new ArrayList<>();
        }
        this.recordTimes.add(recordTime);
    }

}