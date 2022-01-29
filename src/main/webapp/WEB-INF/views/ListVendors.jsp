<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">


<link
	href="http://cdn.datatables.net/1.11.4/css/jquery.dataTables.min.css"
	rel="stylesheet">



<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>



<script
	src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"></script>




</head>
<body>
	<div class="container">




		<h2>List Vendors</h2>

		<div class="row">
			<div class="col-md-6">
	<a href="newvendor">Add Vendor</a>
	<br>
				<table id="vendors" class="table table-bordered table-striped">
					<thead>
						<tr>
							<td>VendorId</td>
							<td>Name</td>
							<td>Email</td>
							<td>Password</td>
							<td>Action</td>
						</tr>
					</thead>


					<tbody>
						<c:forEach items="${vendors}" var="v">

							<tr>
								<td>${v.vendorId }</td>
								<td>${v.name }</td>
								<td>${v.email }</td>
								<td>${v.password }</td>
								<td><a href="editvendor?vendorId=${v.vendorId}">Edit</a> |
									<a href="deletevendor?vendorId=${v.vendorId}">Delete</a></td>
							</tr>

						</c:forEach>
					</tbody>
				</table>


			</div>
		</div>

	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#vendors').DataTable();
		});
	</script>
</body>
</html>