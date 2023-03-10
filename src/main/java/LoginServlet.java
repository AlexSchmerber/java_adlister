import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "LoginServlet", urlPatterns = "/login/request")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } catch(Exception e){
            System.out.println("exception occured");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            if("admin".equals(name) && "password".equals(password)){
                response.sendRedirect("/profile.jsp");
            } else if (name != null || password != null) {
                response.sendRedirect("/login.jsp");
            }
        } catch(Exception e){
            System.out.println("exception occured");
        }
    }
}


