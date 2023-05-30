<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>

<style type="text/css">
table {
	border: 2px solid black;
	padding:5px;
}


td {
	border: 1px solid black;
	padding: 5px;
}




</style>

</head>
<body>
	<form id="form" action="index.htm" method="post">
		<table>
			<tr>
				<th colspan="2"><b>Registration Form</b></th>

			</tr>
			<tr>
				<td>Enter Name</td>
				<td><input type="text" id="name" name="name"></td>
			</tr>

			<tr>
				<td>Enter Age</td>
				<td><input type="text" id="age" name="age"></td>
			</tr>

			<tr>
				<td>Enter Mobile</td>
				<td><input type="text" id="mobile" name="mobile"></td>
			</tr>

			<tr>
				<td>Enter Address</td>
				<td><input type="text" id="address" name="address"></td>
			</tr>

			<tr>
				<td>
					<!--<button type="submit">Submit</button> --> <input type="submit"
					value="Submit now" />

				</td>
				<td>
					<!--<button type="reset"">Reset</button> --> <input type="reset"
					value="Clear form" />
				</td>
			</tr>



		</table>
	</form>
</body>
</html>