package com.base.web.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionInterceptor implements HandlerInterceptor {
	
//	private Logger log = Logger.getLogger(this.getClass());
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		return true;
	}
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception { } 

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.write("测试萨嘎");
		System.out.println("end pathers  ");
//		log.error("--------------------");
		if (ex!=null) {
			System.out.println("异常信息：" + ex.getMessage());
			System.out.println(ex);
		}else {
//			System.out.println( "Normal");
		}
		
	}



	
}