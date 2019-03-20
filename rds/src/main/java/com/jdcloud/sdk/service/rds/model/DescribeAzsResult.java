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
 * 可用区管理
 * 可用区管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看指定地域下各种RDS数据库支持的可用区，不同类型的RDS支持的可用区不一样
 */
public class DescribeAzsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * azs
     */
    private List<String> azs;


    /**
     * get azs
     *
     * @return
     */
    public List<String> getAzs() {
        return azs;
    }

    /**
     * set azs
     *
     * @param azs
     */
    public void setAzs(List<String> azs) {
        this.azs = azs;
    }


    /**
     * set azs
     *
     * @param azs
     */
    public DescribeAzsResult azs(List<String> azs) {
        this.azs = azs;
        return this;
    }


    /**
     * add item to azs
     *
     * @param az
     */
    public void addAz(String az) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(az);
    }

}