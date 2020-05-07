<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> Hello World</title>
</head>
<body>
<form action="addAlien">
    <input  type="text" name="aid"> <br>
    <input type="text" name="aname"> <br>
    <input type="text" name="tech"> <br>
    <input type="submit">
</form>

<h1>Get alien form</h1>
<form action="getAlien">
    <input  type="text" name="aid"> <br>
    <input type="submit">
</form>
</body>
</html>
