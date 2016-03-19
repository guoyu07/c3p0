package com.yun.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

//	private Logger logger=Logger.getLogger(this.getClass());
	public static void main(String[] args) {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"WebRoot/WEB-INF/applicationContext.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext
				.getBean("jdbcTemplate");
		List list =jdbcTemplate.queryForList("select * from TB_SYS_USER t");
		System.out.println("--");
		// jdbcTemplate.execute("create table abcd(id int , name varchar(20))");
	}
}
