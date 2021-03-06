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

package com.jdcloud.sdk.service.jmr.model;


/**
 * clusterExpansion
 */
public class ClusterExpansion  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 集群Id
     */
    private String clusterId;

    /**
     * 扩容数量
     */
    private Integer expansionNum;


    /**
     * get 集群Id
     *
     * @return
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * set 集群Id
     *
     * @param clusterId
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * get 扩容数量
     *
     * @return
     */
    public Integer getExpansionNum() {
        return expansionNum;
    }

    /**
     * set 扩容数量
     *
     * @param expansionNum
     */
    public void setExpansionNum(Integer expansionNum) {
        this.expansionNum = expansionNum;
    }


    /**
     * set 集群Id
     *
     * @param clusterId
     */
    public ClusterExpansion clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * set 扩容数量
     *
     * @param expansionNum
     */
    public ClusterExpansion expansionNum(Integer expansionNum) {
        this.expansionNum = expansionNum;
        return this;
    }


}