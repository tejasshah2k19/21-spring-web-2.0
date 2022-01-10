<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<form action="uploadprofile2" method="post" enctype="multipart/form-data">
		
		FirstName : <input type="text" name="firstName"/><br>  
		Email : <input type="text" name="email"/><br>
		Password :  <input type="password" name="password"/><br> 
		
		Profile : <input type="file" name="profile" /> <input type="submit"
			value="Upload Profile" />
	</form>

</body>
</html>