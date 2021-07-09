<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Data</title>
</head>
<body>
<h2>Information of ${customer.emailid}</h2>
<h2 style="border:2px solid green; color:black;">${customer.firstname}</h2>
<h2 style="border:2px solid yellow; color: red;">${customer.lastname}</h2>
<h2 style="border:2px solid red; color: blue;">${customer.emailid}</h2>
</body>
</html>