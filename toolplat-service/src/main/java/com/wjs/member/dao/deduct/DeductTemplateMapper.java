package com.wjs.member.dao.deduct;	
import java.util.List;

import com.wjs.common.dao.PageDataList;
import com.wjs.member.clientVo.deduct.DeductTplVo;
import com.wjs.member.qry.deduct.DeductTplQry;


public interface DeductTemplateMapper {

	DeductTplVo selectById(Long id);
	
	List<DeductTplVo> selectByExample(DeductTplQry qry);

	PageDataList<DeductTplVo> pageByExample(DeductTplQry qry);
	
	

}

