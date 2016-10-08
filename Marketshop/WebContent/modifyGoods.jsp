<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    
    <title>My JSP 'modifyGoods.jsp' starting page</title>
    <meta charset="utf-8">
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
.label {
	position: relative;
	display: inline-block;
	padding: 0px 10px;
	width: 320px;
	height: 30px;
	line-height: 22px;
	font-size: 14px;
	margin-bottom: 20px;
}
</style>

  </head>
  
  <body>
    <h1>修改商品</h1>  <h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统  <a href="reg.jsp">退出</a></h1>
    <hr>
    <form  action="modifyGoodswork.jsp" method="post" >
			  <table border="0" width="800" cellspacing="0" cellpadding="0">
			    <% 
             GoodsDao goodsDao = new GoodsDao();
             Goods good = goodsDao.getGoodsByID(request.getParameter("S_ID"));
             if(good!=null)
             {
          %>
			    <tr>
			    	<td class="label">商品id：</td>
			    	<td class="controler"><input type="text" name="s_id" value=<%=good.getS_ID() %>/></td>
			    </tr>
			    <tr>
			    	<td class="label">商品名称：</td>
			    	<td class="controler"><input type="text" name="s_name" value=<%=good.getS_NAME() %>></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">标准证号：</td>
			    	<td class="controler"><input type="text" name="s_biao" value=<%=good.getS_BIAO() %>></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">规格：</td>
			    	<td class="controler"><input type="text" name="s_spec" value=<%=good.getS_SPEC() %>></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">产地：</td>
			    	<td class="controler"><input type="text" name="s_adress" value=<%=good.getS_ADRESS() %>></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">进价：</td>
			    	<td class="controler"><input type="text" name="s_price" value=<%=good.getS_PRICE() %>></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">售价：</td>
			    	<td class="controler"><input type="text" name="s_sellprice" value=<%=good.getS_SELLPRICE() %>></td>
			    	
			    </tr>
			     <tr>
			    	<td class="label">剩余数量：</td>
			    	<td class="controler"><input type="text" name="s_num" value=<%=good.getS_NUM() %>></td>
			    	
			    </tr>
			     <tr>
			    	<td class="label">已售出数量：</td>
			    	<td class="controler"><input type="text" name="s_sellnum" value=<%=good.getS_SELLNUM() %>></td>
			    	
			    </tr>
			     <tr>
			    	<td class="label">公司号：</td>
			    	<td class="controler"><input type="text" name="s_companyid" value=<%=good.getS_COMPANYID() %>></td>
			    	
			    </tr>
			     <tr>
			    	<td class="label">供应商编号：</td>
			    	<td class="controler"><input type="text" name="s_supplierid" value=<%=good.getS_SUPPLIERID() %>></td>
			    	
			    </tr>
			    <%} 
			    %>
			    <tr>
			    	<td colspan="2" align="center">
			    		<input type="submit" value="确定"/>&nbsp;&nbsp;
			    	    <input type="reset" value="取消"/>&nbsp;&nbsp;
			    	</td>
			    </tr>
			  </table>
			  
			  
			  
			</form>
			
  </body>
</html>

