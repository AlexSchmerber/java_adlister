import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

@WebServlet(name = "LoginServlet", urlPatterns = "/login/request")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession();
            if (session.getAttribute("user") != null && (Boolean) session.getAttribute("user")) {
                response.sendRedirect("/profile.jsp");
            } else{
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }

        } catch(Exception e){
            System.out.println("exception occured");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            String username = request.getParameter("name");
            String password = request.getParameter("password");
            boolean validAttempt = "admin".equals(username) && "password".equalsIgnoreCase(password);

            HttpSession session = request.getSession();

            if(validAttempt){
                session.setAttribute("user", true);
                session.setAttribute("username", username);
                response.sendRedirect("/profile.jsp");
            } else {
                response.sendRedirect("/login.jsp");
            }

        } catch(Exception e){
            System.out.println("exception occured");
        }
    }
}


