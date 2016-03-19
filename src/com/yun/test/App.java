package com.yun.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

//	private Logger logger=Logger.getLogger(this.getClass());
	public static void main(String[] args) {
		PropertyConfigurator.configure("D:\\Workspaces\\JavaEE\\c3p0\\src\\log4j.properties");
		Logger logger=Logger.getLogger(App.class);
		logger.error("记录错误之地");
		logger.error("-------------------");
		logger.debug("------debug------------");
	}
}
