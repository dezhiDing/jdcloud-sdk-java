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
 * 设备管理
 * device管理模块
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iothub.model.OnlineInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询设备在线信息
 */
public class QueryDeviceOnlineInfosResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * onlineInfos
     */
    private List<OnlineInfo> onlineInfos;


    /**
     * get onlineInfos
     *
     * @return
     */
    public List<OnlineInfo> getOnlineInfos() {
        return onlineInfos;
    }

    /**
     * set onlineInfos
     *
     * @param onlineInfos
     */
    public void setOnlineInfos(List<OnlineInfo> onlineInfos) {
        this.onlineInfos = onlineInfos;
    }


    /**
     * set onlineInfos
     *
     * @param onlineInfos
     */
    public QueryDeviceOnlineInfosResult onlineInfos(List<OnlineInfo> onlineInfos) {
        this.onlineInfos = onlineInfos;
        return this;
    }


    /**
     * add item to onlineInfos
     *
     * @param onlineInfo
     */
    public void addOnlineInfo(OnlineInfo onlineInfo) {
        if (this.onlineInfos == null) {
            this.onlineInfos = new ArrayList<>();
        }
        this.onlineInfos.add(onlineInfo);
    }

}