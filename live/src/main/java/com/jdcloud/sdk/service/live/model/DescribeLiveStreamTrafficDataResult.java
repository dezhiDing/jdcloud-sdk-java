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
import com.jdcloud.sdk.service.live.model.TrafficStatisticResult;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询流量数据
- 查询某个时间段内的流量数据。
- 查询1分钟粒度的数据时，时间跨度不超过7天，其他粒度时时间跨度不超过30天

 */
public class DescribeLiveStreamTrafficDataResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dataList
     */
    private List<TrafficStatisticResult> dataList;


    /**
     * get dataList
     *
     * @return
     */
    public List<TrafficStatisticResult> getDataList() {
        return dataList;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public void setDataList(List<TrafficStatisticResult> dataList) {
        this.dataList = dataList;
    }


    /**
     * set dataList
     *
     * @param dataList
     */
    public DescribeLiveStreamTrafficDataResult dataList(List<TrafficStatisticResult> dataList) {
        this.dataList = dataList;
        return this;
    }


    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(TrafficStatisticResult dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}