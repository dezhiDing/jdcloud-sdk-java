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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除域名录制配置
 */
public class DeleteLiveStreamDomainRecordRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流加速域名
     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 录制模板自定义名称:
  - 标准质量模板：sd、hd、hsd
  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,
               取值要求：数字、大小写字母或短横线(&quot;-&quot;),
               首尾不能有特殊字符(&quot;-&quot;)
  - &lt;b&gt;注意: 不能与标准的转码模板和已定义命名重复&lt;/b&gt;

     * Required:true
     */
    @Required
    private String template;


    /**
     * get 推流加速域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流加速域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 录制模板自定义名称:
  - 标准质量模板：sd、hd、hsd
  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,
               取值要求：数字、大小写字母或短横线(&quot;-&quot;),
               首尾不能有特殊字符(&quot;-&quot;)
  - &lt;b&gt;注意: 不能与标准的转码模板和已定义命名重复&lt;/b&gt;

     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 录制模板自定义名称:
  - 标准质量模板：sd、hd、hsd
  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,
               取值要求：数字、大小写字母或短横线(&quot;-&quot;),
               首尾不能有特殊字符(&quot;-&quot;)
  - &lt;b&gt;注意: 不能与标准的转码模板和已定义命名重复&lt;/b&gt;

     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }


    /**
     * set 推流加速域名
     *
     * @param publishDomain
     */
    public DeleteLiveStreamDomainRecordRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 录制模板自定义名称:
  - 标准质量模板：sd、hd、hsd
  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,
               取值要求：数字、大小写字母或短横线(&quot;-&quot;),
               首尾不能有特殊字符(&quot;-&quot;)
  - &lt;b&gt;注意: 不能与标准的转码模板和已定义命名重复&lt;/b&gt;

     *
     * @param template
     */
    public DeleteLiveStreamDomainRecordRequest template(String template) {
        this.template = template;
        return this;
    }


}