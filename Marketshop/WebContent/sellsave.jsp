<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="LOG.Goods" %>
<%@ page import="Dao.GoodsDao" %>
<%@ page import="LOG.Sell" %>
<%@ page import="Dao.SellDao" %>
<%@ page import="LOG.Cart" %>
<%@ page import="Dao.CartDao" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sellsave.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
html {
	height: 1%;
	background-color: #F3DFDF;
}
}
</style>
  </head>
  
  <body>
   <%   String id = request.getParameter("s_id");
        String time = request.getParameter("s_time");
        String e_id = request.getParameter("e_id");
        SellDao sell = new SellDao();
	    GoodsDao good = new GoodsDao();
	    CartDao cart = new CartDao();
		Goods g = good.getGoodsByID(id);
		
		Double num = Double.parseDouble(request.getParameter("s_num"));
		if(g!=null){
			Double total = g.getS_SELLPRICE()*num;
			Double profit = (g.getS_SELLPRICE()-g.getS_PRICE())*num;
			Sell s = sell.Save(id, g.getS_NAME() ,g.getS_SELLPRICE(), num,total );
			Cart c = cart.Save(id, g.getS_NAME(),g.getS_PRICE(),g.getS_SELLPRICE(), num, total, profit, time, e_id);
			Goods go = good.updateGoods(id,num ,num);
			
		}
		
		%><jsp:forward page="cart.jsp" />
			
	   	
		
  </body>
</html>
