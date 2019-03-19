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
 * Cluster
 * 集群相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * - 创建集群
- 证书
  - 关于kubernetes的证书，默认生成，不需要用户传入。
- nodegroup
  - cluster必须与nodeGroup进行绑定
  - cluster支持多nodegroup
  - 状态
    - pending,reconciling,deleting状态不可以操作更新接口
    - running，running_with_error状态可以操作nodegroup所有接口
    - error状态只可以查询，删除
    - delete状态的cluster在十五分钟内可以查询，十五分钟后无法查询到
- 状态限制
  - pending,reconciling,deleting状态不可以操作更新接口
  - running状态可以操作cluster所有接口
  - error状态只可以查询，删除
  - delete状态的cluster在十五分钟内可以查询，十五分钟后无法查询到

 */
public class CreateClusterResponse extends JdcloudResponse<CreateClusterResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}