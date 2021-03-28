package com.tutorialspoint;


import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
 
/**
 * 通过SimpleMappingExceptionResolver做全局异常处理
 * @Configuration:配置类的注解
 *
 */
@Configuration
public class GlobalException {
	/**
	 * 改方法必须要有返回值，返回值类型必须是SimpleMappingExceptionResolver
	 * 无法传递异常信息到页面中
	 */
	@Bean
	public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
		SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
		
		Properties mappers = new Properties();
		
		/**
		 * 参数一：异常的类型，注意必须是异常类型的全名
		 * 参数二：视图名称
		 */
		mappers.put("SpringException", "ExceptionPage");
		
		// 设置异常与视图的映射信息
		resolver.setExceptionMappings(mappers);
		return resolver;
	}
}