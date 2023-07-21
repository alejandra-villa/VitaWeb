<%-- 
    Document   : index
    Created on : 18/07/2023, 04:10:14 PM
    Author     : avill
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/index.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vita Seguros</title>
    </head>
    <body>
        <header>
            <img src="img/banner.png">
        </header>
        <div class="cuerpo">
            <section>                  
                <form action="SvCreateReadA" method="POST">
                    <h1>Registro</h1> 
                    <p><label>Documento: </label><input type="number" name="documento"></p>
                    <p><label>Nombres: </label><input type="text" name="nombres"></p>
                    <p><label>Apellidos: </label><input type="text" name="apellidos"></p>
                    <p><label>Fecha de nacimiento: </label><input type="date" name="fechaNac"></p>
                    <p><label>Teléfono: </label><input type="text" name="telefono"></p>
                    <p><label>Correo: </label><input type="text" name="correo"></p>
                    <p><label>Dirección: </label><input type="text" name="direccion"></p>
                    <p><label>Beneficiarios: </label><input type="number" name="beneficiarios"></p>
                    <button type="submit">Registrar</button>
                </form>
              
                <form action="SvCreateReadA" method="GET">
                    <h1>Consulta</h1>
                    <p>Ingresar al siguiente botón para acceder a los afiliados de Vita Seguros. </p>
                    <button type="submit">Consultar</button>          
                </form>
             
                <form action="SvDeleteA" method="POST">
                    <h1>Anulación</h1>
                    <p>Ingresar el ID del usuario para anular de la base de datos. </p>
                    <p><label>ID: </label><input type="text" name="id"></p>
                    <button type="submit">Eliminar</button>          
                </form>
                
                <form action="SvUpdateA" method="GET">
                    <h1>Modificación</h1>
                    <p>Ingresar el ID del usuario para actualizar información. </p>
                    <p><label>ID: </label><input type="text" name="idModify"></p>
                    <button type="submit">Modificar</button>          
                </form>
            </section>
            <footer>
                <h4>VS</h4>
            </footer>
        </div>
    </body>
</html>
