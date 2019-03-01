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

package com.jdcloud.sdk.service.ipanti.model;


/**
 * ePBSpec
 */
public class EPBSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性防护带宽
     */
    private Integer ePB;


    /**
     * get 弹性防护带宽
     *
     * @return
     */
    public Integer getEPB() {
        return ePB;
    }

    /**
     * set 弹性防护带宽
     *
     * @param ePB
     */
    public void setEPB(Integer ePB) {
        this.ePB = ePB;
    }


    /**
     * set 弹性防护带宽
     *
     * @param ePB
     */
    public EPBSpec ePB(Integer ePB) {
        this.ePB = ePB;
        return this;
    }


}