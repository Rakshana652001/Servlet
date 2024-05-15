<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>
	<form action="DemoServlet" method="post">
		Enter EmployeeID:   <input type="number" name="id" pattern="//d{4}"><br><br>
		Enter Name:         <input type="text" name="name"><br><br>
		Enter Phone Number: <input type="number" name="number"><br><br>
		Date of Birth:      <input type="date" name="date">
		Enter Department:   <input type="text" name="department"><br><br>
		<input type="submit" name="click">
	</form>
</body>
</html>