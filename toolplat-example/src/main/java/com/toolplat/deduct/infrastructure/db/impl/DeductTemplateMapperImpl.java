package com.toolplat.deduct.infrastructure.db.impl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.toolplat.common.model.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.toolplat.deduct.domain.model.DeductTplVo;
import com.toolplat.deduct.domain.repository.DeductTemplateRepository;
import com.toolplat.deduct.domain.qry.DeductTplQry;

@Service("deductTemplateMapper")
public class DeductTemplateMapperImpl implements DeductTemplateRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(DeductTemplateMapperImpl.class);

	@Override
	public DeductTplVo selectById(Long id) {

		DeductTplVo vo = new DeductTplVo();
		for (long i = 0; i <5; i++) {
			
			if(id.equals(i)){
				vo.setDeductContent("抵用券内容");
				vo.setDeductProdSn("sn" + i);
				vo.setDeductProdType("类型");
				vo.setDeductTitle("标--题");
				vo.setDeductType("类型");
				vo.setFaceValue(new BigDecimal(100*i));
				vo.setId(i);
			}
		}	
		return vo;
			
	}

	@Override
	public List<DeductTplVo> selectByExample(DeductTplQry qry) {

		List<DeductTplVo> list = new ArrayList<DeductTplVo>();
		list.add(selectById(4L));

		list.add(selectById(2L));

		list.add(selectById(1L));
		list.add(selectById(3L));

		list.add(selectById(0L));
		return list;
	}

	@Override
	public PageResult<DeductTplVo> pageByExample(DeductTplQry qry) {

		PageResult<DeductTplVo> page = new PageResult<DeductTplVo>();
		page.setPage(1L);
		page.setPageSize(10L);
		page.setRows(selectByExample(new DeductTplQry()));
		page.setTotal(99L);
		
		return page;
	}

}

