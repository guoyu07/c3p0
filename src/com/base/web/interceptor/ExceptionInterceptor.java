package com.base.web.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
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
			ModelAndView modelAndView) throws Exception { 
		
		System.out.println(handler);
	} 

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		PrintWriter out=response.getWriter();
		try {
			HandlerMethod method=(HandlerMethod) handler;
			if (ex!=null) {
				logger.error(request.getRequestURI()+" "+ex.getMessage());
				//跳转到制定页面
			}else {
//			System.out.println( "Normal");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	
}