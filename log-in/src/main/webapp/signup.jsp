<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<html lang="en">
<style>
.submit{
     background-color:LightCyan;
     color: alice blue;
     font-size: 20px;
     border-radius: 4px;
     border:1px solid green;
     margin: 50px 400px;
     padding: 10px;
     width: 40%;
     position:absolute;
     cursor: pointer;
}

.button{
         background-color:Blue;
         border: none;
         color: white;
         padding: 10px 10px;
         text-align: center;
         text-decoration: none;
         display: inline-block;
         font-size: 16px;
}
</style>

<body bg-color ="black" align ="center">
<h2>Login Form</h2>
<form action="user" method="post">
<div class="submit">
UserName:<input type="text" name="userName"><br>
<br>
PhoneNumber:<input type="text" name="phoneNumber"><br>
<br>
Email:<input type="email" name="email"><br>
<br>
Password:<input type ="password" name="password"><br>
<br>
Confirm Password:<input type="password" name="confirmPassword"><br>
<br>
<input class ="button" type="submit" value="Login">
</div>
</form>
</body>
</html>
