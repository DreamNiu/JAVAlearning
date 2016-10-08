<%@page import="java.sql.Date"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ page import="LOG.Goods" %>
<%@ page import="Dao.GoodsDao" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addVIPinsert.jsp' starting page</title>
    
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
		 GoodsDao go = new GoodsDao();
		 Goods g = go.addGoods(request.getParameter("s_id"), new String(request.getParameter("s_name").getBytes("ISO-8859-1"),"UTF8"),   request.getParameter("s_biao"),
		                      new String(request.getParameter("s_adress").getBytes("ISO-8859-1"),"UTF8"), request.getParameter("s_companyid"),
		                      request.getParameter("s_spec"), request.getParameter("s_supplierid"),
		                      Double.parseDouble(request.getParameter("s_price")) ,Double.parseDouble(request.getParameter("s_sellprice")),
		                      Double.parseDouble(request.getParameter("s_num")) , Double.parseDouble(request.getParameter("s_sellnum")));
		 
        
          
	%><jsp:forward page="second.jsp" />
	
  </body>
</html>

