
package co.edu.sena.vitaweb.servlets;

import co.edu.sena.vitaweb.logica.Afiliado;
import co.edu.sena.vitaweb.logica.Controlador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author avill
 */
@WebServlet(name = "SvDeleteA", urlPatterns = {"/SvDeleteA"})
public class SvDeleteA extends HttpServlet {
Controlador control = new Controlador();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idEliminar = Integer.parseInt(request.getParameter("id"));
        control.eliminarUsuario(idEliminar);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
