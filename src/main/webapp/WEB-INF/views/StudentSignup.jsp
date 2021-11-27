<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student-Signup</title>
</head>
<body>

	<!-- 	<form action="registerstudent" method="post">
		FirstName : <input type="text" name="firstName" /><br> Email :<input
			type="text" name="email" /><br> Password : <input
			type="password" name="password" /><br>
	<input type="submit" value="Register"/>
	</form>
 -->
	<s:form action="registerstudent" method="post" modelAttribute="student">
		FirstName : <s:input path="firstName" />
		<s:errors path="firstName"></s:errors>
		<br> Email :<s:input path="email" />
		<s:errors path="email"></s:errors>
		<br> Password : <s:password path="password" />
		<s:errors path="password"></s:errors>
		<br>
		<input type="submit" value="Register" />
	</s:form>



</body>
</html>