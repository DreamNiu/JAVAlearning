<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="Dao.SellDao" %>
<%@ page import="LOG.Sell" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'cart.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <script language="javascript">
	    function delcfm() {
	        if (!confirm("确认要删除？")) {
	            window.event.returnValue = false;
	        }
	    }
   </script>

  </head>
  
  <body>
     <h1>我的购物车</h1>  <h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统  <a href="reg.jsp">退出</a></h1>
   <a href="index.jsp">首页</a><a href="index.jsp">商品列表</a>
   <hr> 
   <div id="shopping">
  	
			<table>
				<tr>
				    <th>商品ID</th>
					<th>商品名称</th>
					<th>商品单价</th>
					<th>购买数量</th>
					<th>商品价格</th>
					<th>操作</th>
				</tr>
				
				<!-- 循环的开始 -->
			   <%  SellDao sell = new SellDao();
			   
                   ArrayList<Sell> list = sell.getAllItems();
                   Double total=0.0;
                   
                    if(list!=null&&list.size()>0)
                   {
	                    for(int i=0;i<list.size();i++)
	                    {
	                        Sell s = list.get(i);
				       
				     %> 
			<tr>
				    <td class="thumb"><%=s.getS_ID()%></td>
					<td class="thumb"><%=s.getS_NAME()%></td>
					<td class="number"><%=s.getS_SELLPRICE() %></td>
					<td class="number">
                     	<%=s.getS_NUM() %>					
					</td> 
					<td class="price" id="price_id_1">
						<%=s.getS_TOTAL() %>	
					</td>                       
				
				     <% 
				     total = total+s.getS_TOTAL();
				         }
				      list.clear();   
				     %>
				<!--循环的结束-->
				
			</table>
			 <div class="total"><span id="total">总计：<%=total %>￥</span></div>
			  <% 
			    }
			 %>
			<div class="submit"><input type="submit" value="添加" onclick="javascript:document.location.href='sell.jsp'" /></div>
		   <div class="submit"><input type="submit" value="完成" onclick="javascript:document.location.href='clearsell.jsp'" /></div>
	</div>
  </body>
</html>
