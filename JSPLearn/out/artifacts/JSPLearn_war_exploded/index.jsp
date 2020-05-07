<%@ page import="java.util.Scanner" %><%--
  Created by IntelliJ IDEA.
  User: rachitjain
  Date: 28/04/20
  Time: 12:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" errorPage="WEB-INF/error.jsp" %>
<%@ include file="WEB-INF/header.jsp"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%!
    int v = 3;
  %>
  <h1>Hello World: </h1>
  <%
    out.println(5+4);
//    try {
//
//      int k = 9 / 0;
//    }
//    catch (Exception e)
//    {
//      out.println("Error" + e.getMessage());
//    }
    int l = 9/0;
  %>
  MY favourite number: <%=v%>
  </body>
</html>
