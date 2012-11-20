<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  </head>
  
  <body>
    <div>
		
		<form id="login" name="login" action="login" method="post">
			<table id="table3">
				<tr>
					<td>用户名:</td>
				</tr>
				<tr>	
					<td><input  id="name" name="name" type="text" /></td>
				</tr>
				<tr>
					<td>密&nbsp&nbsp码:</td>
				</tr>
				<tr>
					<td><input id="password" name="password" type="password" /></td>
				</tr>
				<tr>
					<td width="80">
					
					<input  value="登&nbsp&nbsp录" type="submit" /></td>
				</tr>
			</table>
		</form>
		<button>注&nbsp&nbsp册</button>
	</div>
  </body>
</html>
