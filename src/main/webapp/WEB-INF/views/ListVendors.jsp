<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
	
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>

	<h2>List Vendors</h2>

	<table border="1">
		<tr>
			<td>VendorId</td>
			<td>Name</td>
			<td>Email</td>
			<td>Password</td>
			<td>Action</td>
		</tr>


		<c:forEach items="${vendors}" var="v">

			<tr>
				<td>${v.vendorId }</td>
				<td>${v.name }</td>
				<td>${v.email }</td>
				<td>${v.password }</td>
				<td>  <a href="editvendor">Edit</a> | <a href="deletevendor?vendorId=${v.vendorId}">Delete</a> </td>
			</tr>

		</c:forEach>
	</table>


</body>
</html>