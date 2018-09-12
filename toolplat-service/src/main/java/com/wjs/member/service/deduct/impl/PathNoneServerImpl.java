package com.wjs.member.service.deduct.impl;	
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjs.common.dao.PageDataList;
import com.wjs.common.exception.BaseException;
import com.wjs.member.clientVo.deduct.DeductCurVo;
import com.wjs.member.dao.deduct.DeductCurrentsMapper;
import com.wjs.member.qry.deduct.DeductCurQry;
import com.wjs.member.service.deduct.PathNoneServer;

@Service("pathNoneServer")
public class PathNoneServerImpl implements PathNoneServer {

	private static final Logger LOGGER = LoggerFactory.getLogger(PathNoneServerImpl.class);
	
	@Autowired
	private DeductCurrentsMapper deductCurrentsMapper;

	@Override
	public DeductCurVo getDeductById(Long deductId) {
		
		DeductCurVo vo = deductCurrentsMapper.selectByPrimaryKey(deductId);

		return vo;
	}

	@Override
	public PageDataList<DeductCurVo> pageDeductCurrents(DeductCurQry qry) {
		PageDataList<DeductCurVo> pageList = new PageDataList<DeductCurVo>();


		
		return deductCurrentsMapper.pageByExample(qry);
	}




	@Override
	public List<DeductCurVo> getUsableDeductCurrentsByCustId(String customerId) throws BaseException {
		
		
		
		
		return deductCurrentsMapper.selectByCustomerId(customerId);
	}


}

