<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@ page import="LOG.Employee" %>
<%@ page import="Dao.EmployeeDao" %>
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
<h1>员工信息</h1>
<h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统 <a href="reg.jsp">退出</a></h1>
<hr>
<center>
     <table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
    <tr> 
         <!-- 商品详情 -->
         <% 
             EmployeeDao employeeDao = new EmployeeDao(); 
             Employee e = employeeDao.getEMPByID(request.getParameter("E_ID"));
             if(e!=null)
             {
          %>
         <td width="70%" valign="top"><table>
             <tr>
             <td rowspan="13">会员名称:<%=e.getE_NAME()%></td>
           </tr>
             <tr>
             <td>员工ID:<%=e.getE_ID() %></td>
           </tr>
             <tr>
             <td>身份证号:<%=e.getE_IDNUM() %></td>
           </tr>
             <tr>
             <td>性别:<%=e.getE_SEX() %></td>
           </tr>
             <tr>
             <td>电话:<%=e.getE_TEL() %></td>
           </tr>
             <tr>
             <td>住址:<%=e.getE_ADRESS() %></td>
           </tr>
             <tr>
             <td>邮箱:<%=e.getE_EMAIL() %></td>
           </tr>
             <tr>
             <td>出生日期:<%=e.getE_BIRTHDAY() %></td>
           </tr>
             <tr>
             <td>入职日期:<%=e.getE_JOBDATE() %></td>
           </tr>
             <tr>
             <td>入职日期:<%=e.getE_JOB() %></td>
           </tr>
           </table></td>
         <% 
            }
          %>
         <td class="delete"><a href="Severlet/delEMServlet?action=delete&id=<%=e.getE_ID()%>" onclick="delcfm();">删除</a> <a href="modifyEM.jsp?action=modify&E_ID=<%=e.getE_ID()%>" onclick="delcfms();">修改</a> <a href="employ.jsp">返回</a></td>
       </tr>
  </table>
   </center>
</body>
</html>
