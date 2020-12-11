package com.toolplat.common.model;


import java.io.Serializable;

/**
 * 分页查询控件
 *
 * @author suy
 */
public interface PageParameter extends Serializable {

    /**
     * 每页大小
     */
    Long pageSize = 10L;
    /**
     * 当前页数：按页查询，从第一页开始
     */
    Long pageNo = 1L;

    /**
     * 游标：按游标查询
     */
    String cursor = "";
}