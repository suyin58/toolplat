package com.toolplat.deduct.domain.repository;
import java.util.List;

import com.toolplat.common.model.PageResult;
import com.toolplat.deduct.domain.model.DeductTplVo;
import com.toolplat.deduct.domain.qry.DeductTplQry;


public interface DeductTemplateRepository {

	DeductTplVo selectById(Long id);
	
	List<DeductTplVo> selectByExample(DeductTplQry qry);

	PageResult<DeductTplVo> pageByExample(DeductTplQry qry);
	
	

}

