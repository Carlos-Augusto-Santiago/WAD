package classes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CuentaCookie extends HttpServlet {

    // Manipula las posibles peticiones enviadas por el cliente
    // Utilizando el atributo method=get o method=post

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Obtenemos el valor actual de la cookie CuentaCookie
            // iterando entre las cookies que se reciban
            String nCuenta = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    if (cookies[i].getName().equals("Cuenta.cookie")) {
                        nCuenta = cookies[i].getValue();
                        break;
                    }
                }
            }

            // Incrementa el contador para esta pagina
            // El valore es guardado en la cookie con el nombre "Cuenta.cookie"

            Integer conteo = null;
            if (nCuenta == null) {
                conteo = 1;
            } else {
                conteo = Integer.parseInt(nCuenta) + 1;
            }
            Cookie newCookie = new Cookie("Cuenta.cookie", conteo.toString());
            response.addCookie(newCookie);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CuentaCookie</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Has visitado esta página " + conteo.toString()
                    + ((conteo.intValue() == 1) ? " vez" : "veces.") + "</h1>");
            ;
            out.println("</body>");
            out.println("</html>");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

