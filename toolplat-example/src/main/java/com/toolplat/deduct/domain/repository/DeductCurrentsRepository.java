package com.toolplat.deduct.domain.repository;

import java.util.List;

import com.toolplat.common.model.PageResult;
import com.toolplat.deduct.domain.model.DeductCurVo;
import com.toolplat.deduct.domain.qry.DeductCurQry;

public interface DeductCurrentsRepository {

	DeductCurVo selectByPrimaryKey(Long deductId);

	PageResult<DeductCurVo> pageByExample(DeductCurQry qry);

	List<DeductCurVo> selectByCustomerId(String customerId);


}

