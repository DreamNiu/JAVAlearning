<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'cartTimes.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <hr>
   <form  action="cartTime" method="post" >
			  <table border="0" width="800" cellspacing="0" cellpadding="0">
			    <tr>
			    	<td class="lalel">请输入时间：</td>
			    	<td class="controler"><input type="text" name="time" /></td>
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
