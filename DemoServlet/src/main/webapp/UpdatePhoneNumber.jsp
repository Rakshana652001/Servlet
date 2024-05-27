<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Phone Number</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="UpdatePhoneNumber.css" rel="stylesheet">
<style>
lable{
margin-top:10%
}
</style>
</head>
<body>
	<form action="NumberUpdateServlet" method="post" >
		<label>Enter emailID: <input type="email" name="emailID" placeholder="raksha@gmail.com" required/></label><br><br>
		<label>Enter Phone Number: <input type="tel" name = "phoneNumber" placeholder="7339263883" required/></label><br><br>
		<input type="hidden" name="name" value="<%=request.getParameter("editName") %>">
		<button class="btn btn-outline-dark">Submit</button>
	</form>
</body>
</html>


