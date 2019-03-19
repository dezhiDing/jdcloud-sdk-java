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
 * 短信签名接口
 * API related to addSdkSmsSign
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 新增短信签名接口
 */
public class AddSdkSmsSignRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appId参数
     */
    private String appId;

    /**
     * name参数
     */
    private String name;

    /**
     * type参数
     */
    private String type;

    /**
     * purpose参数
     */
    private String purpose;

    /**
     * signCardType参数
     */
    private String signCardType;

    /**
     * signPic参数
     */
    private String signPic;

    /**
     * thirdPartyPic参数
     */
    private String thirdPartyPic;

    /**
     * description参数
     */
    private String description;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get appId参数
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set appId参数
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get name参数
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set name参数
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get type参数
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set type参数
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get purpose参数
     *
     * @return
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * set purpose参数
     *
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * get signCardType参数
     *
     * @return
     */
    public String getSignCardType() {
        return signCardType;
    }

    /**
     * set signCardType参数
     *
     * @param signCardType
     */
    public void setSignCardType(String signCardType) {
        this.signCardType = signCardType;
    }

    /**
     * get signPic参数
     *
     * @return
     */
    public String getSignPic() {
        return signPic;
    }

    /**
     * set signPic参数
     *
     * @param signPic
     */
    public void setSignPic(String signPic) {
        this.signPic = signPic;
    }

    /**
     * get thirdPartyPic参数
     *
     * @return
     */
    public String getThirdPartyPic() {
        return thirdPartyPic;
    }

    /**
     * set thirdPartyPic参数
     *
     * @param thirdPartyPic
     */
    public void setThirdPartyPic(String thirdPartyPic) {
        this.thirdPartyPic = thirdPartyPic;
    }

    /**
     * get description参数
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set description参数
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set appId参数
     *
     * @param appId
     */
    public AddSdkSmsSignRequest appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set name参数
     *
     * @param name
     */
    public AddSdkSmsSignRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set type参数
     *
     * @param type
     */
    public AddSdkSmsSignRequest type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set purpose参数
     *
     * @param purpose
     */
    public AddSdkSmsSignRequest purpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * set signCardType参数
     *
     * @param signCardType
     */
    public AddSdkSmsSignRequest signCardType(String signCardType) {
        this.signCardType = signCardType;
        return this;
    }

    /**
     * set signPic参数
     *
     * @param signPic
     */
    public AddSdkSmsSignRequest signPic(String signPic) {
        this.signPic = signPic;
        return this;
    }

    /**
     * set thirdPartyPic参数
     *
     * @param thirdPartyPic
     */
    public AddSdkSmsSignRequest thirdPartyPic(String thirdPartyPic) {
        this.thirdPartyPic = thirdPartyPic;
        return this;
    }

    /**
     * set description参数
     *
     * @param description
     */
    public AddSdkSmsSignRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public AddSdkSmsSignRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}