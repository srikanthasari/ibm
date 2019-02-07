<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<center>
			<h2 style="color: blue">IBM EMPLOYEE</h2>
			<h5 style="color:red">Hyderabad Hitech City</h5>
			</center>
	</div>
	<div>
	<center>
	<form action="http://localhost:8000/ibm/sc" method="post">
		<table>
			<tr>
				<th>NAME</th>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<th>FATHER NAME</th>
				<td><input type="text" name="fname"></td>
			</tr>

			<tr>
				<th>MOTHER NAME</th>
				<td><input type="text" name="mname"></td>
			</tr>

			<tr>
				<th>GENDER</th>
				<td><input type="radio" value="M" name="gender">M<input
					type="radio" value="F" name="gender">F</td>
			</tr>

			<tr>
				<th>DOB</th>
				<td><input type="date" name="dob"/></td>
			</tr>

			<tr>
				<th>STATE</th>
				<td><select name="state">
						<option value="ts">TS</option>
						<option value="tn">TN</option>
						<option value="ap">AP</option>
						<option value="kn">KN</option>
				</select></td>
			</tr>

			<tr>
				<th>DISTRIC</th>
				<td><select name="distic">
						<option value="Karimnagar">Karimnagar</option>
						<option value="warangal">warangal</option>
						<option value="guntur">guntur</option>
						<option value="jpnagar">jpnagar</option>
						<option value="chennai">chennai</option>
				</select></td>
			</tr>

			<tr>
				<th>EMAIL</th>
				<td><input type="email" name="gmail"/></td>
			</tr>

			<tr>
				<th>PHONE NUMBER</th>
				<td><input type="text" name="pnumber"></td>
			</tr>
			<tr>
				<th>GENDER</th>
				<td><input type="radio" value="married" name="single">Married<input
					type="radio" value="unmarried" name="single">UnMarried</td>
			</tr>
			
			<tr>
				
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
		</form>
		</center>
	</div>
</body>
</html>