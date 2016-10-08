<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'first.jsp' starting page</title>
    
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
    </style>
  </head>
  
  <body>
     <h1>会员信息  </h1>  <h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统  <a href="reg.jsp">退出</a></h1> 
    <hr>
    <center>
      <table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
        <tr>
          <!-- 商品详情 -->
        
          <td width="70%" valign="top">
            <table height="46">
               <tr>
         <td width="660" height="23" colspan="2" align="center">
         <input type="submit" value="查询员工信息" onclick="javascript:document.location.href='employ.jsp'"/>&nbsp;&nbsp;
	     <input type="reset" value="查询会员信息" onclick="javascript:document.location.href='viper.jsp'"/>&nbsp;&nbsp;
	     <input type="reset" value="查询商品信息" onclick="javascript:document.location.href='good.jsp'"/>&nbsp;&nbsp;
	      <input type="reset" value="查询商品售出" onclick="javascript:document.location.href='yingye.jsp'"/> 
        
         </td>
      </tr>
               
              
             </table>
          </td>
          
        </tr>
      </table>
    </center>
  </body>
</html>
