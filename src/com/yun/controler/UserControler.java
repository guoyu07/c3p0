package com.yun.controler;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yun.dao.BaseDao;
@Controller
public class UserControler {
	@Resource
	private BaseDao baseDao;
	@RequestMapping("test")
	public String inputProduct() {
		List<?>list=baseDao.getList("select * from TB_SYS_USER t");
		System.out.println(list);
		return "index";
	}
	
	@RequestMapping("base/test2")
	public String test2() {
		return "index";
	}
}
