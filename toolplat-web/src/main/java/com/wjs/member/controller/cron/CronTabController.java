package com.wjs.member.controller.cron;	
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.quartz.CronExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wjs.common.exception.BaseException;
import com.wjs.member.controller.BaseController;


@Controller
@RequestMapping("cron")
public class CronTabController extends BaseController{

	private static final Logger LOGGER = LoggerFactory.getLogger(CronTabController.class);


	@RequestMapping("")
	public Object index(){
		
		return "/cron/crontab";
	}
	@ResponseBody
	@RequestMapping("calcLastRuntime")
	public Object calcLastRuntime(HttpServletRequest request, String cronExpression){
		
		
		List<String> list = new ArrayList<>();
		try {
			
			CronExpression exp = new CronExpression(cronExpression);
			SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");  
            Date d = new Date();  
            int i = 0;  
            // 循环得到接下来n此的触发时间点，供验证  
            while (i < 5) {  
                d = exp.getNextValidTimeAfter(d);  
                if(null == d){
                	break;
                }
                list.add(df.format(d));
                ++i;  
            }  
		} catch (ParseException e) {
			
			throw new BaseException("ERROR:{}, cronExp:{}", e.getMessage(), cronExpression);
		}
		if(CollectionUtils.isEmpty(list)){
			throw new BaseException("can not get nearest 5 exec time, cronExp:{}", cronExpression);
		}
		
		return success(list);
	}
}

