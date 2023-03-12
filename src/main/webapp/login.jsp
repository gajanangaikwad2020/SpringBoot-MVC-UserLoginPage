<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>

<%
String msg=(String)request.getAttribute("msg");
if(msg!=null)
{
	
}

%>
<h1 align="center">Login Page</h1>
<div align="center">

<form action="home" method="post">
	<h2>Username :: 	<input type="text" name="usename"> </h2><br>
	<h2>Password  ::	<input type="password" name="password"></h2><br>
	
	<h2></h2><button>Login</button></h2>
</form>

</div>

</body>
</html>