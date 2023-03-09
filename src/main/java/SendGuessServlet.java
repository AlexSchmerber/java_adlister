import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "SendGuessServlet", urlPatterns = "/SendGuessServlet")
public class SendGuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/guess.jsp").forward(request, response);
        } catch(Exception e){
            System.out.println("exception occured");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            String guess = request.getParameter("guess");
            if("4".equals(guess)){
                response.sendRedirect("/correctguess?guess=correct");
            } else {
                response.sendRedirect("/incorrectguess?guess=incorrect");
            }
        } catch(Exception e){
            System.out.println("exception occured");
        }
    }
}

