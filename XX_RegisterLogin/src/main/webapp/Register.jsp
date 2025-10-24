<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

	<form action="Register" method="post">

		Name: <input type="text" name="name1" placeholder="enter ur name" /> <br/> <br/>
		email: <input type="text" name="email1" placeholder="enter ur email" /> <br/> <br/>
		password: <input type="password" name="pwd1" placeholder="enter ur pwd" /> <br/> <br/>
		Gender: <input type="radio" name="gender1" value="Male"/> Male <input type ="radio" name = "gender1"cvalue="Female" /> Female <br/> <br/>
		City: <select name="city1">
					<option>select city</option>
					<option>pune</option>
					<option>mumbai</option>
					<option>banglore</option>
					<option>chennai</option> </br></br>
					
		<input type="submit" value="Register"/>
		
		</select>
		

	</form>




</body>
</html>