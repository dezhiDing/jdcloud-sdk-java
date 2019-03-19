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

package com.jdcloud.sdk.service.live.model;


/**
 * watermarkTemplate
 */
public class WatermarkTemplate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * x轴偏移量
     */
    private Integer offSetX;

    /**
     * y轴偏移量
     */
    private Integer offSetY;

    /**
     * 宽
     */
    private Integer width;

    /**
     * 高
     */
    private Integer height;

    /**
     * url
     */
    private String url;

    /**
     * 水印模板自定义名称:
  - 标准质量模板：sd、hd、hsd
  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,
              取值要求：数字、大小写字母或短横线(&quot;-&quot;),
              首尾不能有特殊字符(&quot;-&quot;)
  - &lt;b&gt;注意: 不能与标准的转码模板和已定义命名重复&lt;/b&gt;

     */
    private String template;


    /**
     * get x轴偏移量
     *
     * @return
     */
    public Integer getOffSetX() {
        return offSetX;
    }

    /**
     * set x轴偏移量
     *
     * @param offSetX
     */
    public void setOffSetX(Integer offSetX) {
        this.offSetX = offSetX;
    }

    /**
     * get y轴偏移量
     *
     * @return
     */
    public Integer getOffSetY() {
        return offSetY;
    }

    /**
     * set y轴偏移量
     *
     * @param offSetY
     */
    public void setOffSetY(Integer offSetY) {
        this.offSetY = offSetY;
    }

    /**
     * get 宽
     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 宽
     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 高
     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 高
     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get 水印模板自定义名称:
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
     * set 水印模板自定义名称:
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
     * set x轴偏移量
     *
     * @param offSetX
     */
    public WatermarkTemplate offSetX(Integer offSetX) {
        this.offSetX = offSetX;
        return this;
    }

    /**
     * set y轴偏移量
     *
     * @param offSetY
     */
    public WatermarkTemplate offSetY(Integer offSetY) {
        this.offSetY = offSetY;
        return this;
    }

    /**
     * set 宽
     *
     * @param width
     */
    public WatermarkTemplate width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 高
     *
     * @param height
     */
    public WatermarkTemplate height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set url
     *
     * @param url
     */
    public WatermarkTemplate url(String url) {
        this.url = url;
        return this;
    }

    /**
     * set 水印模板自定义名称:
  - 标准质量模板：sd、hd、hsd
  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,
              取值要求：数字、大小写字母或短横线(&quot;-&quot;),
              首尾不能有特殊字符(&quot;-&quot;)
  - &lt;b&gt;注意: 不能与标准的转码模板和已定义命名重复&lt;/b&gt;

     *
     * @param template
     */
    public WatermarkTemplate template(String template) {
        this.template = template;
        return this;
    }


}