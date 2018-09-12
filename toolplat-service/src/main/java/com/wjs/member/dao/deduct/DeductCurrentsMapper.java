package com.wjs.member.dao.deduct;

import java.util.List;

import com.wjs.common.dao.PageDataList;
import com.wjs.member.clientVo.deduct.DeductCurVo;
import com.wjs.member.qry.deduct.DeductCurQry;

public interface DeductCurrentsMapper {

	DeductCurVo selectByPrimaryKey(Long deductId);

	PageDataList<DeductCurVo> pageByExample(DeductCurQry qry);

	List<DeductCurVo> selectByCustomerId(String customerId);


}

