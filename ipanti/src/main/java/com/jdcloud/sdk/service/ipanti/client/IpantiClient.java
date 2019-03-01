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
 * 京东云IP高防相关接口
 * 京东云IP高防相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.ipanti.model.DescribeAlarmConfigRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeAlarmConfigResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeAlarmConfigExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeProtectionRuleOfForwardRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeProtectionRuleOfForwardRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeProtectionRuleOfForwardRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyEPBRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyEPBResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyEPBExecutor;
import com.jdcloud.sdk.service.ipanti.model.EnableInstanceIpWhiteListRequest;
import com.jdcloud.sdk.service.ipanti.model.EnableInstanceIpWhiteListResponse;
import com.jdcloud.sdk.service.ipanti.client.EnableInstanceIpWhiteListExecutor;
import com.jdcloud.sdk.service.ipanti.model.DisableCCObserverModeRequest;
import com.jdcloud.sdk.service.ipanti.model.DisableCCObserverModeResponse;
import com.jdcloud.sdk.service.ipanti.client.DisableCCObserverModeExecutor;
import com.jdcloud.sdk.service.ipanti.model.EnableCCIpLimitRequest;
import com.jdcloud.sdk.service.ipanti.model.EnableCCIpLimitResponse;
import com.jdcloud.sdk.service.ipanti.client.EnableCCIpLimitExecutor;
import com.jdcloud.sdk.service.ipanti.model.SetCCIpLimitRequest;
import com.jdcloud.sdk.service.ipanti.model.SetCCIpLimitResponse;
import com.jdcloud.sdk.service.ipanti.client.SetCCIpLimitExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyWebRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyWebRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyWebRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.DeleteForwardRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.DeleteForwardRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.DeleteForwardRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.SwitchWebRuleProtectRequest;
import com.jdcloud.sdk.service.ipanti.model.SwitchWebRuleProtectResponse;
import com.jdcloud.sdk.service.ipanti.client.SwitchWebRuleProtectExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeInstancesRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeInstancesResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeInstancesExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyInstanceIpBlackListRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyInstanceIpBlackListResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyInstanceIpBlackListExecutor;
import com.jdcloud.sdk.service.ipanti.model.CreateInstanceRequest;
import com.jdcloud.sdk.service.ipanti.model.CreateInstanceResponse;
import com.jdcloud.sdk.service.ipanti.client.CreateInstanceExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeCCAttackLogDetailsRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeCCAttackLogDetailsResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeCCAttackLogDetailsExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeAttackTypeCountRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeAttackTypeCountResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeAttackTypeCountExecutor;
import com.jdcloud.sdk.service.ipanti.model.SwitchForwardRuleOriginRequest;
import com.jdcloud.sdk.service.ipanti.model.SwitchForwardRuleOriginResponse;
import com.jdcloud.sdk.service.ipanti.client.SwitchForwardRuleOriginExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeGeoAreasRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeGeoAreasResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeGeoAreasExecutor;
import com.jdcloud.sdk.service.ipanti.model.EnableWebRuleCCRequest;
import com.jdcloud.sdk.service.ipanti.model.EnableWebRuleCCResponse;
import com.jdcloud.sdk.service.ipanti.client.EnableWebRuleCCExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeCCDefaultThresholdsRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeCCDefaultThresholdsResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeCCDefaultThresholdsExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeCCAttackLogsRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeCCAttackLogsResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeCCAttackLogsExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyInstanceCCRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyInstanceCCResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyInstanceCCExecutor;
import com.jdcloud.sdk.service.ipanti.model.DeleteCCProtectionRuleOfWebRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.DeleteCCProtectionRuleOfWebRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.DeleteCCProtectionRuleOfWebRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeFwdGraphRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeFwdGraphResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeFwdGraphExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyForwardRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyForwardRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyForwardRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeNameListRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeNameListResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeNameListExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeForwardRulesRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeForwardRulesResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeForwardRulesExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeWebRulesRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeWebRulesResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeWebRulesExecutor;
import com.jdcloud.sdk.service.ipanti.model.DisableCCIpLimitRequest;
import com.jdcloud.sdk.service.ipanti.model.DisableCCIpLimitResponse;
import com.jdcloud.sdk.service.ipanti.client.DisableCCIpLimitExecutor;
import com.jdcloud.sdk.service.ipanti.model.DisableInstanceIpBlackListRequest;
import com.jdcloud.sdk.service.ipanti.model.DisableInstanceIpBlackListResponse;
import com.jdcloud.sdk.service.ipanti.client.DisableInstanceIpBlackListExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeProtectionStatisticsRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeProtectionStatisticsResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeProtectionStatisticsExecutor;
import com.jdcloud.sdk.service.ipanti.model.DisableInstanceUrlWhiteListRequest;
import com.jdcloud.sdk.service.ipanti.model.DisableInstanceUrlWhiteListResponse;
import com.jdcloud.sdk.service.ipanti.client.DisableInstanceUrlWhiteListExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyCertInfoRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyCertInfoResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyCertInfoExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyInstanceUrlWhiteListRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyInstanceUrlWhiteListResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyInstanceUrlWhiteListExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyAlarmConfigRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyAlarmConfigResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyAlarmConfigExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyInstanceIpWhiteListRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyInstanceIpWhiteListResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyInstanceIpWhiteListExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeCertInfoRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeCertInfoResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeCertInfoExecutor;
import com.jdcloud.sdk.service.ipanti.model.SwitchForwardRuleProtectRequest;
import com.jdcloud.sdk.service.ipanti.model.SwitchForwardRuleProtectResponse;
import com.jdcloud.sdk.service.ipanti.client.SwitchForwardRuleProtectExecutor;
import com.jdcloud.sdk.service.ipanti.model.DownloadDDoSAttackLogsRequest;
import com.jdcloud.sdk.service.ipanti.model.DownloadDDoSAttackLogsResponse;
import com.jdcloud.sdk.service.ipanti.client.DownloadDDoSAttackLogsExecutor;
import com.jdcloud.sdk.service.ipanti.model.EnableInstanceUrlWhiteListRequest;
import com.jdcloud.sdk.service.ipanti.model.EnableInstanceUrlWhiteListResponse;
import com.jdcloud.sdk.service.ipanti.client.EnableInstanceUrlWhiteListExecutor;
import com.jdcloud.sdk.service.ipanti.model.DisableInstanceCCRequest;
import com.jdcloud.sdk.service.ipanti.model.DisableInstanceCCResponse;
import com.jdcloud.sdk.service.ipanti.client.DisableInstanceCCExecutor;
import com.jdcloud.sdk.service.ipanti.model.SwitchWebRuleOriginRequest;
import com.jdcloud.sdk.service.ipanti.model.SwitchWebRuleOriginResponse;
import com.jdcloud.sdk.service.ipanti.client.SwitchWebRuleOriginExecutor;
import com.jdcloud.sdk.service.ipanti.model.DownloadCCAttackLogsRequest;
import com.jdcloud.sdk.service.ipanti.model.DownloadCCAttackLogsResponse;
import com.jdcloud.sdk.service.ipanti.client.DownloadCCAttackLogsExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeAttackStatisticsRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeAttackStatisticsResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeAttackStatisticsExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeDDoSAttackLogsRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeDDoSAttackLogsResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeDDoSAttackLogsExecutor;
import com.jdcloud.sdk.service.ipanti.model.EnableCCObserverModeRequest;
import com.jdcloud.sdk.service.ipanti.model.EnableCCObserverModeResponse;
import com.jdcloud.sdk.service.ipanti.client.EnableCCObserverModeExecutor;
import com.jdcloud.sdk.service.ipanti.model.EnableInstanceIpBlackListRequest;
import com.jdcloud.sdk.service.ipanti.model.EnableInstanceIpBlackListResponse;
import com.jdcloud.sdk.service.ipanti.client.EnableInstanceIpBlackListExecutor;
import com.jdcloud.sdk.service.ipanti.model.CreateWebRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.CreateWebRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.CreateWebRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.DisableInstanceIpWhiteListRequest;
import com.jdcloud.sdk.service.ipanti.model.DisableInstanceIpWhiteListResponse;
import com.jdcloud.sdk.service.ipanti.client.DisableInstanceIpWhiteListExecutor;
import com.jdcloud.sdk.service.ipanti.model.DisableWebRuleCCRequest;
import com.jdcloud.sdk.service.ipanti.model.DisableWebRuleCCResponse;
import com.jdcloud.sdk.service.ipanti.client.DisableWebRuleCCExecutor;
import com.jdcloud.sdk.service.ipanti.model.CheckNameRequest;
import com.jdcloud.sdk.service.ipanti.model.CheckNameResponse;
import com.jdcloud.sdk.service.ipanti.client.CheckNameExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeDDoSGraphRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeDDoSGraphResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeDDoSGraphExecutor;
import com.jdcloud.sdk.service.ipanti.model.EnableInstanceCCRequest;
import com.jdcloud.sdk.service.ipanti.model.EnableInstanceCCResponse;
import com.jdcloud.sdk.service.ipanti.client.EnableInstanceCCExecutor;
import com.jdcloud.sdk.service.ipanti.model.CreateForwardRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.CreateForwardRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.CreateForwardRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeVpcIpListRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeVpcIpListResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeVpcIpListExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeWebRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeWebRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeWebRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyProtectionRuleOfForwardRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyProtectionRuleOfForwardRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyProtectionRuleOfForwardRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.DownloadCCAttackLogDetailsRequest;
import com.jdcloud.sdk.service.ipanti.model.DownloadCCAttackLogDetailsResponse;
import com.jdcloud.sdk.service.ipanti.client.DownloadCCAttackLogDetailsExecutor;
import com.jdcloud.sdk.service.ipanti.model.DeleteWebRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.DeleteWebRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.DeleteWebRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.ModifyInstanceNameRequest;
import com.jdcloud.sdk.service.ipanti.model.ModifyInstanceNameResponse;
import com.jdcloud.sdk.service.ipanti.client.ModifyInstanceNameExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeForwardRuleRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeForwardRuleResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeForwardRuleExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeCCGraphRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeCCGraphResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeCCGraphExecutor;
import com.jdcloud.sdk.service.ipanti.model.DescribeInstanceRequest;
import com.jdcloud.sdk.service.ipanti.model.DescribeInstanceResponse;
import com.jdcloud.sdk.service.ipanti.client.DescribeInstanceExecutor;

