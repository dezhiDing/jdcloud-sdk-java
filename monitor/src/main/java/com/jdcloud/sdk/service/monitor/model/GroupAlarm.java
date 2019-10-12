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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * groupAlarm
 */
public class GroupAlarm  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报警规则ID
     */
    private String alarmId;

    /**
     * 告警通知联系人
     */
    private List<BaseContact> baseContact;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     */
    private Long enabled;

    /**
     * 通知策略
     */
    private List<NoticeOption> noticeOption;

    /**
     * resourceOption
     * Required:true
     */
    @Required
    private ResourceOption resourceOption;

    /**
     * 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     * Required:true
     */
    @Required
    private String ruleName;

    /**
     * ruleOption
     * Required:true
     */
    @Required
    private RuleOption ruleOption;

    /**
     * 规则类型, 默认为resourceMonitor
     */
    private String ruleType;

    /**
     * 规则版本  v1  v2
     */
    private String ruleVersion;

    /**
     * 产品线标识，规则对应的serviceCode
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 监控项状态：-1 未启用 1正常，2告警，4数据不足
     */
    private Long status;

    /**
     * webHookOption
     */
    private WebHookOption webHookOption;


    /**
     * get 报警规则ID
     *
     * @return
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * set 报警规则ID
     *
     * @param alarmId
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * get 告警通知联系人
     *
     * @return
     */
    public List<BaseContact> getBaseContact() {
        return baseContact;
    }

    /**
     * set 告警通知联系人
     *
     * @param baseContact
     */
    public void setBaseContact(List<BaseContact> baseContact) {
        this.baseContact = baseContact;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @return
     */
    public Long getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @param enabled
     */
    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    /**
     * get 通知策略
     *
     * @return
     */
    public List<NoticeOption> getNoticeOption() {
        return noticeOption;
    }

    /**
     * set 通知策略
     *
     * @param noticeOption
     */
    public void setNoticeOption(List<NoticeOption> noticeOption) {
        this.noticeOption = noticeOption;
    }

    /**
     * get resourceOption
     *
     * @return
     */
    public ResourceOption getResourceOption() {
        return resourceOption;
    }

    /**
     * set resourceOption
     *
     * @param resourceOption
     */
    public void setResourceOption(ResourceOption resourceOption) {
        this.resourceOption = resourceOption;
    }

    /**
     * get 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @return
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * set 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @param ruleName
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * get ruleOption
     *
     * @return
     */
    public RuleOption getRuleOption() {
        return ruleOption;
    }

    /**
     * set ruleOption
     *
     * @param ruleOption
     */
    public void setRuleOption(RuleOption ruleOption) {
        this.ruleOption = ruleOption;
    }

    /**
     * get 规则类型, 默认为resourceMonitor
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型, 默认为resourceMonitor
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * get 规则版本  v1  v2
     *
     * @return
     */
    public String getRuleVersion() {
        return ruleVersion;
    }

    /**
     * set 规则版本  v1  v2
     *
     * @param ruleVersion
     */
    public void setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
    }

    /**
     * get 产品线标识，规则对应的serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线标识，规则对应的serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 监控项状态：-1 未启用 1正常，2告警，4数据不足
     *
     * @return
     */
    public Long getStatus() {
        return status;
    }

    /**
     * set 监控项状态：-1 未启用 1正常，2告警，4数据不足
     *
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * get webHookOption
     *
     * @return
     */
    public WebHookOption getWebHookOption() {
        return webHookOption;
    }

    /**
     * set webHookOption
     *
     * @param webHookOption
     */
    public void setWebHookOption(WebHookOption webHookOption) {
        this.webHookOption = webHookOption;
    }


    /**
     * set 报警规则ID
     *
     * @param alarmId
     */
    public GroupAlarm alarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * set 告警通知联系人
     *
     * @param baseContact
     */
    public GroupAlarm baseContact(List<BaseContact> baseContact) {
        this.baseContact = baseContact;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public GroupAlarm createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @param enabled
     */
    public GroupAlarm enabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 通知策略
     *
     * @param noticeOption
     */
    public GroupAlarm noticeOption(List<NoticeOption> noticeOption) {
        this.noticeOption = noticeOption;
        return this;
    }

    /**
     * set resourceOption
     *
     * @param resourceOption
     */
    public GroupAlarm resourceOption(ResourceOption resourceOption) {
        this.resourceOption = resourceOption;
        return this;
    }

    /**
     * set 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @param ruleName
     */
    public GroupAlarm ruleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * set ruleOption
     *
     * @param ruleOption
     */
    public GroupAlarm ruleOption(RuleOption ruleOption) {
        this.ruleOption = ruleOption;
        return this;
    }

    /**
     * set 规则类型, 默认为resourceMonitor
     *
     * @param ruleType
     */
    public GroupAlarm ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * set 规则版本  v1  v2
     *
     * @param ruleVersion
     */
    public GroupAlarm ruleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
        return this;
    }

    /**
     * set 产品线标识，规则对应的serviceCode
     *
     * @param serviceCode
     */
    public GroupAlarm serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 监控项状态：-1 未启用 1正常，2告警，4数据不足
     *
     * @param status
     */
    public GroupAlarm status(Long status) {
        this.status = status;
        return this;
    }

    /**
     * set webHookOption
     *
     * @param webHookOption
     */
    public GroupAlarm webHookOption(WebHookOption webHookOption) {
        this.webHookOption = webHookOption;
        return this;
    }


    /**
     * add item to 告警通知联系人
     *
     * @param baseContact
     */
    public void addBaseContact(BaseContact baseContact) {
        if (this.baseContact == null) {
            this.baseContact = new ArrayList<>();
        }
        this.baseContact.add(baseContact);
    }

    /**
     * add item to 通知策略
     *
     * @param noticeOption
     */
    public void addNoticeOption(NoticeOption noticeOption) {
        if (this.noticeOption == null) {
            this.noticeOption = new ArrayList<>();
        }
        this.noticeOption.add(noticeOption);
    }

}