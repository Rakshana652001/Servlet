<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<form>
		<lable>Employee Id:</lable>
		<input type="number" name="id" max-length="4" required/>
		<lable>Employee Name: </lable>
		<input type="text" name="name" required/>
		<label>Date Of Birth:</label>
		<input type="date" name="dob" required/>
		<lable>Phone Number: </lable>
		<input type="tel" name="phoneNumber" max-length="10" required/>
		<lable>Email ID: </lable>
		<input type="email" name="email" required/>
		<lable>City: </lable>
		<input type="text" name="city" required/>
		<lable>Pin Code:</lable>
		<input type="text" name="pincode" max-lenghth ="6" required/>
		<lable>State: </lable>
		<input type="text" name="state" required/>
		<lable>Nationality: </lable>
		<input type="text" name="nationality" required/>
		<lable></lable>
		
	</form>

</body>
</html>