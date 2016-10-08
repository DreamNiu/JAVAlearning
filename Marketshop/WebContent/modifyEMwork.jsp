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
<title>My JSP 'modifyGoodwork.jsp' starting page</title>
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
<%
		 EmployeeDao em = new EmployeeDao();
		 
         Employee e = em.modifyEM(request.getParameter("e_id"),new String(request.getParameter("e_name").getBytes("ISO-8859-1"),"UTF8"),
          request.getParameter("e_tel"), request.getParameter("e_email"), 
         new String(request.getParameter("e_adress").getBytes("ISO-8859-1"),"UTF8"), request.getParameter("e_birthday"), 
          request.getParameter("e_idnum"), request.getParameter("e_jobdate"), new String(request.getParameter("e_sex").getBytes("ISO-8859-1"),"UTF8"),new String(request.getParameter("e_job").getBytes("ISO-8859-1"),"UTF8"));
	%>
<jsp:forward page="employ.jsp" />

</body>
</html>
