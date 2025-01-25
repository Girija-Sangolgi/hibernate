<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>user</title>
    <style>
    table,th,td{
      font-family:arial,sans-serif;
            border: solid black;
       width=100%;
      }
      </style>
</head>
<body>
<form action="users">
Enter Slno:<input type="number" name="id"><br>
<input class="button" type="submit">
</form>

<table border:"solid,black">
<caption><b>User Details</b></caption>
<tr>
<th>User Id</th>
<th>User Name</th>
<th>Phone Number</th>
<th>Email</th>
<th>Password</th>
<th>Confirm Password</th>
</tr>
<tr>
<td>${ user.getId() }</td>
<td>${ user.getUserName() }</td>
<td>${ user.getPhoneNumber() }</td>
<td>${ user.getEmail() }</td>
<td>${ user.getPassword() }</td>
<td>${ user.getConfirmPassword() }</td>
</tr>
</table>
</body>
</html>