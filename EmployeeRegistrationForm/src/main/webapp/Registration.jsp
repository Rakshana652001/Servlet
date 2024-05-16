
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="Registration.css" rel="stylesheet">
</head>
<body>
	<form action="RegistrationForm" method="get">
	
		<label><span>Employee Id:</span></label>
		<input type="text" name="id" class="employeeId" maxlength="4" required/><br><br>
		<label><span>Employee Name:</span></label>
		<input type="text" name="name" required/><br><br>
		<label>Date Of Birth:</label>
		<input type="date" name="dob" required/><br><br>
		<label>Gender: </label>
		<label>M <input type="radio" name="gender" value="Male" required/></label>
		<label>F <input type="radio" name="gender" value="Female" required/></label>
		<label>Other <input type="radio" name="gender" value="Other" required/></label><br><br>
		<label>Phone Number: </label>
		<input type="tel" name="phoneNumber" maxlength="10" required/><br><br>
		<label>Email ID: </label>
		<input type="email" name="email" required/><br><br>
		<label>Create Password: </label>
		<input type="password" name="password" required/><br><br>
		<label>Re-Enter Password: </label>
		<input type="password" name="rePassword" required/><br><br>
		<label>City: </label>
		<input type="text" name="city" required/><br><br>
		<label>Pin Code:</label>
		<input type="text" name="pincode" maxlength="6" required/><br><br>
		<label>State: </label>
		<input type="text" name="state" required/><br><br>
		<label>Nationality: </label>
		<input type="text" name="nationality" required/><br><br>
		<button class="btn btn-outline-dark">Submit</button>
	</form>
	<a href="RegistrationFormTable">Registration Table</a>
</body>
</html>