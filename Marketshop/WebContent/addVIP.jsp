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
    <h1>添加会员界面</h1>  <h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统  <a href="reg.jsp">退出</a></h1>
    <hr>
    <form  action="addVIPinsert.jsp" method="post" >
			  <table border="0" width="800" cellspacing="0" cellpadding="0">
			    <tr>
			    	<td class="label">会员id：</td>
			    	<td class="controler"><input type="text" name="v_id" /></td>
			    </tr>
			    <tr>
			    	<td class="label">姓名：：</td>
			    	<td class="controler"><input type="text" name="v_name" ></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">电话：</td>
			    	<td class="controler"><input type="text" name="v_tel" ></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">住址：</td>
			    	<td class="controler"><input type="text" name="v_adress" ></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">邮箱：</td>
			    	<td class="controler"><input type="text" name="v_email" ></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">注册日期：</td>
			    	<td class="controler"><input type="text" name="v_date" ></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">到期时间：</td>
			    	<td class="controler"><input type="text" name="v_period" ></td>
			    	
			    </tr>
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
