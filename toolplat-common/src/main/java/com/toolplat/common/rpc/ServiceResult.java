package com.toolplat.common.rpc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import net.sf.json.JSONObject;

import java.io.Serializable;

/**
 * rpc 服务结果包装类
 * @author suyin
 */
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ServiceResult<T>  implements Serializable {
    private static final long serialVersionUID = 1340563394201259857L;

    protected boolean success;
    /**
     * 成功结果集合
     */
    protected T result;
    /**
     * 错误信息
     */
    protected String errorCode;
    protected String errorMsg;
    /**
     * 保存errorMsg的占位变量值，便于重新根据errorCode和语言渲染errorMsg，支持国际化
     */
    protected Object[] errParams;

    /**
     * 扩展用数据字段
     */
    protected JSONObject extData;


    public static <T> ServiceResult<T> getSuccessResult(T v) {
        ServiceResult<T> result = new ServiceResult<T>();
        result.setSuccess(true);
        result.setResult(v);
        return result;
    }

    public static <T> ServiceResult<T> getFailureResult(String errorCode, String msg) {
        ServiceResult<T> result = new ServiceResult<T>();
        result.setSuccess(false);
        result.setErrorCode(errorCode);
        result.setErrorMsg(msg);
        return result;
    }

    public static <T> ServiceResult<T> getFailureResult(String errorCode, String msg, String... errParams) {
        ServiceResult<T> result = new ServiceResult<T>();
        result.setSuccess(false);
        result.setErrorCode(errorCode);
        result.setErrorMsg(msg);
        result.setErrParams(errParams);
        return result;
    }


}