<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee Data</title>
</head>
<body>
	<h1>Add Employee Data</h1>
	<form action="save" method="post">
		<label for="name">Name:</label> <input type="text" id="name"
			name="name" required><br> <br> <label for="city">City:</label>
		<input type="text" id="city" name="city" required><br> <br>
		<label for="state">State:</label> <input type="text" id="state"
			name="state" required><br> <br> <input
			type="submit" value="Add Employee">
	</form>
</body>
</html>
