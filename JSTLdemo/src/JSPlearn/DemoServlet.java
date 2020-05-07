package JSPlearn;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/DemoServlet")
public class DemoServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<Student> studs = Arrays.asList(
                new Student(1,"Rachit"),
                new Student(2, "Aarti"),
                new Student(3,"Navin"));
        request.setAttribute("students",studs);
        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.forward(request, response);
    }
}
