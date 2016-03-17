package com.yun.controler;


import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.dao.BaseDao;
import com.base.dao.JdbcSupport;
@Controller
public class UserControler {
	@Resource
	private BaseDao baseDao;
	
	@Resource
	JdbcSupport jdbcSupport;
	@RequestMapping("test") 
	public String inputProduct() throws SQLException {
//		List<?>list=baseDao.getList("select * from TB_SYS_USER t");
//		System.out.println(list);
		Connection conn=jdbcSupport.getConnection();
		System.out.println(conn);
		return "redirect:/page/index.html?url=434344535";
	}
	
	@RequestMapping("base/test2")
	public String test2() {
		return "index";
	}
}
