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

package com.jdcloud.sdk.service.monitor.model;


/**
 * nsInfo
 */
public class NsInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * metric个数
     */
    private Long metricCount;

    /**
     * 命名空间名称
     */
    private String nsName;

    /**
     * 命名空间uid
     */
    private String nsUid;

    /**
     * obj个数
     */
    private Long objCount;


    /**
     * get metric个数
     *
     * @return
     */
    public Long getMetricCount() {
        return metricCount;
    }

    /**
     * set metric个数
     *
     * @param metricCount
     */
    public void setMetricCount(Long metricCount) {
        this.metricCount = metricCount;
    }

    /**
     * get 命名空间名称
     *
     * @return
     */
    public String getNsName() {
        return nsName;
    }

    /**
     * set 命名空间名称
     *
     * @param nsName
     */
    public void setNsName(String nsName) {
        this.nsName = nsName;
    }

    /**
     * get 命名空间uid
     *
     * @return
     */
    public String getNsUid() {
        return nsUid;
    }

    /**
     * set 命名空间uid
     *
     * @param nsUid
     */
    public void setNsUid(String nsUid) {
        this.nsUid = nsUid;
    }

    /**
     * get obj个数
     *
     * @return
     */
    public Long getObjCount() {
        return objCount;
    }

    /**
     * set obj个数
     *
     * @param objCount
     */
    public void setObjCount(Long objCount) {
        this.objCount = objCount;
    }


    /**
     * set metric个数
     *
     * @param metricCount
     */
    public NsInfo metricCount(Long metricCount) {
        this.metricCount = metricCount;
        return this;
    }

    /**
     * set 命名空间名称
     *
     * @param nsName
     */
    public NsInfo nsName(String nsName) {
        this.nsName = nsName;
        return this;
    }

    /**
     * set 命名空间uid
     *
     * @param nsUid
     */
    public NsInfo nsUid(String nsUid) {
        this.nsUid = nsUid;
        return this;
    }

    /**
     * set obj个数
     *
     * @param objCount
     */
    public NsInfo objCount(Long objCount) {
        this.objCount = objCount;
        return this;
    }


}