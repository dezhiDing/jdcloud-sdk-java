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
 * SSL Certificate
 * SSL数字证书相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ssl.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ssl.model.DownloadCertDesc;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 下载证书 [MFA enabled]
 */
public class DownloadCertResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * certDesc
     */
    private List<DownloadCertDesc> certDesc;


    /**
     * get certDesc
     *
     * @return
     */
    public List<DownloadCertDesc> getCertDesc() {
        return certDesc;
    }

    /**
     * set certDesc
     *
     * @param certDesc
     */
    public void setCertDesc(List<DownloadCertDesc> certDesc) {
        this.certDesc = certDesc;
    }


    /**
     * set certDesc
     *
     * @param certDesc
     */
    public DownloadCertResult certDesc(List<DownloadCertDesc> certDesc) {
        this.certDesc = certDesc;
        return this;
    }


    /**
     * add item to certDesc
     *
     * @param certDesc
     */
    public void addCertDesc(DownloadCertDesc certDesc) {
        if (this.certDesc == null) {
            this.certDesc = new ArrayList<>();
        }
        this.certDesc.add(certDesc);
    }

}