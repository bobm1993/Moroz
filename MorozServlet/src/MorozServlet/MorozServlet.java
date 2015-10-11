package MorozServlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by bob on 06.10.2015.
 */
public class MorozServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        String username = req.getParameter("username");
        String password = req.getParameter("pass");
        if (username.equals("Admin") && password.equals("0000")){
            session.setAttribute("Message", "You are successful logged in");
        }
        else {
            session.setAttribute("Message", "Log in was failed");
        }
        req.getRequestDispatcher("great.jsp").forward(req, resp);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

