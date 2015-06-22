/**
 * 
 */
package com.changhong.data.common.test.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author QiYao
 * @mail tony.qiyao@foxmail.com
 * @date 2015年6月19日
 * @since 1.0.0 用于输出日志数据
 */
public class AbsOut {
	/**
	 * 日志类
	 */
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 对象映射
	 */
	protected ObjectMapper om = new ObjectMapper();
	
	/**
	 * 
	 * @since 1.0.0 将对象按照文本进行数据
	 * @param o
	 */
	public void out(Object o){
		
		try {
			String s = om.writeValueAsString(o);
			logger.info(s);
		} catch (JsonProcessingException e) {
			RuntimeException d = new RuntimeException(e);
			throw d;
		}
		
	}
}
