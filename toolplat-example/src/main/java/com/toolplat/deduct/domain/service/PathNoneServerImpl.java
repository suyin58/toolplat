package com.toolplat.deduct.domain.service;

import com.toolplat.common.exception.BaseException;
import com.toolplat.common.model.PageResult;
import com.toolplat.deduct.domain.model.DeductCurVo;
import com.toolplat.deduct.domain.qry.DeductCurQry;
import com.toolplat.deduct.domain.repository.DeductCurrentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pathNoneServer")
public class PathNoneServerImpl implements PathNoneServer {


	@Autowired
	private DeductCurrentsRepository deductCurrentsMapper;

	@Override
	public DeductCurVo getDeductById(Long deductId) {
		
		DeductCurVo vo = deductCurrentsMapper.selectByPrimaryKey(deductId);

		return vo;
	}

	@Override
	public PageResult<DeductCurVo> pageDeductCurrents(DeductCurQry qry) {
		return deductCurrentsMapper.pageByExample(qry);
	}




	@Override
	public List<DeductCurVo> getUsableDeductCurrentsByCustId(String customerId) throws BaseException {
		return deductCurrentsMapper.selectByCustomerId(customerId);
	}


}

