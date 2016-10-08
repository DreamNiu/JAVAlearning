<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <title>My JSP 'modifyGood.jsp' starting page</title>
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
<h1>修改员工信息</h1>
<h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统 <a href="reg.jsp">退出</a></h1>
<hr>
<form  action="modifyEMwork.jsp" method="post" >
      <table border="0" width="800" cellspacing="0" cellpadding="0">
    <% 
             EmployeeDao employeeDao = new EmployeeDao(); 
             Employee e = employeeDao.getEMPByID(request.getParameter("E_ID"));
             if(e!=null)
             {
          %>
    <tr>
          <td class="label">员工id：</td>
          <td class="controler"><input type="text" name="e_id" value=<%=e.getE_ID() %>/></td>
        </tr>
    <tr>
          <td class="label">姓名：：</td>
          <td class="controler"><input type="text" name="e_name" value=<%=e.getE_NAME() %>></td>
        </tr>
    <tr>
          <td class="label">身份证号：</td>
          <td class="controler"><input type="text" name="e_idnum" value=<%=e.getE_IDNUM() %>></td>
        </tr>
    <tr>
          <td class="label">性别：</td>
          <td class="controler"><input type="text" name="e_sex" value=<%=e.getE_SEX() %>></td>
        </tr>
    <tr>
          <td class="label">电话：</td>
          <td class="controler"><input type="text" name="e_tel" value=<%=e.getE_TEL() %>></td>
        </tr>
    <tr>
          <td class="label">住址：</td>
          <td class="controler"><input type="text" name="e_adress" value=<%=e.getE_ADRESS() %>></td>
        </tr>
    <tr>
          <td class="label">邮箱：</td>
          <td class="controler"><input type="text" name="e_email" value=<%=e.getE_EMAIL() %>></td>
        </tr>
    <tr>
          <td class="label">出生日期：</td>
          <td class="controler"><input type="text" name="e_birthday" value=<%=e.getE_BIRTHDAY() %>></td>
        </tr>
    <tr>
          <td class="label">入职时间：</td>
          <td class="controler"><input type="text" name="e_jobdate" value=<%=e.getE_JOBDATE() %>></td>
        </tr>
    <tr>
          <td class="label">职位：</td>
          <td class="controler"><input type="text" name="e_job" value=<%=e.getE_JOB() %>></td>
        </tr>
    <%}
			     
			     %>
    <br>
    <tr>
          <td colspan="2" align="center"><input type="submit" value="确定"/>
        &nbsp;&nbsp;
        <input type="reset" value="取消"/>
        &nbsp;&nbsp; </td>
        </tr>
  </table>
    </form>
</body>
</html>
