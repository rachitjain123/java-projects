<%--
  Created by IntelliJ IDEA.
  User: rachitjain
  Date: 28/04/20
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

101 <br>
RJ <br>
88 <br>
<%
    try {
        Class.forName("com.mysql.jdbc.driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    String url = "jdbc:mysql://localhost:3306/rachit";
        String username = "root";
        String password = "rachit";
    Connection con = null;
    try {
        con = DriverManager.getConnection(url,username,password);
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    String sql = "select *from student";
    Statement st = null;
    try {
        assert con != null;
        st = con.createStatement();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    ResultSet rs = null;
    try {
        assert st != null;
        rs = st.executeQuery(sql);
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }

    assert rs != null;%>
Rollnumber: <%= rs.getString(1)%>
</body>
</html>
