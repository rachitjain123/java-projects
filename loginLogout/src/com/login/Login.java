package com.login;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        if(uname.equals("rachit") && pass.equals("rjrks")){
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("welcome.jsp");
        }
        else{
            response.sendRedirect("login.jsp");
        }
    }
}
