<%-- 
    Document   : consultarAfiliado
    Created on : 19/07/2023, 03:59:50 PM
    Author     : avill
--%>

<%@page import="co.edu.sena.vitaweb.logica.Afiliado"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/consulta.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultas</title>
    </head>
    <body>
        <header>
            <img src="img/banner.png">
        </header>
        <div class="cuerpo">
            <h1>Lista de afiliados</h1>
            <section>
                <%
                    List<Afiliado> listaAfiliados = (List) request.getSession().getAttribute("listaAfiliados");
                    int cont = 1;
                    for (Afiliado afiliado : listaAfiliados) {
                %>

                <p><b>ID: <%=cont%></b></p>
                <p>Documento: <%=afiliado.getDocumento()%></p>
                <p>Nombres: <%=afiliado.getNombres()%></p>
                <p>Apellidos: <%=afiliado.getApellidos()%></p>
                <p>Fecha de nacimiento: <%=afiliado.getFechaNac()%></p>
                <p>Teléfono: <%=afiliado.getTelefono()%></p>
                <p>Correo: <%=afiliado.getCorreo()%></p>
                <p>Dirección: <%=afiliado.getDireccion()%></p>
                <p>Beneficiarios: <%=afiliado.getBeneficiarios()%></p><br>
                <% cont = cont + 1;%>
                <% } %>
            </section>
        </div>
        <footer>
                <h4>VS</h4>
        </footer>
    </body>
</html>
