package com.wjs.member.common.web.util;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 服务返回给客户端的json对象包装
 */
public class JsonResult<T> {

	private boolean success = false;

	private String resultMsg;

	private T data = null;

	public JsonResult(boolean success, String resultMsg) {
		this.success = success;
		this.resultMsg = resultMsg;
	}

	public JsonResult(boolean success, String resultMsg, T data) {
		this.success = success;
		this.resultMsg = resultMsg;
		this.data = data;
	}


	
	public boolean isSuccess() {
	
		return success;
	}

	
	public void setSuccess(boolean success) {
	
		this.success = success;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
