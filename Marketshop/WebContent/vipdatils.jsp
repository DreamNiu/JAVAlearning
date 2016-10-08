<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
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
<h1>会员信息</h1>
<h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统 <a href="reg.jsp">退出</a></h1>
<hr>
<center>
     <table width="855" height="60" cellpadding="0" cellspacing="0" border="0">
    <tr> 
         <!-- 商品详情 -->
         <% 
             VIPDao vipDao = new VIPDao();
             VIP vip = vipDao.getVIPByID(request.getParameter("V_ID"));
             if(vip!=null)
             {
          %>
         <td width="49%" valign="top"><table>
             <tr>
             <td rowspan="13">会员名称:<%=vip.getV_NAME()%></td>
           </tr>
             <tr>
             <td>会员ID:<%=vip.getV_ID() %></td>
           </tr>
             <tr>
             <td>电话:<%=vip.getV_TEL() %></td>
           </tr>
             <tr>
             <td>住址:<%=vip.getV_ADRESS() %></td>
           </tr>
             <tr>
             <td>邮箱:<%=vip.getV_EMAIL() %></td>
           </tr>
             <tr>
             <td>办理日期:<%=vip.getV_DATE() %></td>
           </tr>
             <tr>
             <td>截止时间:<%=vip.getV_PERIOD() %></td>
           </tr>
           </table></td>
         <% 
            }
            else{
                 %>
         <td width="46%" valign="top"><table>
             <tr>
             <td>无此会员</td>
           </tr>
           </table></td>
         <% 
            }
          %>
         <td width="5%" class="delete">
         <a href="Severlet/delServlet?action=delete&id=<%=vip.getV_ID()%>" onclick="delcfm();">删除</a>
         <a href="modifyVip.jsp?action=modify&V_ID=<%=vip.getV_ID()%>" onclick="delcfms();">修改</a> 
         <a href="viper.jsp">返回</a></td><br>
       </tr>
  </table>
   </center>
</body>
</html>
