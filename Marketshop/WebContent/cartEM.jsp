<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="Dao.CartDao" %>
<%@ page import="LOG.Cart" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'cartEM.jsp' starting page</title>
    
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
     <h1>销售记录</h1>  <h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统  <a href="reg.jsp">退出</a></h1>
   <a href="index.jsp">首页</a><a href="index.jsp">商品列表</a>
   <hr> 
   <div id="shopping">
  	
			<table>
				<tr>
				    <th>商品ID</th>
					<th>商品名称</th>
					<th>商品售价</th>
					<th>商品进价</th>
					<th>已售数量</th>
					<th>总价</th>
					<th>利润</th>
					<th>售出时间</th>
					<th>销售员编号</th>
				</tr>
				
				<!-- 循环的开始 -->
			   <%  CartDao cart = new CartDao();
			   
                   ArrayList<Cart> list = cart.getALLCart() ;
                   Double total=0.0;
                   Double profit=0.0;
                   
                    if(list!=null&&list.size()>0)
                   {
	                    for(int i=0;i<list.size();i++)
	                    {
	                        Cart s = list.get(i);
	                        if(s.getE_ID().equals(request.getParameter("e_id")))
	                        {
				       
				     %> 
			<tr>
				    <td class="thumb"><%=s.getS_ID()%></td>
					<td class="thumb"><%=s.getS_NAME()%></td>
					<td class="number"><%=s.getS_SELLPRICE() %></td>
					<td class="number"><%=s.getS_PRICE() %></td>
					<td class="number">
                     	<%=s.getS_SELLNUM() %>					
					</td> 
					<td class="price" id="price_id_1">
						<%=s.getS_TOTAL() %>	
					</td> 
					<td class="number"><%=s.getS_PROFIT() %></td>  
					<td class="number"><%=s.getS_TIME() %></td>   
					<td class="number"><%=s.getE_ID() %></td>                 
				
				     <% 
				     total = total+s.getS_TOTAL();
				     profit=profit+s.getS_PROFIT();
				     }
				    }
				  
				     %>
				<!--循环的结束-->
				
			</table>
			 <div class="total"><span id="total">总计：<%=total %>￥</span></div>
			 <div class="total"><span id="total">利润：<%=profit %>￥</span></div>
			  <% 
			    }
			 %>
			<div class="submit"><input type="submit" value="查询" onclick="javascript:document.location.href='cartEMs.jsp'" /></div>
		   <div class="submit"><input type="submit" value="返回" onclick="javascript:document.location.href='yingye.jsp'" /></div>
	</div>
  </body>
</html>
