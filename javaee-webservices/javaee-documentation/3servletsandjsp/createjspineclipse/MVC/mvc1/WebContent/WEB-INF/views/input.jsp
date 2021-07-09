<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Page</title>
</head>
<body>
<h2>Input Form : </h2>
<form action="CustomerController" method="post">
<label>firstname</label><input type="text" name="firstname" id="firstname"/><br/>
<label>lastname</label><input type="text" name="lastname" id="lastname"/><br/>
<label>emailid</label><input type="text" name="emailid" id="emailid"/><br/>
<label>Submit Data</label><input type="submit" value="send"/>
</form>
</body>
</html>