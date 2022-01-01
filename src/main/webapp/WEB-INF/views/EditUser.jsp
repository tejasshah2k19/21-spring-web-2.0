<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup</title>
</head>
<body>


	<form action="updateuser" method="post">

		FirstName : <input type="text" name="firstName"
			value="${user.firstName}" /> <br> Email : <input type="text"
			name="email" value="${user.email }" /><br> Password : <input
			type="password" name="password" value="${user.password }" /> <br> <input
			type="hidden" name="userId" value="${user.userId}"> <input type="submit" value="update" />


	</form>


</body>
</html>