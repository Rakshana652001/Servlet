<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="Search.css" rel="stylesheet">
</head>
<body>
<form action="SearchServlet" method="get">
	<label>Enter Name: <input type= "text" name= "name"></label>
	<button class="btn btn-outline-dark">Search</button>
</form>
</body>
</html>