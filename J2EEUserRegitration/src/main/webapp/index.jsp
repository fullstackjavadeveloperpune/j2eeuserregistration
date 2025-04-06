<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body style="background-color: orange;">

<form action="UserController" method="POST" style="text-align: center;">

User Id<input type="text" name="userid"><br>
User Name<input type="text" name="username"><br>
User Address<input type="text" name="useraddress"><br>
User State<br>
<select name="userstate">
<option value="MH">MH</option>
<option value="NCR">NCR</option>
<option value="KA">KA</option>
</select><br>

User Gender<br>
Male<input type="radio" name="usergender" value="Male">
Female<input type="radio" name="usergender" value="Female"><br>
User DOB<input type="date" name="userdob"><br>
User Contact Number<input type="text" name="usercontactnumber"><br>
User Email<input type="email" name="useremailid"><br>
User Password<input type="password" name="userpassword"><br>

<input type="submit" value="Register">

</form>
</body>
</html>