/**
 * ipantiClient
 */
public class IpantiClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.8";
    public final static String DefaultEndpoint = "ipanti.jdcloud-api.com";
    public final static String ServiceName = "ipanti";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private IpantiClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询告警配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAlarmConfigResponse describeAlarmConfig(DescribeAlarmConfigRequest request) throws JdcloudSdkException {
        return new DescribeAlarmConfigExecutor().client(this).execute(request);
    }

    /**
     * 查询非网站类转发规则的防护规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProtectionRuleOfForwardRuleResponse describeProtectionRuleOfForwardRule(DescribeProtectionRuleOfForwardRuleRequest request) throws JdcloudSdkException {
        return new DescribeProtectionRuleOfForwardRuleExecutor().client(this).execute(request);
    }

    /**
     * 更新实例弹性防护带宽
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyEPBResponse modifyEPB(ModifyEPBRequest request) throws JdcloudSdkException {
        return new ModifyEPBExecutor().client(this).execute(request);
    }

    /**
     * 开启实例 IP 白名单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableInstanceIpWhiteListResponse enableInstanceIpWhiteList(EnableInstanceIpWhiteListRequest request) throws JdcloudSdkException {
        return new EnableInstanceIpWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 关闭实例 CC 防护的观察者模式
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableCCObserverModeResponse disableCCObserverMode(DisableCCObserverModeRequest request) throws JdcloudSdkException {
        return new DisableCCObserverModeExecutor().client(this).execute(request);
    }

    /**
     * 开启 CC 防护每 IP 的限速
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableCCIpLimitResponse enableCCIpLimit(EnableCCIpLimitRequest request) throws JdcloudSdkException {
        return new EnableCCIpLimitExecutor().client(this).execute(request);
    }

    /**
     * 设置实例 CC 防护每 IP 限速
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetCCIpLimitResponse setCCIpLimit(SetCCIpLimitRequest request) throws JdcloudSdkException {
        return new SetCCIpLimitExecutor().client(this).execute(request);
    }

    /**
     * 修改网站类规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyWebRuleResponse modifyWebRule(ModifyWebRuleRequest request) throws JdcloudSdkException {
        return new ModifyWebRuleExecutor().client(this).execute(request);
    }

    /**
     * 删除非网站规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteForwardRuleResponse deleteForwardRule(DeleteForwardRuleRequest request) throws JdcloudSdkException {
        return new DeleteForwardRuleExecutor().client(this).execute(request);
    }

    /**
     * 网站类规则切换成防御状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SwitchWebRuleProtectResponse switchWebRuleProtect(SwitchWebRuleProtectRequest request) throws JdcloudSdkException {
        return new SwitchWebRuleProtectExecutor().client(this).execute(request);
    }

    /**
     * 查询实例列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws JdcloudSdkException {
        return new DescribeInstancesExecutor().client(this).execute(request);
    }

    /**
     * 设置实例 IP 黑名单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceIpBlackListResponse modifyInstanceIpBlackList(ModifyInstanceIpBlackListRequest request) throws JdcloudSdkException {
        return new ModifyInstanceIpBlackListExecutor().client(this).execute(request);
    }

    /**
     * 新购或升级高防实例, 新购或升级成功时, 需根据订单 id 完成支付流程, 新购或升级实例才会生效
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws JdcloudSdkException {
        return new CreateInstanceExecutor().client(this).execute(request);
    }

    /**
     * 查询 CC 攻击日志详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCCAttackLogDetailsResponse describeCCAttackLogDetails(DescribeCCAttackLogDetailsRequest request) throws JdcloudSdkException {
        return new DescribeCCAttackLogDetailsExecutor().client(this).execute(request);
    }

    /**
     * 查询各类型攻击次数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAttackTypeCountResponse describeAttackTypeCount(DescribeAttackTypeCountRequest request) throws JdcloudSdkException {
        return new DescribeAttackTypeCountExecutor().client(this).execute(request);
    }

    /**
     * 非网站类规则切换成回源状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SwitchForwardRuleOriginResponse switchForwardRuleOrigin(SwitchForwardRuleOriginRequest request) throws JdcloudSdkException {
        return new SwitchForwardRuleOriginExecutor().client(this).execute(request);
    }

    /**
     * 查询非网站类转发规则的防护规则 Geo 拦截可设置区域编码
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeGeoAreasResponse describeGeoAreas(DescribeGeoAreasRequest request) throws JdcloudSdkException {
        return new DescribeGeoAreasExecutor().client(this).execute(request);
    }

    /**
     * 网站类规则开启 CC
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableWebRuleCCResponse enableWebRuleCC(EnableWebRuleCCRequest request) throws JdcloudSdkException {
        return new EnableWebRuleCCExecutor().client(this).execute(request);
    }

    /**
     * 查询 CC 自定义默认阈值
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCCDefaultThresholdsResponse describeCCDefaultThresholds(DescribeCCDefaultThresholdsRequest request) throws JdcloudSdkException {
        return new DescribeCCDefaultThresholdsExecutor().client(this).execute(request);
    }

    /**
     * 查询 CC 攻击日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCCAttackLogsResponse describeCCAttackLogs(DescribeCCAttackLogsRequest request) throws JdcloudSdkException {
        return new DescribeCCAttackLogsExecutor().client(this).execute(request);
    }

    /**
     * 设置实例 CC 防护
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceCCResponse modifyInstanceCC(ModifyInstanceCCRequest request) throws JdcloudSdkException {
        return new ModifyInstanceCCExecutor().client(this).execute(request);
    }

    /**
     * 删除网站规则的 CC 防护规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteCCProtectionRuleOfWebRuleResponse deleteCCProtectionRuleOfWebRule(DeleteCCProtectionRuleOfWebRuleRequest request) throws JdcloudSdkException {
        return new DeleteCCProtectionRuleOfWebRuleExecutor().client(this).execute(request);
    }

    /**
     * 转发流量报表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeFwdGraphResponse describeFwdGraph(DescribeFwdGraphRequest request) throws JdcloudSdkException {
        return new DescribeFwdGraphExecutor().client(this).execute(request);
    }

    /**
     * 更新非网站类规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyForwardRuleResponse modifyForwardRule(ModifyForwardRuleRequest request) throws JdcloudSdkException {
        return new ModifyForwardRuleExecutor().client(this).execute(request);
    }

    /**
     * 查询高防实例名称列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeNameListResponse describeNameList(DescribeNameListRequest request) throws JdcloudSdkException {
        return new DescribeNameListExecutor().client(this).execute(request);
    }

    /**
     * 查询某个实例下的非网站转发配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeForwardRulesResponse describeForwardRules(DescribeForwardRulesRequest request) throws JdcloudSdkException {
        return new DescribeForwardRulesExecutor().client(this).execute(request);
    }

    /**
     * 查询某个实例下的网站类规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeWebRulesResponse describeWebRules(DescribeWebRulesRequest request) throws JdcloudSdkException {
        return new DescribeWebRulesExecutor().client(this).execute(request);
    }

    /**
     * 关闭 CC 防护每 IP 的限速
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableCCIpLimitResponse disableCCIpLimit(DisableCCIpLimitRequest request) throws JdcloudSdkException {
        return new DisableCCIpLimitExecutor().client(this).execute(request);
    }

    /**
     * 关闭实例 IP 黑名单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableInstanceIpBlackListResponse disableInstanceIpBlackList(DisableInstanceIpBlackListRequest request) throws JdcloudSdkException {
        return new DisableInstanceIpBlackListExecutor().client(this).execute(request);
    }

    /**
     * 查询高防实例防护统计信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProtectionStatisticsResponse describeProtectionStatistics(DescribeProtectionStatisticsRequest request) throws JdcloudSdkException {
        return new DescribeProtectionStatisticsExecutor().client(this).execute(request);
    }

    /**
     * 关闭实例 Url 白名单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableInstanceUrlWhiteListResponse disableInstanceUrlWhiteList(DisableInstanceUrlWhiteListRequest request) throws JdcloudSdkException {
        return new DisableInstanceUrlWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 编辑网站规则证书信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyCertInfoResponse modifyCertInfo(ModifyCertInfoRequest request) throws JdcloudSdkException {
        return new ModifyCertInfoExecutor().client(this).execute(request);
    }

    /**
     * 设置实例 Url 白名单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceUrlWhiteListResponse modifyInstanceUrlWhiteList(ModifyInstanceUrlWhiteListRequest request) throws JdcloudSdkException {
        return new ModifyInstanceUrlWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 更新告警配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyAlarmConfigResponse modifyAlarmConfig(ModifyAlarmConfigRequest request) throws JdcloudSdkException {
        return new ModifyAlarmConfigExecutor().client(this).execute(request);
    }

    /**
     * 设置实例 IP 白名单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceIpWhiteListResponse modifyInstanceIpWhiteList(ModifyInstanceIpWhiteListRequest request) throws JdcloudSdkException {
        return new ModifyInstanceIpWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 查询证书预览信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCertInfoResponse describeCertInfo(DescribeCertInfoRequest request) throws JdcloudSdkException {
        return new DescribeCertInfoExecutor().client(this).execute(request);
    }

    /**
     * 非网站类规则切换成防御状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SwitchForwardRuleProtectResponse switchForwardRuleProtect(SwitchForwardRuleProtectRequest request) throws JdcloudSdkException {
        return new SwitchForwardRuleProtectExecutor().client(this).execute(request);
    }

    /**
     * 下载 DDos 攻击日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DownloadDDoSAttackLogsResponse downloadDDoSAttackLogs(DownloadDDoSAttackLogsRequest request) throws JdcloudSdkException {
        return new DownloadDDoSAttackLogsExecutor().client(this).execute(request);
    }

    /**
     * 开启实例 Url 白名单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableInstanceUrlWhiteListResponse enableInstanceUrlWhiteList(EnableInstanceUrlWhiteListRequest request) throws JdcloudSdkException {
        return new EnableInstanceUrlWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 关闭实例 CC 防护
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableInstanceCCResponse disableInstanceCC(DisableInstanceCCRequest request) throws JdcloudSdkException {
        return new DisableInstanceCCExecutor().client(this).execute(request);
    }

    /**
     * 网站类规则切换成回源状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SwitchWebRuleOriginResponse switchWebRuleOrigin(SwitchWebRuleOriginRequest request) throws JdcloudSdkException {
        return new SwitchWebRuleOriginExecutor().client(this).execute(request);
    }

    /**
     * 下载 CC 攻击日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DownloadCCAttackLogsResponse downloadCCAttackLogs(DownloadCCAttackLogsRequest request) throws JdcloudSdkException {
        return new DownloadCCAttackLogsExecutor().client(this).execute(request);
    }

    /**
     * 查询攻击次数及流量峰值
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAttackStatisticsResponse describeAttackStatistics(DescribeAttackStatisticsRequest request) throws JdcloudSdkException {
        return new DescribeAttackStatisticsExecutor().client(this).execute(request);
    }

    /**
     * 查询 DDos 攻击日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDDoSAttackLogsResponse describeDDoSAttackLogs(DescribeDDoSAttackLogsRequest request) throws JdcloudSdkException {
        return new DescribeDDoSAttackLogsExecutor().client(this).execute(request);
    }

    /**
     * 开启实例 CC 防护的观察者模式
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableCCObserverModeResponse enableCCObserverMode(EnableCCObserverModeRequest request) throws JdcloudSdkException {
        return new EnableCCObserverModeExecutor().client(this).execute(request);
    }

    /**
     * 开启实例 IP 黑名单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableInstanceIpBlackListResponse enableInstanceIpBlackList(EnableInstanceIpBlackListRequest request) throws JdcloudSdkException {
        return new EnableInstanceIpBlackListExecutor().client(this).execute(request);
    }

    /**
     * 添加网站类规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateWebRuleResponse createWebRule(CreateWebRuleRequest request) throws JdcloudSdkException {
        return new CreateWebRuleExecutor().client(this).execute(request);
    }

    /**
     * 关闭实例 IP 白名单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableInstanceIpWhiteListResponse disableInstanceIpWhiteList(DisableInstanceIpWhiteListRequest request) throws JdcloudSdkException {
        return new DisableInstanceIpWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 网站类规则禁用 CC
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableWebRuleCCResponse disableWebRuleCC(DisableWebRuleCCRequest request) throws JdcloudSdkException {
        return new DisableWebRuleCCExecutor().client(this).execute(request);
    }

    /**
     * 检测实例名称是否合法
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckNameResponse checkName(CheckNameRequest request) throws JdcloudSdkException {
        return new CheckNameExecutor().client(this).execute(request);
    }

    /**
     * DDos 防护流量报表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDDoSGraphResponse describeDDoSGraph(DescribeDDoSGraphRequest request) throws JdcloudSdkException {
        return new DescribeDDoSGraphExecutor().client(this).execute(request);
    }

    /**
     * 开启实例 CC 防护
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableInstanceCCResponse enableInstanceCC(EnableInstanceCCRequest request) throws JdcloudSdkException {
        return new EnableInstanceCCExecutor().client(this).execute(request);
    }

    /**
     * 添加非网站类规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateForwardRuleResponse createForwardRule(CreateForwardRuleRequest request) throws JdcloudSdkException {
        return new CreateForwardRuleExecutor().client(this).execute(request);
    }

    /**
     * 查询用户的京东云 IP 资源
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeVpcIpListResponse describeVpcIpList(DescribeVpcIpListRequest request) throws JdcloudSdkException {
        return new DescribeVpcIpListExecutor().client(this).execute(request);
    }

    /**
     * 查询网站类规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeWebRuleResponse describeWebRule(DescribeWebRuleRequest request) throws JdcloudSdkException {
        return new DescribeWebRuleExecutor().client(this).execute(request);
    }

    /**
     * 修改非网站类转发规则的防护规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyProtectionRuleOfForwardRuleResponse modifyProtectionRuleOfForwardRule(ModifyProtectionRuleOfForwardRuleRequest request) throws JdcloudSdkException {
        return new ModifyProtectionRuleOfForwardRuleExecutor().client(this).execute(request);
    }

    /**
     * 下载 CC 攻击日志详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DownloadCCAttackLogDetailsResponse downloadCCAttackLogDetails(DownloadCCAttackLogDetailsRequest request) throws JdcloudSdkException {
        return new DownloadCCAttackLogDetailsExecutor().client(this).execute(request);
    }

    /**
     * 删除网站规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteWebRuleResponse deleteWebRule(DeleteWebRuleRequest request) throws JdcloudSdkException {
        return new DeleteWebRuleExecutor().client(this).execute(request);
    }

    /**
     * 修改实例名称
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceNameResponse modifyInstanceName(ModifyInstanceNameRequest request) throws JdcloudSdkException {
        return new ModifyInstanceNameExecutor().client(this).execute(request);
    }

    /**
     * 查询非网站类规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeForwardRuleResponse describeForwardRule(DescribeForwardRuleRequest request) throws JdcloudSdkException {
        return new DescribeForwardRuleExecutor().client(this).execute(request);
    }

    /**
     * CC 防护流量报表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCCGraphResponse describeCCGraph(DescribeCCGraphRequest request) throws JdcloudSdkException {
        return new DescribeCCGraphExecutor().client(this).execute(request);
    }

    /**
     * 查询实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws JdcloudSdkException {
        return new DescribeInstanceExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public IpantiClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private IpantiClient ipantiClient;

        public DefaultBuilder() {
            ipantiClient = new IpantiClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            ipantiClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            ipantiClient.httpRequestConfig = config;
            return this;
        }

        public IpantiClient build() throws JdcloudSdkException {

            if (ipantiClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                ipantiClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (ipantiClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("IpantiClient build error: jdcloud credentials provider not set");
                }
            }
            if (ipantiClient.httpRequestConfig == null) {
                ipantiClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (ipantiClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("IpantiClient build error: http request config not set");
                }
            }
            return ipantiClient;
        }

        public Builder environment(Environment environment) {
            ipantiClient.environment = environment;
            return this;
        }
    }
}
