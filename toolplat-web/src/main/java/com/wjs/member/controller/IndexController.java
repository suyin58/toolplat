package com.wjs.member.controller;	
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController{

	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping("")
	public Object index(){
		
		return "/cron/crontab";
	}
}

