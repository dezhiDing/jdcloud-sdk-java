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
 * recordDetail
 */
public class RecordDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 格式:
  - MP4
  - FLV
  - TS

     */
    private String format;

    /**
     * 时长:
  - 单位: 分
  - 精确两位小数

     */
    private Double duration;


    /**
     * get 格式:
  - MP4
  - FLV
  - TS

     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * set 格式:
  - MP4
  - FLV
  - TS

     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * get 时长:
  - 单位: 分
  - 精确两位小数

     *
     * @return
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * set 时长:
  - 单位: 分
  - 精确两位小数

     *
     * @param duration
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }


    /**
     * set 格式:
  - MP4
  - FLV
  - TS

     *
     * @param format
     */
    public RecordDetail format(String format) {
        this.format = format;
        return this;
    }

    /**
     * set 时长:
  - 单位: 分
  - 精确两位小数

     *
     * @param duration
     */
    public RecordDetail duration(Double duration) {
        this.duration = duration;
        return this;
    }


}