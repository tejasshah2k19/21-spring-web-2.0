<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Vendor</title>
</head>
<body>
	<form action="updatevendor" method="post">

	<input type="hidden" name="vendorId" value="${vendor.vendorId }">
		Name : <input type="text" name="name"  value="${vendor.name}"><br> <Br>
		Email :<input type="text" name="email" value="${vendor.email}"><br> <Br>
		Password : <input type="text" name="password" value="${vendor.password}"><br> <Br>

		<input type="submit" value="Update Vendor">
	</form>
</body>
</html>