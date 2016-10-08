<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<title>My JSP 'modifyVip.jsp' starting page</title>
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
<h1>修改会员</h1>
<h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统 <a href="reg.jsp">退出</a></h1>
<hr>
<form  action="modifyVIPwork.jsp" method="post" >
  <table border="0" width="800" cellspacing="0" cellpadding="0">
    <%
             VIPDao vipDao = new VIPDao();
             VIP vip = vipDao.getVIPByID(request.getParameter("V_ID"));
             if(vip!=null)
             {
            %>
    <tr>
      <td class="label">会员id：</td>
      <td class="controler"><input type="text" name="v_id" value=<%=vip.getV_ID() %>></td>
    </tr>
    <tr>
      <td class="label">姓名：：</td>
      <td class="controler"><input type="text" name="v_name" value=<%=vip.getV_NAME() %>></td>
    </tr>
    <tr>
      <td class="label">电话：</td>
      <td class="controler"><input type="text" name="v_tel" value=<%=vip.getV_TEL() %>></td>
    </tr>
    <tr>
      <td class="label">住址：</td>
      <td class="controler"><input type="text" name="v_adress" value=<%=vip.getV_ADRESS() %>></td>
    </tr>
    <tr>
      <td class="label">邮箱：</td>
      <td class="controler"><input type="text" name="v_email" value=<%=vip.getV_EMAIL() %>></td>
    </tr>
    <tr>
      <td class="label">注册日期：</td>
      <td class="controler"><input type="text" name="v_date" value=<%=vip.getV_DATE() %>></td>
    </tr>
    <tr>
      <td class="label">到期时间：</td>
      <td class="controler"><input type="text" name="v_period" value=<%=vip.getV_PERIOD() %>></td>
    </tr>
    <% 
			    }
			    %>
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
