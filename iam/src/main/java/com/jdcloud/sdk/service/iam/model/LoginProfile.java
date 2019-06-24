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

package com.jdcloud.sdk.service.iam.model;


/**
 * loginProfile
 */
public class LoginProfile  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子用户名
     */
    private String name;

    /**
     * 要求下次登录时重设密码
     */
    private Boolean passwordResetRequired;

    /**
     * 要求必须绑定虚拟MFA设备
     */
    private Boolean mFABindRequired;


    /**
     * get 子用户名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 子用户名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 要求下次登录时重设密码
     *
     * @return
     */
    public Boolean getPasswordResetRequired() {
        return passwordResetRequired;
    }

    /**
     * set 要求下次登录时重设密码
     *
     * @param passwordResetRequired
     */
    public void setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
    }

    /**
     * get 要求必须绑定虚拟MFA设备
     *
     * @return
     */
    public Boolean getMFABindRequired() {
        return mFABindRequired;
    }

    /**
     * set 要求必须绑定虚拟MFA设备
     *
     * @param mFABindRequired
     */
    public void setMFABindRequired(Boolean mFABindRequired) {
        this.mFABindRequired = mFABindRequired;
    }


    /**
     * set 子用户名
     *
     * @param name
     */
    public LoginProfile name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 要求下次登录时重设密码
     *
     * @param passwordResetRequired
     */
    public LoginProfile passwordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }

    /**
     * set 要求必须绑定虚拟MFA设备
     *
     * @param mFABindRequired
     */
    public LoginProfile mFABindRequired(Boolean mFABindRequired) {
        this.mFABindRequired = mFABindRequired;
        return this;
    }


}