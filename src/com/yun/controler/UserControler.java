package com.yun.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserControler {
	@RequestMapping("test")
	public String inputProduct() {
		return "index";
	}
	
	@RequestMapping("base/test2")
	public String test2() {
		return "index";
	}
}
