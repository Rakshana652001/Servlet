<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="demo.css" rel="stylesheet">
</head>
<body>
	<form action="DemoServlet" method="get">
		<h4>Add User</h4>
		<label>Enter Name:         <input type="text" name="name" class="employeeId" required/></label><br><br>
		<label>Enter EmailId:      <input type="email" name="emailID" required/></label><br><br>
		<label>Enter Phone Number: <input type="tel" name = "phoneNumber" required/></label><br><br>
		<button class="btn btn-outline-dark">Submit</button>
	</form>
</body>
</html>