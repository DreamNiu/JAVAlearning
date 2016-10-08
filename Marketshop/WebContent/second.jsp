<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
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
html {
	height: 1%;
	background-color: #F3DFDF;
}
div {
	float: left;
	margin: 10px;
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
	</head>

	<body>
<h1>商品展示</h1>
<h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统 <a href="reg.jsp">退出</a></h1>
<hr>
<center>
      <table width="750" height="160" cellpadding="0" cellspacing="0" border="0">
    <tr>
          <td><!-- 商品循环开始 -->
        
        <% 
               GoodsDao goodsDao = new GoodsDao(); 
               ArrayList<Goods> list = goodsDao.getALLGoods();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  Goods good = list.get(i);
           %>
        <div>
              <dl>
            <dd class="S_ID">商品ID:<%=good.getS_ID() %></dd>
            <dt> <a href="details.jsp?S_ID=<%=good.getS_ID()%>">商品名称:<%=good.getS_NAME()%></a> </dt>
            <dd class="S_DATE">标准证号:<%=good.getS_BIAO() %> &nbsp;&nbsp;规格:<%=good.getS_SPEC() %> &nbsp;&nbsp;产地:<%=good.getS_ADRESS() %> &nbsp;&nbsp;进价:￥ <%=good.getS_PRICE() %> </dd>
            <dd class="S_ADRESS">售价:￥<%=good.getS_SELLPRICE() %> &nbsp;&nbsp;剩余数量:<%=good.getS_NUM() %> &nbsp;&nbsp;已售出数量:<%=good.getS_SELLNUM() %> &nbsp;&nbsp;公司号<%=good.getS_COMPANYID() %> &nbsp;&nbsp;供应商编号<%=good.getS_SUPPLIERID() %> </dd>
          </dl>
            </div>
        
        <!-- 商品循环结束 -->
        
        <%
                   }
              } 
          %></td>
        </tr>
    <tr>
          <td height="49" colspan="2" align="center"><input type="submit" value="添加" onclick="javascript:document.location.href='addgood.jsp'"/>
        &nbsp;&nbsp;
        <input type="submit" value="查询" onclick="javascript:document.location.href='selectGood.jsp'"/>
        &nbsp;&nbsp; </td>
      </table>
    </center>
</body>
</html>