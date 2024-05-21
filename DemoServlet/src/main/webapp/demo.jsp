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
		Enter Name:         <input type="text" name="name"><br><br>
		Enter Phone Number  <input type="tel" name = "phoneNumber"><br><br>
		Enter EmailId:      <input type="email" name="emailID"><br><br>
		<input type="submit" name="click">
	</form>
</body>
</html>