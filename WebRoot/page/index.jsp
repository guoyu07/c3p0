<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
 	  <a href="productInput.do"> 添加商品</a> <br>
 	  <a href="productInput2.do"> 添加商品2</a> <br>
 	  <a href="productTestJson.do"> 测试json支持</a> <br>
 	  <div>--${sss}---</div>
 	  <table>
 	  <c:forEach items="${sss}" var="o">
 	  	<tr><td>${o.xm}</td></tr>
 	  </c:forEach>
 	  	
 	  </table>
  </body>
</html>