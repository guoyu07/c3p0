package com.base.web.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionInterceptor implements HandlerInterceptor {
	Logger logger=Logger.getLogger(this.getClass());

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
		PrintWriter out=response.getWriter();
		if (ex!=null) {
			logger.error(ex.getMessage());
			//跳转到制定页面
		}else {
//			System.out.println( "Normal");
		}
		
	}



	
}