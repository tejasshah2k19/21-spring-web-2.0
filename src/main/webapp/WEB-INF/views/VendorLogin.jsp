<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>Login</h2>

	<form action="vendorauthenticate" method="post">


		Email : <input type="text" name="email"><br>
		<br> Password : <input type="text" name="password"><br>
		<br> <input type="submit" value="Login">
	</form>
	${msg }
</body>
</html>