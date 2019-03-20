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
 * Rds-Account
 * 与RDS账号相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 给RDS账号分配数据库权限
 */
public class RevokeRdsAccountRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS实例ID
     * Required:true
     */
    @Required
    private String instId;

    /**
     * 账号名称
     * Required:true
     */
    @Required
    private String accountName;

    /**
     * 数据库名称
     * Required:true
     */
    @Required
    private String dbName;


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
     * get RDS实例ID
     *
     * @return
     */
    public String getInstId() {
        return instId;
    }

    /**
     * set RDS实例ID
     *
     * @param instId
     */
    public void setInstId(String instId) {
        this.instId = instId;
    }

    /**
     * get 账号名称
     *
     * @return
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * set 账号名称
     *
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * get 数据库名称
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public RevokeRdsAccountRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS实例ID
     *
     * @param instId
     */
    public RevokeRdsAccountRequest instId(String instId) {
        this.instId = instId;
        return this;
    }

    /**
     * set 账号名称
     *
     * @param accountName
     */
    public RevokeRdsAccountRequest accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public RevokeRdsAccountRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


}