<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="Login.css" rel="stylesheet">
</head>
<body>
<form action="LoginServlet" method="post">
    <h3>LogIn</h3>
    <label for="">Email or Phone Number: </label>
    <input type="text" name="email" placeholder="Email or Password" required/>
    <label>Password: </label>
    <input type="password" name="password" placeholder="Password" required/>
   	<button>LogIn</button>
   	
    </form>
</body>
</html>