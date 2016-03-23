package com.yun.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.dao.BaseDao;
import com.base.dao.JdbcSupport;
@Controller
public class UserControler {
	@Resource
	private BaseDao baseDao;
	Logger logger=Logger.getLogger(this.getClass());
	@RequestMapping("test") 
	public String inputProduct(HttpServletRequest request,HttpServletResponse response) throws SQLException {
//		List<?>list=baseDao.getList("select * from TB_SYS_USER t");
//		System.out.println(list);
		List<Map<String, Object>> map=baseDao.queryForList("select * from wx_q_SYS_USER t");
		request.setAttribute("sss", map);
		return "index.jsp";
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
