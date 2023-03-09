import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "CorrectGuessServlet", urlPatterns = "/correctguess")
public class CorrectGuessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            String guess = request.getParameter("guess");
            request.setAttribute( "guess", guess);
            request.getRequestDispatcher("/outcome.jsp").forward(request, response);
        } catch(Exception e){
            System.out.println("exception occured");
        }
    }
}

