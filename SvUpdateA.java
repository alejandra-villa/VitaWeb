package co.edu.sena.vitaweb.servlets;

import co.edu.sena.vitaweb.logica.Afiliado;
import co.edu.sena.vitaweb.logica.Controlador;
import java.io.IOException;
import java.sql.Date;
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
@WebServlet(name = "SvUpdateA", urlPatterns = {"/SvUpdateA"})
public class SvUpdateA extends HttpServlet {
Controlador control = new Controlador();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idModificar = Integer.parseInt(request.getParameter("idModify"));
        Afiliado afiliado = control.traerUsuario(idModificar);
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("modificarAfiliado", afiliado);
        
        response.sendRedirect("modificarAfiliado.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int documento = Integer.parseInt(request.getParameter("documento"));
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        Date fechaNac = Date.valueOf(request.getParameter("fechaNac"));
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String direccion = request.getParameter("direccion");
        int beneficiarios = Integer.parseInt(request.getParameter("beneficiarios"));
        
        Afiliado afiliado = (Afiliado) request.getSession().getAttribute("modificarAfiliado");
        afiliado.setDocumento(documento);
        afiliado.setNombres(nombres);
        afiliado.setApellidos(apellidos);
        afiliado.setFechaNac(fechaNac);
        afiliado.setTelefono(telefono);
        afiliado.setCorreo(correo);
        afiliado.setDireccion(direccion);
        afiliado.setBeneficiarios(beneficiarios);
        
        control.modificarAfiliado(afiliado);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
