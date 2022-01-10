<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Users</title>
</head>
<body>
	<a href="signup">Add User</a> |
	 <a href="searchuser">Search</a>
	<br>
	<br>
	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>ProfilePath</th>
			<th>Profile</th>
			<TH>Action</TH>
		</tr>

		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.userId }</td>
				<td>${user.firstName }</td>
				<td>${user.email }</td>
				<td>${user.password }</td>
				<td>${user.profilePath }</td>
				<td><img src="${user.profilePath}" height="100px" width="100px" /></td>
				<td><a href="deleteuser?userId=${user.userId}">Delete</a> | <a
					href="viewuser?userId=${user.userId }">View</a> | <a
					href="edituser?userId=${user.userId }">Edit</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>