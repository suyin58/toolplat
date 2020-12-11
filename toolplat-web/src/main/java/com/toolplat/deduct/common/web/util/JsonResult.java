package com.toolplat.deduct.common.web.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * 服务返回给客户端的json对象包装
 */
@Data
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult<T> {

	private boolean success = false;

	private String resultMsg;

	private T data = null;


}
