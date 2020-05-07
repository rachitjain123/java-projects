<%--
  Created by IntelliJ IDEA.
  User: rachitjain
  Date: 28/04/20
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
  <head>
    <title>New Title</title>
  </head>
  <body>
  <jsp:useBean id="students" scope="request" type="java.util.List"/>
  <c:forEach items="${students}" var="s" > ${s.name} <br> </c:forEach>
  <c:out value="Hello World " > </c:out>

  <c:set var="str" value="rjrks"/>
  Length: ${fn:length(str)}
  <br>
  <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/COLLEGE" user="root" password="rachit" />
  <sql:query var="rs" dataSource="${db}" > select * from COURSE </sql:query>
  <br>
  <c:forEach items="${rs.rows}" var="COURSE" >
    <c:out value="${COURSE.CName}" ></c:out>
    <br>
  </c:forEach>
  </body>
</html>
