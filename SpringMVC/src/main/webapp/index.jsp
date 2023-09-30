<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World JSP</title>
</head>
<body>
	<h2>Hello World!</h2>
	<a href="create">To add Employee Data</a>
	<a href="read">To display All data</a>

	<form action="readone" method="get">
		<table>
			<tr>
				<td><label for="id">Enter Employee ID:</label></td>
				<td><input type="number" id="id" name="id"></td>
				<td><input type="submit" value="Display Employee"></td>
			</tr>
		</table>
	</form>
	
	 <form action="update" method="post">
        <table>
            <tr>
                <td><label for="id">Enter Employee ID:</label></td>
                <td><input type="number" id="id" name="id"></td>
            </tr>
            <tr>
                <td><label for="city">Enter New City:</label></td>
                <td><input type="text" id="city" name="city"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update Employee City"></td>
            </tr>
        </table>
    </form>
</body>
</html>
