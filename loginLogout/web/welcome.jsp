<%--
  Created by IntelliJ IDEA.
  User: rachitjain
  Date: 29/04/20
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(session.getAttribute("username") == null){
        response.sendRedirect("login.jsp");
    }
%>
Welcome ${username}
<form action="Logout" > </form>
<input type="submit" value="logout">
<a href="videos.jsp" >Videos</a>

</body>
</html>
