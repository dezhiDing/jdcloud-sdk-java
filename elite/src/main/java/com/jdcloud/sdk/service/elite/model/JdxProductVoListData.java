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

package com.jdcloud.sdk.service.elite.model;

import java.util.List;
import java.util.ArrayList;

/**
 * jdxProductVoListData
 */
public class JdxProductVoListData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 每页记录数
     */
    private Integer pageSize;

    /**
     * 总记录数
     */
    private Integer totalRecord;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 商品信息列表
     */
    private List<JdxProductVo> dataList;


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * set 页码
     *
     * @param pageNo
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * get 每页记录数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页记录数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 总记录数
     *
     * @return
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    /**
     * set 总记录数
     *
     * @param totalRecord
     */
    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    /**
     * get 总页数
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set 总页数
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * get 商品信息列表
     *
     * @return
     */
    public List<JdxProductVo> getDataList() {
        return dataList;
    }

    /**
     * set 商品信息列表
     *
     * @param dataList
     */
    public void setDataList(List<JdxProductVo> dataList) {
        this.dataList = dataList;
    }


    /**
     * set 页码
     *
     * @param pageNo
     */
    public JdxProductVoListData pageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set 每页记录数
     *
     * @param pageSize
     */
    public JdxProductVoListData pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 总记录数
     *
     * @param totalRecord
     */
    public JdxProductVoListData totalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    /**
     * set 总页数
     *
     * @param totalPage
     */
    public JdxProductVoListData totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set 商品信息列表
     *
     * @param dataList
     */
    public JdxProductVoListData dataList(List<JdxProductVo> dataList) {
        this.dataList = dataList;
        return this;
    }


    /**
     * add item to 商品信息列表
     *
     * @param dataList
     */
    public void addDataList(JdxProductVo dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}