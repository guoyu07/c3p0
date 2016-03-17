package com.yun.controler;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		Statement statement=conn.createStatement();
		ResultSet rs=statement.executeQuery("select * from TB_SYS_USER t");
		while (rs.next()) {
			String name=rs.getString("xm");
			System.out.println(name);
		}
		System.out.println(conn);
		return "redirect:/page/index.html?url=434344535";
	}
	
	@RequestMapping("base/test2")
	public String test2() {
		return "index";
	}
	@RequestMapping("/ajax")
	public void ajax(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		out.write("-----胡说八道-----------------------");
	}
	
}
