<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
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
    
    <title>My JSP 'index.jsp' starting page</title>
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
	   div{
	      float:left;
	      margin: 10px;
	   }
	   div dd{
	      margin:0px;
	      font-size:10pt;
	   }
	   div dd.dd_name
	   {
	      color:blue;
	   }
	   div dd.dd_city
	   {
	      color:#000;
	   }
	</style>
  </head>
  
  <body>
    <h1>会员信息</h1>  <h1>欢迎 "<%=session.getAttribute("username")%>"登陆到本系统  <a href="reg.jsp">退出</a></h1>
    <hr>
  
    <center>
    <table width="750" height="131" cellpadding="0" cellspacing="0" border="0">
      <tr>
        <td>
          
          <!-- 循环开始 -->
           <% 
               VIPDao vipDao = new VIPDao(); 
               ArrayList<VIP> list = vipDao.getALLGoods();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  VIP vip = list.get(i);
           %>   
          <div>
             <dl>
               <dd class="V_ID">会员ID:<%=vip.getV_ID() %></dd> <dt>
                 <a href="vipdatils.jsp?V_ID=<%=vip.getV_ID()%>">会员姓名:<%=vip.getV_NAME()%></a>
               </dt>
               <dd class="S_DATE">电话:<%=vip.getV_TEL() %>
               &nbsp;&nbsp;住址:<%=vip.getV_ADRESS() %>
               &nbsp;&nbsp;邮箱:<%=vip.getV_EMAIL() %>
               &nbsp;&nbsp;办理日期:<%=vip.getV_DATE() %>
               &nbsp;&nbsp;截止时间:<%=vip.getV_PERIOD() %>
               </dd>
               
             </dl>
          </div>
          <!-- 循环结束 -->
        
          <%
                   }
              } 
          %>
        </td>
      </tr>
      <tr>
         <td height="38" colspan="2" align="center">
         <input type="submit" value="添加" onclick="javascript:document.location.href='addVIP.jsp'"/>&nbsp;&nbsp;
	     <input type="submit" value="查询" onclick="javascript:document.location.href='selectVip.jsp'"/>&nbsp;&nbsp;
         <input type="submit" value="返回主页" onclick="javascript:document.location.href='first.jsp'"/>   
         </td>
      </tr>
    </table>
    </center>
  </body>
</html>