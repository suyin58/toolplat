package com.toolplat.deduct.infrastructure.db.impl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.toolplat.common.model.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.toolplat.deduct.domain.model.DeductCurVo;
import com.toolplat.deduct.domain.repository.DeductCurrentsRepository;
import com.toolplat.deduct.domain.qry.DeductCurQry;


@Service("deductCurrentsMapper")
public class DeductCurrentsMapperImpl implements DeductCurrentsRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(DeductCurrentsMapperImpl.class);

	@Override
	public DeductCurVo selectByPrimaryKey(Long deductId) {
		DeductCurVo vo = new DeductCurVo();
		for (long i = 0; i <5; i++) {
			
			if(deductId.equals(i)){
				vo.setCustomerId(String.valueOf(i + 1000));
				vo.setDeductContent("抵用券内容");
				vo.setDeductProdSn("sn" + i);
				vo.setDeductProdType("类型");
				vo.setDeductTemplateId(1L);
				vo.setDeductTitle("标--题");
				vo.setDeductType("类型");
				vo.setFaceValue(new BigDecimal(100*i));
				vo.setId(i);
			}
			
			
		}
		return vo;
	}

	@Override
	public PageResult<DeductCurVo> pageByExample(DeductCurQry qry) {

		PageResult<DeductCurVo> page = new PageResult<DeductCurVo>();
		page.setPage(1L);
		page.setPageSize(10L);
		page.setRows(selectByCustomerId(""));
		page.setTotal(99L);
		
		return page;
	}

	@Override
	public List<DeductCurVo> selectByCustomerId(String customerId) {
		
		List<DeductCurVo> list = new ArrayList<DeductCurVo>();
		list.add(selectByPrimaryKey(4L));

		list.add(selectByPrimaryKey(2L));

		list.add(selectByPrimaryKey(1L));
		list.add(selectByPrimaryKey(3L));

		list.add(selectByPrimaryKey(0L));
		return list;
	}

}

