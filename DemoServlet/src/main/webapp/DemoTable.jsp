<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import=" com.chainsys.model.Demo" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Table</title>
<style>
table{
	border-collapse: collapse;
    width: 100%;
   
}
.table-container {
            display: flex;
            justify-content: center;
        }


body{
    height: fit-content;
    width: fit-content;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    background: grey;
    background-repeat: no-repeat;
    background-size: cover;
    position: relative;
    color: white;
} 

th, td {
   text-align: left;
  padding: 8px;
  border-bottom: 1px solid #ddd;
}

.search{
position: relative;
	margin-top: 10%
}

.flex-column{
	position: relative;
	margin-right: 10%
}
</style>
</head>
<body>
    <form action= "SearchServlet" method= "post">
	<label>Search: <input type= "text" name= "name"></label>
	</form><br>
	<a href="LogoutServlet"><button>LogOut</button></a>
	<h2>Demo Table</h2>
	<table border="1" class="center">
	<thead>
		<tr>
			<th>Name</th>
			<th>Email-ID</th>
			<th>Phone number</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		
	</thead>
	<% ArrayList<Demo> list = (ArrayList<Demo>)request.getAttribute("list");
	for(Demo object:list){
	%>
	
	<tr>
		<td><%= object.getName() %></td>
		<td><%= object.getEmailID() %></td>
		<td><%= object.getPhoneNumber() %></td>
		
		<td><input type="hidden" name = "name" value="<%= object.getName() %>"><a href="UpdatePhoneNumber.jsp?editName=<%= object.getName() %>"><button class = "flex-column">Update</button></a></td>
		
		<td>
		<form action="DemoServlet" method="post">
  		<input type="hidden" name="deleteName" value="<%= object.getName()%>">
  		<input type="submit" name="delete" value="Delete">
  		</form>
  		</td>
	</tr>
				
	<%
	}
	  %>
	</table>
		<!-- <a href="Search.jsp"><button>Search</button></a> -->
</body>
</html>