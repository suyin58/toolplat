package com.toolplat.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果集
 *
 * @author suyin
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 1631603496092805888L;

    /**
     * 当前分页结果集
     */
    private List<T> rows;

    /**
     * 是否有更多数据
     */
    private Boolean hasMore;

    /**
     * 下次获取数据的游标
     */
    private Long nextCursor;


    /**
     * 当前页
     */
    private Long page = 1L;
    /**
     * 每页大小
     */
    private Long pageSize = 10L;
    /**
     * 总数
     */
    private Long total = -1L;
}
