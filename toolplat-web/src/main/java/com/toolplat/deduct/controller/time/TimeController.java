package com.toolplat.deduct.controller.time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toolplat.deduct.controller.BaseController;


@Controller
public class TimeController extends BaseController{

	private static final Logger LOGGER = LoggerFactory.getLogger(TimeController.class);
	
	
	@RequestMapping("riqi")
	public Object riqi(){
		
		return "/time/timecalc";
	}
	
	@RequestMapping("unixtime")
	public Object unixtime(){
		
		return "/time/unixtime";
	}
}

