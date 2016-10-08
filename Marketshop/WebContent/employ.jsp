<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
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
<h1>员工信息</h1>
<h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统 <a href="reg.jsp">退出</a></h1>
<hr>
<center>
      <table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
    <tr>
          <td><!-- 循环开始 -->
        
        <% 
               EmployeeDao employeeDao = new EmployeeDao(); 
               ArrayList<Employee> list = employeeDao.getALLEMP();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  Employee e = list.get(i);
           %>
        <div>
              <dl>
            <dd class="E_ID">员工ID:<%=e.getE_ID() %></dd>
            <dt> <a href="emdetails.jsp?E_ID=<%=e.getE_ID()%>">员工姓名:<%=e.getE_NAME() %></a> </dt>
            <dd class="E_INFO">身份证号:<%=e.getE_IDNUM() %> &nbsp;&nbsp;性别:<%=e.getE_SEX() %> &nbsp;&nbsp;电话:<%=e.getE_TEL() %> &nbsp;&nbsp;住址:<%=e.getE_ADRESS() %> </dd>
            <dd class="E_INFOS">邮箱:<%=e.getE_EMAIL() %> &nbsp;&nbsp;出生日期:<%=e.getE_BIRTHDAY() %> &nbsp;&nbsp;入职日期:<%=e.getE_JOBDATE() %> &nbsp;&nbsp;职位:<%=e.getE_JOB() %> </dd>
          </dl>
            </div>
        
        <!-- 循环结束 -->
        
        <%
                   }
              } 
          %></td>
        </tr>
    <tr>
          <td colspan="2" align="center"><input type="submit" value="添加" onclick="javascript:document.location.href='addem.jsp'"/>
        &nbsp;&nbsp;
        <input type="submit" value="查询" onclick="javascript:document.location.href='selectEM.jsp'"/>
        &nbsp;&nbsp; </td>
      </table>
    </center>
</body>
</html>