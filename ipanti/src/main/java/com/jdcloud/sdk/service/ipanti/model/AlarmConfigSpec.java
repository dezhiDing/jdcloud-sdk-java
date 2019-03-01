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

import java.util.List;
import java.util.ArrayList;

/**
 * alarmConfigSpec
 */
public class AlarmConfigSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 黑洞告警邮件开关 0 关闭 1 开启
     */
    private Integer blackHoleAlarmEmailStatus;

    /**
     * 黑洞告警短信开关 0 关闭 1 开启
     */
    private Integer blackHoleAlarmSmsStatus;

    /**
     * 黑洞告警总开关  0 关闭 1 开启
     */
    private Integer blackHoleAlarmStatus;

    /**
     * DDos 攻击告警邮件开关  0 关闭 1 开启
     */
    private Integer ddosAlarmEmailStatus;

    /**
     * DDos 攻击告警短信开关  0 关闭 1 开启
     */
    private Integer ddosAlarmSmsStatus;

    /**
     * DDos 告警总开关 0 关闭 1 开启
     */
    private Integer ddosAlarmStatus;

    /**
     * 错误码告警总开关
     */
    private Integer errorCodeAlarmStatus;

    /**
     * 错误码告警域名列表
     */
    private List<String> errorCodeDomain;


    /**
     * get 黑洞告警邮件开关 0 关闭 1 开启
     *
     * @return
     */
    public Integer getBlackHoleAlarmEmailStatus() {
        return blackHoleAlarmEmailStatus;
    }

    /**
     * set 黑洞告警邮件开关 0 关闭 1 开启
     *
     * @param blackHoleAlarmEmailStatus
     */
    public void setBlackHoleAlarmEmailStatus(Integer blackHoleAlarmEmailStatus) {
        this.blackHoleAlarmEmailStatus = blackHoleAlarmEmailStatus;
    }

    /**
     * get 黑洞告警短信开关 0 关闭 1 开启
     *
     * @return
     */
    public Integer getBlackHoleAlarmSmsStatus() {
        return blackHoleAlarmSmsStatus;
    }

    /**
     * set 黑洞告警短信开关 0 关闭 1 开启
     *
     * @param blackHoleAlarmSmsStatus
     */
    public void setBlackHoleAlarmSmsStatus(Integer blackHoleAlarmSmsStatus) {
        this.blackHoleAlarmSmsStatus = blackHoleAlarmSmsStatus;
    }

    /**
     * get 黑洞告警总开关  0 关闭 1 开启
     *
     * @return
     */
    public Integer getBlackHoleAlarmStatus() {
        return blackHoleAlarmStatus;
    }

    /**
     * set 黑洞告警总开关  0 关闭 1 开启
     *
     * @param blackHoleAlarmStatus
     */
    public void setBlackHoleAlarmStatus(Integer blackHoleAlarmStatus) {
        this.blackHoleAlarmStatus = blackHoleAlarmStatus;
    }

    /**
     * get DDos 攻击告警邮件开关  0 关闭 1 开启
     *
     * @return
     */
    public Integer getDdosAlarmEmailStatus() {
        return ddosAlarmEmailStatus;
    }

    /**
     * set DDos 攻击告警邮件开关  0 关闭 1 开启
     *
     * @param ddosAlarmEmailStatus
     */
    public void setDdosAlarmEmailStatus(Integer ddosAlarmEmailStatus) {
        this.ddosAlarmEmailStatus = ddosAlarmEmailStatus;
    }

    /**
     * get DDos 攻击告警短信开关  0 关闭 1 开启
     *
     * @return
     */
    public Integer getDdosAlarmSmsStatus() {
        return ddosAlarmSmsStatus;
    }

    /**
     * set DDos 攻击告警短信开关  0 关闭 1 开启
     *
     * @param ddosAlarmSmsStatus
     */
    public void setDdosAlarmSmsStatus(Integer ddosAlarmSmsStatus) {
        this.ddosAlarmSmsStatus = ddosAlarmSmsStatus;
    }

    /**
     * get DDos 告警总开关 0 关闭 1 开启
     *
     * @return
     */
    public Integer getDdosAlarmStatus() {
        return ddosAlarmStatus;
    }

    /**
     * set DDos 告警总开关 0 关闭 1 开启
     *
     * @param ddosAlarmStatus
     */
    public void setDdosAlarmStatus(Integer ddosAlarmStatus) {
        this.ddosAlarmStatus = ddosAlarmStatus;
    }

    /**
     * get 错误码告警总开关
     *
     * @return
     */
    public Integer getErrorCodeAlarmStatus() {
        return errorCodeAlarmStatus;
    }

    /**
     * set 错误码告警总开关
     *
     * @param errorCodeAlarmStatus
     */
    public void setErrorCodeAlarmStatus(Integer errorCodeAlarmStatus) {
        this.errorCodeAlarmStatus = errorCodeAlarmStatus;
    }

    /**
     * get 错误码告警域名列表
     *
     * @return
     */
    public List<String> getErrorCodeDomain() {
        return errorCodeDomain;
    }

    /**
     * set 错误码告警域名列表
     *
     * @param errorCodeDomain
     */
    public void setErrorCodeDomain(List<String> errorCodeDomain) {
        this.errorCodeDomain = errorCodeDomain;
    }


    /**
     * set 黑洞告警邮件开关 0 关闭 1 开启
     *
     * @param blackHoleAlarmEmailStatus
     */
    public AlarmConfigSpec blackHoleAlarmEmailStatus(Integer blackHoleAlarmEmailStatus) {
        this.blackHoleAlarmEmailStatus = blackHoleAlarmEmailStatus;
        return this;
    }

    /**
     * set 黑洞告警短信开关 0 关闭 1 开启
     *
     * @param blackHoleAlarmSmsStatus
     */
    public AlarmConfigSpec blackHoleAlarmSmsStatus(Integer blackHoleAlarmSmsStatus) {
        this.blackHoleAlarmSmsStatus = blackHoleAlarmSmsStatus;
        return this;
    }

    /**
     * set 黑洞告警总开关  0 关闭 1 开启
     *
     * @param blackHoleAlarmStatus
     */
    public AlarmConfigSpec blackHoleAlarmStatus(Integer blackHoleAlarmStatus) {
        this.blackHoleAlarmStatus = blackHoleAlarmStatus;
        return this;
    }

    /**
     * set DDos 攻击告警邮件开关  0 关闭 1 开启
     *
     * @param ddosAlarmEmailStatus
     */
    public AlarmConfigSpec ddosAlarmEmailStatus(Integer ddosAlarmEmailStatus) {
        this.ddosAlarmEmailStatus = ddosAlarmEmailStatus;
        return this;
    }

    /**
     * set DDos 攻击告警短信开关  0 关闭 1 开启
     *
     * @param ddosAlarmSmsStatus
     */
    public AlarmConfigSpec ddosAlarmSmsStatus(Integer ddosAlarmSmsStatus) {
        this.ddosAlarmSmsStatus = ddosAlarmSmsStatus;
        return this;
    }

    /**
     * set DDos 告警总开关 0 关闭 1 开启
     *
     * @param ddosAlarmStatus
     */
    public AlarmConfigSpec ddosAlarmStatus(Integer ddosAlarmStatus) {
        this.ddosAlarmStatus = ddosAlarmStatus;
        return this;
    }

    /**
     * set 错误码告警总开关
     *
     * @param errorCodeAlarmStatus
     */
    public AlarmConfigSpec errorCodeAlarmStatus(Integer errorCodeAlarmStatus) {
        this.errorCodeAlarmStatus = errorCodeAlarmStatus;
        return this;
    }

    /**
     * set 错误码告警域名列表
     *
     * @param errorCodeDomain
     */
    public AlarmConfigSpec errorCodeDomain(List<String> errorCodeDomain) {
        this.errorCodeDomain = errorCodeDomain;
        return this;
    }


    /**
     * add item to 错误码告警域名列表
     *
     * @param errorCodeDomain
     */
    public void addErrorCodeDomain(String errorCodeDomain) {
        if (this.errorCodeDomain == null) {
            this.errorCodeDomain = new ArrayList<>();
        }
        this.errorCodeDomain.add(errorCodeDomain);
    }

}