package com.cx.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.MultipartConfigElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

/***
 * 
 * @author pro
 *
 */

@Configuration
public class FileuploadConfig {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	 @Bean
	    public MultipartConfigElement multipartConfigElement() {
	        MultipartConfigFactory factory = new MultipartConfigFactory();
	     // 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
	        factory.setMaxFileSize(DataSize.parse("50MB")); // 50MB
	        /// 设置总上传数据总大小
	        factory.setMaxRequestSize(DataSize.parse("500MB"));//50M
	        // 设置文件上传位置
	        LOG.info("------文件上传配置完成 文件大小50M 上传数据总大小500MB");
	        return factory.createMultipartConfig();
	    }
}
