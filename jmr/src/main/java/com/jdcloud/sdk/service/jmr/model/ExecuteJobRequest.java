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
 * 作业管理
 * JMR作业管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.service.jmr.model.JmrTaskViewModel;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 执行task
 */
public class ExecuteJobRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * jmrTaskViewModel
     */
    private JmrTaskViewModel jmrTaskViewModel;

    /**
     * clusterId
     */
    private String clusterId;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get jmrTaskViewModel
     *
     * @return
     */
    public JmrTaskViewModel getJmrTaskViewModel() {
        return jmrTaskViewModel;
    }

    /**
     * set jmrTaskViewModel
     *
     * @param jmrTaskViewModel
     */
    public void setJmrTaskViewModel(JmrTaskViewModel jmrTaskViewModel) {
        this.jmrTaskViewModel = jmrTaskViewModel;
    }

    /**
     * get clusterId
     *
     * @return
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * set clusterId
     *
     * @param clusterId
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set jmrTaskViewModel
     *
     * @param jmrTaskViewModel
     */
    public ExecuteJobRequest jmrTaskViewModel(JmrTaskViewModel jmrTaskViewModel) {
        this.jmrTaskViewModel = jmrTaskViewModel;
        return this;
    }

    /**
     * set clusterId
     *
     * @param clusterId
     */
    public ExecuteJobRequest clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ExecuteJobRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}