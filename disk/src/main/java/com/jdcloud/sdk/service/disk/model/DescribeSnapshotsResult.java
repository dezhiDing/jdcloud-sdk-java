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
 * 快照相关接口
 * 快照相关接口，提供创建快照，查询快照信息，删除快照，修改快照信息等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.disk.model.Snapshot;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询云硬盘快照列表
 */
public class DescribeSnapshotsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * snapshots
     */
    private List<Snapshot> snapshots;

    /**
     * 查询的快照数目
     */
    private Integer totalCount;


    /**
     * get snapshots
     *
     * @return
     */
    public List<Snapshot> getSnapshots() {
        return snapshots;
    }

    /**
     * set snapshots
     *
     * @param snapshots
     */
    public void setSnapshots(List<Snapshot> snapshots) {
        this.snapshots = snapshots;
    }

    /**
     * get 查询的快照数目
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询的快照数目
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set snapshots
     *
     * @param snapshots
     */
    public DescribeSnapshotsResult snapshots(List<Snapshot> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    /**
     * set 查询的快照数目
     *
     * @param totalCount
     */
    public DescribeSnapshotsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to snapshots
     *
     * @param snapshot
     */
    public void addSnapshot(Snapshot snapshot) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        this.snapshots.add(snapshot);
    }

}