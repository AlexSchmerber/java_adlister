import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

@WebServlet(name = "ViewProfile", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession();
            if(session.getAttribute("login") == null){
                response.sendRedirect("/login");
            } else if (session.getAttribute("user") == null && !(boolean) session.getAttribute("login")) {
                response.sendRedirect("/login");
            } else{
                request.getRequestDispatcher("/profile.jsp").forward(request, response);
            }
        } catch(Exception e){
            throw new RuntimeException("Exception Occured", e);
        }
    }
}


