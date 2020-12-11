package com.toolplat.deduct.domain.service;

import java.util.List;

import com.toolplat.common.model.PageResult;
import com.toolplat.deduct.domain.model.DeductCurVo;
import com.toolplat.deduct.domain.qry.DeductCurQry;

/**
 * 抵用券操作和查询接口
 * @author albert.su suzy@wjs.com
 * @date 2016年10月20日 上午9:12:34 
 * 
 *
 */
public interface PathNoneServer {
	
	
	List<DeductCurVo> getUsableDeductCurrentsByCustId(String customerId);
	
	
	/**
	 * 分页查询
	 * @return
	 * @author albert.su suzy@wjs.com
	 * @date 2016年10月20日 上午9:16:08
	 */
	PageResult<DeductCurVo> pageDeductCurrents(DeductCurQry qry);

	DeductCurVo getDeductById(Long deductId);
}
