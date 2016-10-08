<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'addVIP.jsp' starting page</title>
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
#mainForm {
	width: 343px;
	margin: 100px auto 0px;
	overflow: hidden;
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
<h1>添加员工界面</h1>
<h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统 <a href="reg.jsp">退出</a></h1>
<hr>
<form  action="addemInsetr.jsp" method="post" id="mainForm">
  <div class="label"> 员工id：
    <input type="text" name="e_id" id="e_id" value="" size="30" />
  </div>
  <div class="label"> 姓名：
    <input type="text" name="e_name" id="e_name" value="" size="30" />
  </div>
  <div class="label"> 身份证号：
    <input type="text" name="e_idnum" id="e_idnum" value="" size="30" />
  </div>
  <div class="label"> 性别：
    <input type="text" name="e_sex" id="e_sex" value="" size="30" />
  </div>
  <div class="label"> 电话：
    <input type="text" name="e_tel" id="e_tel" value="" size="30" />
  </div>
  <div class="label"> 住址：
    <input type="text" name="e_adress" id="e_adress" value="" size="30" />
  </div>
  <div class="label"> 邮箱：
    <input type="text" name="e_email" id="e_email" value="" size="30" />
  </div>
  <div class="label"> 出生日期：
    <input type="text" name="e_birthday" id="e_birthday" value="" size="30" />
  </div>
  <div class="label"> 入职时间：
    <input type="text" name="e_jobdate" id="e_jobdate" value="" size="30" />
  </div>
  <div class="label"> 职位：
    <input type="text" name="e_job" id="e_job" value="" size="30" />
  </div>
  <div class="label"> 登录密码：
    <input type="text" name="e_passwd" id="e_passwd" value="" size="30" />
  </div>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="submit" value="确定" />
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="reset" value="取消"/>
</form>
</body>
</html>
