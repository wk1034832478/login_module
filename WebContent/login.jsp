<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
<%
	String basepath = request.getContextPath();
%>
</head>
<body>
<h1>登录</h1>
<form action='<%=basepath %>/auth' method='post'>
	<input type='text' name='username' />
	<input type='password' name='passwd' />
	<div>
		<%=request.getAttribute("error") %>
	</div>
	<input type='submit' value='提交'  />
</form>
</body>
</html>