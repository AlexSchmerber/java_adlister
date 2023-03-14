import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

@WebServlet(name = "ViewProfile", urlPatterns = "/viewprofile")
public class ViewProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession();
            if (session.getAttribute("user") == null || !(Boolean) session.getAttribute("user")) {
                response.sendRedirect("/login.jsp");
            } else{
                response.sendRedirect("/profile.jsp");
            }
        } catch(Exception e){
            System.out.println("exception occured");
        }
    }
}


