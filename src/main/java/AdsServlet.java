import models.Ad;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

@WebServlet(name="AdsServlet", urlPatterns = {"", "/ads"})
public class AdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) {
        try {
            List<Ad> ads = DaoFactory.getAdsDao().all();
            System.out.println(ads);
            request.setAttribute("ads", DaoFactory.getAdsDao().all());
            request.getRequestDispatcher("/ads/index.jsp").forward(request, resp);
        } catch (ServletException | IOException e) {
            System.out.println("error in AdsServlet: " + e.getMessage());
        }
    }
}