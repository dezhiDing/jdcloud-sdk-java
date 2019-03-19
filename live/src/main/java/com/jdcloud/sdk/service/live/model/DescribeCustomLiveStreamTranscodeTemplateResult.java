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

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询用户自定义转码模板详情
 */
public class DescribeCustomLiveStreamTranscodeTemplateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 转码输出的码率值:
  - 取值: [200,3000]
  - 单位: kpbs

     */
    private Integer videoCodeRate;

    /**
     * 转码输出的帧率值:
  - 取值: 15/1、25/1、30/1、60/1

     */
    private String videoFrameRate;

    /**
     * 转码输出视频宽度:
  - 取值: [100,1920]
  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频
  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频

     */
    private Integer width;

    /**
     * 转码输出视频宽度:
  - 取值: [100,1920]
  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频
  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频

     */
    private Integer height;

    /**
     * 转码模板自定义名称:
  - 标准质量模板：sd、hd、hsd
  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,
              取值要求：数字、大小写字母或短横线(&quot;-&quot;),
              首尾不能有特殊字符(&quot;-&quot;)
  - &lt;b&gt;注意: 不能与标准的转码模板和已定义命名重复&lt;/b&gt;

     */
    private String template;

    /**
     * 转码输出音频编码格式:
  - 取值: aac、mp3
  - 不区分大小写

     */
    private String audioCodec;

    /**
     * 转码输出音频格式:
  - 取值: aac_lc，aac_low，aac_he，aac_he_v2
  - 不区分大小写

     */
    private String audioFormat;

    /**
     * 转码输出音频采样率:
  - 取值: [44100,48000]

     */
    private Integer audioSampleRate;

    /**
     * 转码输出音频通道数:
  - 1  单声道
  - 2  双声道

     */
    private Integer audioChannel;

    /**
     * 转码输出音频码率:
  - 取值: [16,128]
  - 单位: kbps

     */
    private Integer audioCodeRate;


    /**
     * get 转码输出的码率值:
  - 取值: [200,3000]
  - 单位: kpbs

     *
     * @return
     */
    public Integer getVideoCodeRate() {
        return videoCodeRate;
    }

    /**
     * set 转码输出的码率值:
  - 取值: [200,3000]
  - 单位: kpbs

     *
     * @param videoCodeRate
     */
    public void setVideoCodeRate(Integer videoCodeRate) {
        this.videoCodeRate = videoCodeRate;
    }

    /**
     * get 转码输出的帧率值:
  - 取值: 15/1、25/1、30/1、60/1

     *
     * @return
     */
    public String getVideoFrameRate() {
        return videoFrameRate;
    }

    /**
     * set 转码输出的帧率值:
  - 取值: 15/1、25/1、30/1、60/1

     *
     * @param videoFrameRate
     */
    public void setVideoFrameRate(String videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
    }

    /**
     * get 转码输出视频宽度:
  - 取值: [100,1920]
  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频
  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频

     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 转码输出视频宽度:
  - 取值: [100,1920]
  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频
  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频

     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 转码输出视频宽度:
  - 取值: [100,1920]
  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频
  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频

     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 转码输出视频宽度:
  - 取值: [100,1920]
  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频
  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频

     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get 转码模板自定义名称:
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
     * set 转码模板自定义名称:
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
     * get 转码输出音频编码格式:
  - 取值: aac、mp3
  - 不区分大小写

     *
     * @return
     */
    public String getAudioCodec() {
        return audioCodec;
    }

    /**
     * set 转码输出音频编码格式:
  - 取值: aac、mp3
  - 不区分大小写

     *
     * @param audioCodec
     */
    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    /**
     * get 转码输出音频格式:
  - 取值: aac_lc，aac_low，aac_he，aac_he_v2
  - 不区分大小写

     *
     * @return
     */
    public String getAudioFormat() {
        return audioFormat;
    }

    /**
     * set 转码输出音频格式:
  - 取值: aac_lc，aac_low，aac_he，aac_he_v2
  - 不区分大小写

     *
     * @param audioFormat
     */
    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    /**
     * get 转码输出音频采样率:
  - 取值: [44100,48000]

     *
     * @return
     */
    public Integer getAudioSampleRate() {
        return audioSampleRate;
    }

    /**
     * set 转码输出音频采样率:
  - 取值: [44100,48000]

     *
     * @param audioSampleRate
     */
    public void setAudioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    /**
     * get 转码输出音频通道数:
  - 1  单声道
  - 2  双声道

     *
     * @return
     */
    public Integer getAudioChannel() {
        return audioChannel;
    }

    /**
     * set 转码输出音频通道数:
  - 1  单声道
  - 2  双声道

     *
     * @param audioChannel
     */
    public void setAudioChannel(Integer audioChannel) {
        this.audioChannel = audioChannel;
    }

    /**
     * get 转码输出音频码率:
  - 取值: [16,128]
  - 单位: kbps

     *
     * @return
     */
    public Integer getAudioCodeRate() {
        return audioCodeRate;
    }

    /**
     * set 转码输出音频码率:
  - 取值: [16,128]
  - 单位: kbps

     *
     * @param audioCodeRate
     */
    public void setAudioCodeRate(Integer audioCodeRate) {
        this.audioCodeRate = audioCodeRate;
    }


    /**
     * set 转码输出的码率值:
  - 取值: [200,3000]
  - 单位: kpbs

     *
     * @param videoCodeRate
     */
    public DescribeCustomLiveStreamTranscodeTemplateResult videoCodeRate(Integer videoCodeRate) {
        this.videoCodeRate = videoCodeRate;
        return this;
    }

    /**
     * set 转码输出的帧率值:
  - 取值: 15/1、25/1、30/1、60/1

     *
     * @param videoFrameRate
     */
    public DescribeCustomLiveStreamTranscodeTemplateResult videoFrameRate(String videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
        return this;
    }

    /**
     * set 转码输出视频宽度:
  - 取值: [100,1920]
  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频
  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频

     *
     * @param width
     */
    public DescribeCustomLiveStreamTranscodeTemplateResult width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 转码输出视频宽度:
  - 取值: [100,1920]
  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频
  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频

     *
     * @param height
     */
    public DescribeCustomLiveStreamTranscodeTemplateResult height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set 转码模板自定义名称:
  - 标准质量模板：sd、hd、hsd
  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,
              取值要求：数字、大小写字母或短横线(&quot;-&quot;),
              首尾不能有特殊字符(&quot;-&quot;)
  - &lt;b&gt;注意: 不能与标准的转码模板和已定义命名重复&lt;/b&gt;

     *
     * @param template
     */
    public DescribeCustomLiveStreamTranscodeTemplateResult template(String template) {
        this.template = template;
        return this;
    }

    /**
     * set 转码输出音频编码格式:
  - 取值: aac、mp3
  - 不区分大小写

     *
     * @param audioCodec
     */
    public DescribeCustomLiveStreamTranscodeTemplateResult audioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * set 转码输出音频格式:
  - 取值: aac_lc，aac_low，aac_he，aac_he_v2
  - 不区分大小写

     *
     * @param audioFormat
     */
    public DescribeCustomLiveStreamTranscodeTemplateResult audioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    /**
     * set 转码输出音频采样率:
  - 取值: [44100,48000]

     *
     * @param audioSampleRate
     */
    public DescribeCustomLiveStreamTranscodeTemplateResult audioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
        return this;
    }

    /**
     * set 转码输出音频通道数:
  - 1  单声道
  - 2  双声道

     *
     * @param audioChannel
     */
    public DescribeCustomLiveStreamTranscodeTemplateResult audioChannel(Integer audioChannel) {
        this.audioChannel = audioChannel;
        return this;
    }

    /**
     * set 转码输出音频码率:
  - 取值: [16,128]
  - 单位: kbps

     *
     * @param audioCodeRate
     */
    public DescribeCustomLiveStreamTranscodeTemplateResult audioCodeRate(Integer audioCodeRate) {
        this.audioCodeRate = audioCodeRate;
        return this;
    }


}