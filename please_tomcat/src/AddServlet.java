import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends javax.servlet.http.HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k = i + j;
//        req.setAttribute("k",k);
//        // Request Dispatcher
//        RequestDispatcher rd = req.getRequestDispatcher("/sq");
//        rd.forward(req, resp);

        // Session Management:

        // Url Redirecting

        // Using session
//        HttpSession session = req.getSession();
//        session.setAttribute("k", k);

        // Using Cookies
        Cookie cookie = new Cookie("k",k + "");
        resp.addCookie(cookie);
        resp.sendRedirect("sq" );

    }
}

