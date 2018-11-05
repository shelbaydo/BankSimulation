<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<style type="text/css">
		a{
		   font-size:20px;
		   color:black;
		   text-decoration:none;
		}
		a:hover{
			color:red;
			text-decoration:underline;
		}
		#main{
			margin:20px 300px;
		}
	</style>
  </head>
  
  <body>
  <div id="main">
  	<h1>欢迎来到自助银行服务系统</h1>
    <a href="${pageContext.request.contextPath}/saveMoney.jsp">我要存钱</a><br/>
     <a href="${pageContext.request.contextPath}/drawMoney.jsp">我要取钱</a><br/>
      <a href="${pageContext.request.contextPath}/add.jsp">我要注册卡号</a><br/>
       <a href="${pageContext.request.contextPath}/delete.jsp">我要注销卡号</a><br/>
       ${message }
  </div>
  </body>
</html>
