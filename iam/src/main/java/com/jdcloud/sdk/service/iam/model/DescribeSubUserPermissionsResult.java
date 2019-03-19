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
 * 策略管理
 * 策略管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iam.model.Permission;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询子用户策略列表
 */
public class DescribeSubUserPermissionsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总数
     */
    private Integer total;

    /**
     * permissions
     */
    private List<Permission> permissions;


    /**
     * get 总数
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set 总数
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * get permissions
     *
     * @return
     */
    public List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * set permissions
     *
     * @param permissions
     */
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }


    /**
     * set 总数
     *
     * @param total
     */
    public DescribeSubUserPermissionsResult total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * set permissions
     *
     * @param permissions
     */
    public DescribeSubUserPermissionsResult permissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }


    /**
     * add item to permissions
     *
     * @param permission
     */
    public void addPermission(Permission permission) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permission);
    }

}