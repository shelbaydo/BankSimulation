<%@ page language="java" import="java.util.*,zte.banksimulation.service.*,zte.banksimulation.entity.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addDo.jsp' starting page</title>
    
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
    	Card card = new Card();
    	card.setCno(request.getParameter("cno"));
    	card.setCname(request.getParameter("cname"));
    	card.setPwd(request.getParameter("pwd"));
    	card.setMoney(Double.parseDouble(request.getParameter("money")));
    	Service service = new Service();
    	if(service.addCard(card)==1){
    		%>
			<script>
				alert("添加成功")
				window.location.href='/BankSimulation/index.jsp';
			</script>
			
			<%	
    	}else{
    		%>
			<script>
				alert("添加失败")
				window.location.href='/BankSimulation/index.jsp';
			</script>
			
			<%	
    	}
     %>
  </body>
</html>
