<%@ page language="java" import="java.util.*,zte.banksimulation.service.*,zte.banksimulation.entity.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'drawMoneyDo.jsp' starting page</title>
    
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
    <%
   		request.setCharacterEncoding("utf-8");
   		String cno = request.getParameter("cno");
   		String pwd = request.getParameter("pwd");
   		double money = Double.parseDouble(request.getParameter("money"));
   		Service service = new Service();
   		String message = service.drawMoney(cno,pwd,money);
   		request.setAttribute("message",message);
   		
   		request.getRequestDispatcher("/index.jsp").forward(request,response);
   	
   		
    %>
  </body>
</html>
