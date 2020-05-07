<%--
  Created by IntelliJ IDEA.
  User: rachitjain
  Date: 28/04/20
  Time: 12:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body bgcolor="#00ffff">
<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<%!
  int value = 1;
%>
<%
  int i = Integer.parseInt(request.getParameter("num1"));
  int j = Integer.parseInt(request.getParameter("num2"));
  int k = i + j;
  <%="Output: " + k%>
<%--  out.println("Output: " + k);--%>
%>
</body>
</html>
