import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(name = "ViewColor", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            String color = request.getParameter("color");
            request.setAttribute( "color", color);
            request.getRequestDispatcher("/viewcolor.jsp").forward(request, response);
        } catch(Exception e){
            System.out.println("exception occured");
        }
    }
}

