package com.base.web.interceptor;

import java.io.PrintWriter;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.base.service.RoleService;

public class SecurityInterceptor implements HandlerInterceptor{
	@Resource
	private RoleService roleService;
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HttpSession session=request.getSession();
		Map<String, ?>userMap=(Map<String, ?>) session.getAttribute("user");
		Map<String, ?>rolesMap=(Map<String, ?>) session.getAttribute("roles");
		
		//如果角色是空的,则是未登录，跳转
		this.roleService.checkRole();
		if (rolesMap==null||!rolesMap.containsKey("role_id")) {
//			request.getRequestDispatcher(arg0)
			return false;
		}
		//如果角色不为空，检测路径访问是否合法，合法则放行，如果不合法则跳转到登录页面
		System.out.println("-------------------------------");
		PrintWriter out=response.getWriter();
		StringBuilder builder=new StringBuilder();
		builder.append("<script type=\"text/javascript\">");
		builder.append("alert('会话失效，请重新登录！');");
		builder.append("window.top.location.href='");
		builder.append("/zhaopin/mobile/login.html");
		builder.append("';");
		builder.append("</script>");
		out.print(builder.toString());
		return false;
	}

}
