/**
 * 
 */
package com.toolplat.common.exception;

import lombok.Builder;
import lombok.Data;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.text.MessageFormat;


/**
 * 基本异常定义类
 * @author albert su suzy@wjs.com
 * @date 2015年9月15日 下午4:35:31 
 */
@Data
@Builder
public class BaseException extends RuntimeException {

	private static final long serialVersionUID = -6853310712844466349L;

	private static final Object[] EMPTY_PARAMS = new Object[0];

	private String exNo;
	private String exInfo;
	private JSONObject errData;


	public BaseException(String exNo) {
		if (StringUtils.isNotBlank(exNo)) {
			this.exNo = exNo;
			this.exInfo = ExNoUtil.get(exNo);
		}
	}

	public BaseException(String exNo, Object... errorParams) {
		this.exNo = exNo;
		this.exInfo = ExNoUtil.get(exNo);

		if(StringUtils.isNotBlank(exInfo)){
			if(exInfo.contains("{0}")){
				this.exInfo = MessageFormat.format(this.exInfo, errorParams);
			}else{
				if(errorParams != null && errorParams.length > 0){
					this.exInfo = errorParams[0].toString();
				}
			}
		}
	}
	
	public BaseException(Throwable e,String errorNo){
		super(e);
		this.exNo = errorNo;
	}

	public BaseException(Throwable e,String errorNo,Object... errorParams){
		super(e);
		this.exNo = exNo;
		this.exInfo = ExNoUtil.get(exNo);

		if(StringUtils.isNotBlank(exInfo)){
			if(exInfo.contains("{0}")){
				this.exInfo = MessageFormat.format(this.exInfo, errorParams);
			}else{
				if(errorParams != null && errorParams.length > 0){
					this.exInfo = errorParams[0].toString();
				}
			}
		}
	}

}
