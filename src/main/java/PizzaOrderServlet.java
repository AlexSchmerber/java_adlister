import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizzatime")
public class PizzaOrderServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        ArrayList<String> pizza = new ArrayList<>();
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String pep = request.getParameter("pep");
        String mush = request.getParameter("mush");
        String jap = request.getParameter("jap");
        pizza.add(crust);
        pizza.add(sauce);
        pizza.add(size);
        pizza.add(pep);
        pizza.add(mush);
        pizza.add(jap);

        for (String piece : pizza) {
            if(piece != null){
                System.out.println(piece);
            }
        }

        try {
                response.sendRedirect("pizza-order.jsp");
            } catch(IOException e){
                System.out.println("exception occured");
            }
    }

}
