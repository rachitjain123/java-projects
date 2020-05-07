import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int k = Integer.parseInt(request.getParameter("k"));

        // accepting cookies
        int k = 0;
        Cookie[] cookies = request.getCookies();
        for(Cookie c:cookies)
        {
            if(c.getName().equals("k"))
                k = Integer.parseInt(c.getValue());
        }
//        HttpSession session = request.getSession();
//        int k = (int) session.getAttribute("k");
        k = k * k;
        PrintWriter out = response.getWriter();
        out.println("Result is: " + k);
//        System.out.println("sq called");
    }
}
