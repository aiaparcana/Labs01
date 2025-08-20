import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "miServlet", urlPatterns = {"/miServlet"})
public class miServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            // 1. Recoger valores del formulario
            int n1 = Integer.parseInt(request.getParameter("variable1"));
            int n2 = Integer.parseInt(request.getParameter("variable2"));
            int n3 = Integer.parseInt(request.getParameter("variable3"));
            int n4 = Integer.parseInt(request.getParameter("variable4"));

            
            // 2. Saber qué botón se presionó
            String accion = request.getParameter("accion");
            String resultado = "";
            
            // 3. Calcular según la acción
            if ("Mayor".equals(accion)) {
                int mayor = Math.max(Math.max(n1, n2), Math.max(n3, n4));
                resultado = "El número mayor es: " + mayor;
            } else if ("Menor".equals(accion)) {
                int menor = Math.min(Math.min(n1, n2), Math.min(n3, n4));
                resultado = "El número menor es: " + menor;
            } else if ("Promedio".equals(accion)) {
                int promedio = (n1 + n2 + n3 + n4) / 4;
                resultado = "El promedio es: " + promedio;
            }
            
            // 4. Pasar el resultado a la JSP
            request.setAttribute("resultado", resultado);
            request.getRequestDispatcher("mipagina.jsp").forward(request, response);
            
        } catch (NumberFormatException e) {
            // Manejo de error si el usuario mete texto en vez de números
            request.setAttribute("resultado", "❌ Error: Ingrese solo números válidos.");
            request.getRequestDispatcher("mipagina.jsp").forward(request, response);
        }
    }
}
