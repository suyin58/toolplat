package com.wjs.member.plugin.intercepter;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class RestContextInteceptor  {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(RestContextInteceptor.class);
	
	private static final String ENCODING_UTF_8 = "UTF-8";

	private void logRequest(HttpServletRequest request) {

		StringBuffer logBuffer = new StringBuffer(128);

//		// refer_url
//		logBuffer.append("referUrl:");
//
//		@SuppressWarnings("rawtypes")
//		Enumeration e = request.getHeaders("Referer");
//		String referUrl;
//		if (e.hasMoreElements()) {
//			referUrl = (String) e.nextElement();
//		} else {
//			referUrl = "直接访问";
//		}
//		logBuffer.append(referUrl);
		// 获取url
		logBuffer.append(";URL:");
		StringBuffer url = request.getRequestURL();
		if (url != null) {
			StringUtils.replaceOnce(url.toString(), "http://", "https://");
		}
		logBuffer.append(url.toString());
		// 判断用户请求方式是否为ajax
		logBuffer.append(";ISAJAX:");
		String requestType = request.getHeader("X-Requested-With");
		if (StringUtils.isNotBlank(requestType) && requestType.equals("XMLHttpRequest")) {
			logBuffer.append("true");
		} else {
			logBuffer.append("false");
		}
		//获取所有参数
		StringBuffer paramBuffer = new StringBuffer(64);
		Enumeration<?> enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
			String paraName = (String) enu.nextElement();
			paramBuffer.append(paraName);
			paramBuffer.append(": ");
			paramBuffer.append(request.getParameter(paraName));
			paramBuffer.append(", ");
		}
		logBuffer.append(";Parameters:");
		logBuffer.append(paramBuffer.toString());

		// 记录本次请求耗时：
//		Long requestEndTime = System.currentTimeMillis();
//		Long requestStartTime = StringUtils.isEmpty(MDC.get(REQUEST_STARTTIME)) ? requestEndTime : Long.valueOf(MDC.get(REQUEST_STARTTIME));

//		logBuffer.append(";COST:");
//		logBuffer.append(requestEndTime - requestStartTime);
//		logBuffer.append(" ms");
		if (!"HEAD".equals(request.getMethod())) {
			LOGGER.info("requestLog:" + logBuffer.toString());
		}

	}

}
