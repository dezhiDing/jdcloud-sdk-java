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

package com.jdcloud.sdk.service.partner.model;


/**
 * distributorDTO
 */
public class DistributorDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 渠道商ID
     */
    private String distributorId;

    /**
     * 渠道商名称
     */
    private String distributorName;

    /**
     * 京东云账户
     */
    private String pin;

    /**
     * 合同编号
     */
    private String contractNo;

    /**
     * 营业执照号
     */
    private String businessLicense;

    /**
     * 法定代表人
     */
    private String legalRepresentative;

    /**
     * 营业执照图片
     */
    private String businessLicensePic;

    /**
     * 主营业务描述
     */
    private String businessDesc;

    /**
     * 办公地址
     */
    private String workAddress;

    /**
     * 联系人姓名
     */
    private String contracter;

    /**
     * 联系人电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 所属地域
     */
    private String region;

    /**
     * 入驻日期(一级渠道商手工录入、二级渠道商审批通过日期)
     */
    private String settleTime;

    /**
     * 状态(0 审批中、2驳回、1 已入驻、3已停止合作)
     */
    private Integer status;

    /**
     * 驳回原因
     */
    private String reason;

    /**
     * 级次(0一级、1 二级)
     */
    private Integer distributorLevel;

    /**
     * 渠道商类型(0合作伙伴、1 渠道代理)
     */
    private Integer distributorType;

    /**
     * 上级渠道商ID
     */
    private String parentDistributorId;

    /**
     * 银行开户名
     */
    private String bankCompanyName;

    /**
     * 银行账户
     */
    private String bankCardNo;

    /**
     * 开户行支行名称
     */
    private String bankBranchName;

    /**
     * 开户行支行联行号
     */
    private String bankBranchNo;

    /**
     * 合同主体
     */
    private String contractSubject;

    /**
     * 所属部门(0企业线、1政府线)
     */
    private Integer dept;

    /**
     * 京东云负责人(京东云人员erp或名称)
     */
    private String erp;


    /**
     * get 渠道商ID
     *
     * @return
     */
    public String getDistributorId() {
        return distributorId;
    }

    /**
     * set 渠道商ID
     *
     * @param distributorId
     */
    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    /**
     * get 渠道商名称
     *
     * @return
     */
    public String getDistributorName() {
        return distributorName;
    }

    /**
     * set 渠道商名称
     *
     * @param distributorName
     */
    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    /**
     * get 京东云账户
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 京东云账户
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 合同编号
     *
     * @return
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * set 合同编号
     *
     * @param contractNo
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * get 营业执照号
     *
     * @return
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * set 营业执照号
     *
     * @param businessLicense
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    /**
     * get 法定代表人
     *
     * @return
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    /**
     * set 法定代表人
     *
     * @param legalRepresentative
     */
    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    /**
     * get 营业执照图片
     *
     * @return
     */
    public String getBusinessLicensePic() {
        return businessLicensePic;
    }

    /**
     * set 营业执照图片
     *
     * @param businessLicensePic
     */
    public void setBusinessLicensePic(String businessLicensePic) {
        this.businessLicensePic = businessLicensePic;
    }

    /**
     * get 主营业务描述
     *
     * @return
     */
    public String getBusinessDesc() {
        return businessDesc;
    }

    /**
     * set 主营业务描述
     *
     * @param businessDesc
     */
    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }

    /**
     * get 办公地址
     *
     * @return
     */
    public String getWorkAddress() {
        return workAddress;
    }

    /**
     * set 办公地址
     *
     * @param workAddress
     */
    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    /**
     * get 联系人姓名
     *
     * @return
     */
    public String getContracter() {
        return contracter;
    }

    /**
     * set 联系人姓名
     *
     * @param contracter
     */
    public void setContracter(String contracter) {
        this.contracter = contracter;
    }

    /**
     * get 联系人电话
     *
     * @return
     */
    public String getTel() {
        return tel;
    }

    /**
     * set 联系人电话
     *
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get 所属地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 所属地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 入驻日期(一级渠道商手工录入、二级渠道商审批通过日期)
     *
     * @return
     */
    public String getSettleTime() {
        return settleTime;
    }

    /**
     * set 入驻日期(一级渠道商手工录入、二级渠道商审批通过日期)
     *
     * @param settleTime
     */
    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime;
    }

    /**
     * get 状态(0 审批中、2驳回、1 已入驻、3已停止合作)
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态(0 审批中、2驳回、1 已入驻、3已停止合作)
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 驳回原因
     *
     * @return
     */
    public String getReason() {
        return reason;
    }

    /**
     * set 驳回原因
     *
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * get 级次(0一级、1 二级)
     *
     * @return
     */
    public Integer getDistributorLevel() {
        return distributorLevel;
    }

    /**
     * set 级次(0一级、1 二级)
     *
     * @param distributorLevel
     */
    public void setDistributorLevel(Integer distributorLevel) {
        this.distributorLevel = distributorLevel;
    }

    /**
     * get 渠道商类型(0合作伙伴、1 渠道代理)
     *
     * @return
     */
    public Integer getDistributorType() {
        return distributorType;
    }

    /**
     * set 渠道商类型(0合作伙伴、1 渠道代理)
     *
     * @param distributorType
     */
    public void setDistributorType(Integer distributorType) {
        this.distributorType = distributorType;
    }

    /**
     * get 上级渠道商ID
     *
     * @return
     */
    public String getParentDistributorId() {
        return parentDistributorId;
    }

    /**
     * set 上级渠道商ID
     *
     * @param parentDistributorId
     */
    public void setParentDistributorId(String parentDistributorId) {
        this.parentDistributorId = parentDistributorId;
    }

    /**
     * get 银行开户名
     *
     * @return
     */
    public String getBankCompanyName() {
        return bankCompanyName;
    }

    /**
     * set 银行开户名
     *
     * @param bankCompanyName
     */
    public void setBankCompanyName(String bankCompanyName) {
        this.bankCompanyName = bankCompanyName;
    }

    /**
     * get 银行账户
     *
     * @return
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * set 银行账户
     *
     * @param bankCardNo
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * get 开户行支行名称
     *
     * @return
     */
    public String getBankBranchName() {
        return bankBranchName;
    }

    /**
     * set 开户行支行名称
     *
     * @param bankBranchName
     */
    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    /**
     * get 开户行支行联行号
     *
     * @return
     */
    public String getBankBranchNo() {
        return bankBranchNo;
    }

    /**
     * set 开户行支行联行号
     *
     * @param bankBranchNo
     */
    public void setBankBranchNo(String bankBranchNo) {
        this.bankBranchNo = bankBranchNo;
    }

    /**
     * get 合同主体
     *
     * @return
     */
    public String getContractSubject() {
        return contractSubject;
    }

    /**
     * set 合同主体
     *
     * @param contractSubject
     */
    public void setContractSubject(String contractSubject) {
        this.contractSubject = contractSubject;
    }

    /**
     * get 所属部门(0企业线、1政府线)
     *
     * @return
     */
    public Integer getDept() {
        return dept;
    }

    /**
     * set 所属部门(0企业线、1政府线)
     *
     * @param dept
     */
    public void setDept(Integer dept) {
        this.dept = dept;
    }

    /**
     * get 京东云负责人(京东云人员erp或名称)
     *
     * @return
     */
    public String getErp() {
        return erp;
    }

    /**
     * set 京东云负责人(京东云人员erp或名称)
     *
     * @param erp
     */
    public void setErp(String erp) {
        this.erp = erp;
    }


    /**
     * set 渠道商ID
     *
     * @param distributorId
     */
    public DistributorDTO distributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }

    /**
     * set 渠道商名称
     *
     * @param distributorName
     */
    public DistributorDTO distributorName(String distributorName) {
        this.distributorName = distributorName;
        return this;
    }

    /**
     * set 京东云账户
     *
     * @param pin
     */
    public DistributorDTO pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 合同编号
     *
     * @param contractNo
     */
    public DistributorDTO contractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }

    /**
     * set 营业执照号
     *
     * @param businessLicense
     */
    public DistributorDTO businessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
        return this;
    }

    /**
     * set 法定代表人
     *
     * @param legalRepresentative
     */
    public DistributorDTO legalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
        return this;
    }

    /**
     * set 营业执照图片
     *
     * @param businessLicensePic
     */
    public DistributorDTO businessLicensePic(String businessLicensePic) {
        this.businessLicensePic = businessLicensePic;
        return this;
    }

    /**
     * set 主营业务描述
     *
     * @param businessDesc
     */
    public DistributorDTO businessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
        return this;
    }

    /**
     * set 办公地址
     *
     * @param workAddress
     */
    public DistributorDTO workAddress(String workAddress) {
        this.workAddress = workAddress;
        return this;
    }

    /**
     * set 联系人姓名
     *
     * @param contracter
     */
    public DistributorDTO contracter(String contracter) {
        this.contracter = contracter;
        return this;
    }

    /**
     * set 联系人电话
     *
     * @param tel
     */
    public DistributorDTO tel(String tel) {
        this.tel = tel;
        return this;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public DistributorDTO email(String email) {
        this.email = email;
        return this;
    }

    /**
     * set 所属地域
     *
     * @param region
     */
    public DistributorDTO region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 入驻日期(一级渠道商手工录入、二级渠道商审批通过日期)
     *
     * @param settleTime
     */
    public DistributorDTO settleTime(String settleTime) {
        this.settleTime = settleTime;
        return this;
    }

    /**
     * set 状态(0 审批中、2驳回、1 已入驻、3已停止合作)
     *
     * @param status
     */
    public DistributorDTO status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 驳回原因
     *
     * @param reason
     */
    public DistributorDTO reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * set 级次(0一级、1 二级)
     *
     * @param distributorLevel
     */
    public DistributorDTO distributorLevel(Integer distributorLevel) {
        this.distributorLevel = distributorLevel;
        return this;
    }

    /**
     * set 渠道商类型(0合作伙伴、1 渠道代理)
     *
     * @param distributorType
     */
    public DistributorDTO distributorType(Integer distributorType) {
        this.distributorType = distributorType;
        return this;
    }

    /**
     * set 上级渠道商ID
     *
     * @param parentDistributorId
     */
    public DistributorDTO parentDistributorId(String parentDistributorId) {
        this.parentDistributorId = parentDistributorId;
        return this;
    }

    /**
     * set 银行开户名
     *
     * @param bankCompanyName
     */
    public DistributorDTO bankCompanyName(String bankCompanyName) {
        this.bankCompanyName = bankCompanyName;
        return this;
    }

    /**
     * set 银行账户
     *
     * @param bankCardNo
     */
    public DistributorDTO bankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }

    /**
     * set 开户行支行名称
     *
     * @param bankBranchName
     */
    public DistributorDTO bankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }

    /**
     * set 开户行支行联行号
     *
     * @param bankBranchNo
     */
    public DistributorDTO bankBranchNo(String bankBranchNo) {
        this.bankBranchNo = bankBranchNo;
        return this;
    }

    /**
     * set 合同主体
     *
     * @param contractSubject
     */
    public DistributorDTO contractSubject(String contractSubject) {
        this.contractSubject = contractSubject;
        return this;
    }

    /**
     * set 所属部门(0企业线、1政府线)
     *
     * @param dept
     */
    public DistributorDTO dept(Integer dept) {
        this.dept = dept;
        return this;
    }

    /**
     * set 京东云负责人(京东云人员erp或名称)
     *
     * @param erp
     */
    public DistributorDTO erp(String erp) {
        this.erp = erp;
        return this;
    }


}