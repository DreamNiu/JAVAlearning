<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="LOG.VIP" %>
<%@ page import="Dao.VIPDao" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'modifyVIPwork.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	html{
		height: 1%;
		background-color: #F3DFDF;
	}
</style>

  </head>
  
  <body>
   <%
		 VIPDao vipDao = new VIPDao();
		 
         VIP vip = vipDao.modifyVIP(request.getParameter("v_id"), new String(request.getParameter("v_name").getBytes("ISO-8859-1"),"UTF8"), 
                                request.getParameter("v_tel"), new String(request.getParameter("v_adress").getBytes("ISO-8859-1"),"UTF8"),
                                request.getParameter("v_date"),
                                request.getParameter("v_period"),
                                request.getParameter("v_email"));
		
	%><jsp:forward page="viper.jsp" />
  </body>
</html>
