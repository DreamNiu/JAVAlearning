<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
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
   <title>My JSP 'details.jsp' starting page</title>
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
div {
	float: left;
	margin-left: 30px;
	margin-right: 30px;
	margin-top: 5px;
	margin-bottom: 5px;
}
div dd {
	margin: 0px;
	font-size: 10pt;
}
div dd.dd_name {
	color: blue;
}
div dd.dd_city {
	color: #000;
}
</style>
   <script language="javascript">
	    function delcfm() {
	        if (!confirm("确认要删除？")) {
	            window.event.returnValue = false;
	        }
	    }
	     function delcfms() {
	        if (!confirm("确认要修改？")) {
	            window.event.returnValue = false;
	        }
	    }
   </script>
   </head>

   <body>
<h1>商品详情界面</h1>
<h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统 <a href="reg.jsp">退出</a></h1>
<hr>
<center>
     <table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
    <tr> 
         <!-- 商品详情 -->
         <% 
             GoodsDao goodsDao = new GoodsDao();
             Goods good = goodsDao.getGoodsByID(request.getParameter("S_ID"));
             if(good!=null)
             {
          %>
         <td width="70%" valign="top"><table>
             <tr>
             <td rowspan="13">商品名称:<%=good.getS_NAME()%></td>
           </tr>
             <tr>
             <td>商品ID:<%=good.getS_ID() %></td>
           </tr>
             <tr>
             <td>标准证号:<%=good.getS_BIAO()%></td>
           </tr>
             <tr>
             <td>规格:<%=good.getS_SPEC() %></td>
           </tr>
             <tr>
             <td>产地:<%=good.getS_ADRESS() %></td>
           </tr>
             <tr>
             <td>进价:￥ <%=good.getS_PRICE() %></td>
           </tr>
             <tr>
             <td>售价:￥<%=good.getS_SELLPRICE() %></td>
           </tr>
             <tr>
             <td>剩余数量:<%=good.getS_NUM() %></td>
           </tr>
             <tr>
             <td>已售出数量:<%=good.getS_SELLNUM() %></td>
           </tr>
             <tr>
             <td>公司号<%=good.getS_COMPANYID() %></td>
           </tr>
             <tr>
             <td>供应商编号<%=good.getS_SUPPLIERID() %></td>
           </tr>
           </table></td>
         <% 
            }
          %>
         <td class="delete"><a href="Severlet/delGoodServlet?action=delete&id=<%=good.getS_ID()%>" onclick="delcfm();">删除</a> <a href="modifyGoods.jsp?action=modify&S_ID=<%=good.getS_ID()%>" onclick="delcfms();">修改</a> <a href="second.jsp">返回</a></td>
       </tr>
  </table>
   </center>
</body>
</html>
