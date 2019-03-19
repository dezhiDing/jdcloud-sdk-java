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
 * Stack
 * Interface of Stack
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdro.model;

import com.jdcloud.sdk.service.jdro.model.StackOut;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询资源栈详情
 */
public class DescribeStackResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * stack
     */
    private StackOut stack;


    /**
     * get stack
     *
     * @return
     */
    public StackOut getStack() {
        return stack;
    }

    /**
     * set stack
     *
     * @param stack
     */
    public void setStack(StackOut stack) {
        this.stack = stack;
    }


    /**
     * set stack
     *
     * @param stack
     */
    public DescribeStackResult stack(StackOut stack) {
        this.stack = stack;
        return this;
    }


}