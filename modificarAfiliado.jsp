<%-- 
    Document   : modificarAfiliado
    Created on : 19/07/2023, 08:21:51 PM
    Author     : avill
--%>

<%@page import="co.edu.sena.vitaweb.logica.Afiliado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/modificar.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificación</title>
    </head>
    <body>
        <header>
            <img src="img/banner.png">
        </header>
        <div class="cuerpo">
            <% Afiliado afiliado = (Afiliado) request.getSession().getAttribute("modificarAfiliado");%>
            <h1>Modificar afiliado</h1>
            <form action="SvUpdateA" method="POST">
                <p><label> Documento: </label><input type="text" name="documento" value="<%=afiliado.getDocumento()%>"></p>
                <p><label> Nombres: </label><input type="text" name="nombres" value="<%=afiliado.getNombres()%>"></p>
                <p><label> Apellidos: </label><input type="text" name="apellidos" value="<%=afiliado.getApellidos()%>"></p>
                <p><label> Fecha de nacimiento: </label><input type="date" name="fechaNac" value="<%=afiliado.getFechaNac()%>"></p>
                <p><label> Teléfono: </label><input type="text" name="telefono" value="<%=afiliado.getTelefono()%>"></p>
                <p><label> Correo: </label><input type="text" name="correo" value="<%=afiliado.getCorreo()%>"></p>
                <p><label> Dirección: </label><input type="text" name="direccion" value="<%=afiliado.getDireccion()%>"></p>
                <p><label> Beneficiarios: </label><input type="text" name="beneficiarios" value="<%=afiliado.getBeneficiarios()%>"></p>                      
                <button type="submit">Guardar</button><br>
            </form>    
        </div>
        <footer>
                <h4>VS</h4>
        </footer>
    </body>
</html>
