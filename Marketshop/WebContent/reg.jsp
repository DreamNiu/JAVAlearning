<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'reg.jsp' starting page</title>
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
.label {
	width: 20%
}
.controler {
	width: 80%
}
html {
	height: 1%;
	background-color: #F7DDDD;
}
.content {
	width: 100%;
}
.submitBackground {
	background-color: #B8EFB9;
}
.resetBackground {
	background-color: #A39090;
}
#mainForm {
	width: 343px;
	margin: 100px auto 0px;
	overflow: hidden;
}
div, h1, h2, h3, h4, p, form, label, input, textarea {
	margin: 0;
	padding: 0;
	border: 0;
	list-style: none;
}
.normalInput {
	position: relative;
	display: inline-block;
	padding: 0px 10px;
	width: 320px;
	height: 50px;
	line-height: 22px;
	font-size: 16px;
	margin-bottom: 20px;
	border: 1px solid #dadada;
	outline: none;
	color: #474747;
 *float: left;
	zoom: 1;
	overflow: hidden;
 *line-height: 50px;
}
div.normalInput {
	overflow: visible;
}
.normalInput input {
	font-size: 16px;
	width: 100%;
	height: 50px;
 *height: 49px;
 *line-height: 50px;
}
</style>
<script type="text/javascript" src="js/Calendar3.js"></script>
</head>

<body>
<h1>
  <center>
    用户登录界面
  </center>
</h1>
<div id='content' class="content">
  <hr>
  <form id="mainForm" action="Severlet/logServlet" method="post">
    <div class='normalInput'>
      <input type="text" value="" name="e_id" id="e_id" maxlength='50' placeholder='用户名'  autocomplete='off'/>
    </div>
    <div class='normalInput'>
      <input type="password" value="" name="e_passwd" id="e_passwd" maxlength='16' placeholder='密码' autocomplete='off'/>
    </div>
    <div  class='normalInput'>
      <input type="submit" name="Submit" value="登录" class="submitBackground">
    </div>
    <div  class='normalInput'>
      <input type="reset" value="取消" class="resetBackground">
    </div>
  </form>
</div>
</body>
</html>