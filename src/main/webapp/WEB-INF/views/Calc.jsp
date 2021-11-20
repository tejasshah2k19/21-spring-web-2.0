<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<h2>Calc</h2>

	<form action="addition" method="post">
		No.1 <input type="text" name="n1"/>
		<br>
		No.2 <input type="text" name="n2"/>
		<bR>
		
		Add <input type="radio" name="choice" value="add">
		Sub <input type="radio" name="choice" value="sub" >
		Mul <input type="radio" name="choice" value="mul" >
		
		
		<br>
		<input type="submit" value="Addition"/>
		
	
	</form>
</body>
</html>