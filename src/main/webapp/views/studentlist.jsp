<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>Student List</title>
</head>
<body>

	<div class='container'>
		<h1>List of Student</h1>
		<form class="form-inline">

			<!-- Add a button -->
			<a href="showFormForAdd" class="btn btn-primary btn-sm mb-3">
				Enroll </a> <a href="logout" class="btn btn-danger btn-sm mb-3 mx-auto"
				onclick="if (!(confirm('Are you sure you want to logout?'))) return false">
				Log Out </a>
		</form>

		<table class="table table-bordered table-striped">
			<tr>
				<th>Student Name</th>
				<th>Department</th>
				<th>Country</th>
				<th>Action</th>

			</tr>
			<c:forEach items="${Students }" var="Student">
				<tr>
					<td>${Student.name }</td>
					<td>${Student.department }</td>
					<td>${Student.country }</td>
					<td>
						<!-- Add "update" button/link --> <a
						href="showFormForUpdate?id=${Student.id }"
						class="btn btn-info btn-sm"> Update </a> <!-- Add "delete" button/link -->
						<a href="delete?id=${Student.id }" class="btn btn-danger btn-sm"
						onclick="if (!(confirm('Are you sure you want to delete this Student?'))) return false">
							Delete </a>
					</td>
				</tr>

			</c:forEach>
		</table>
	</div>

</body>
</html>