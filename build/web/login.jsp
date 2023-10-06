<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="icon" href="Imagenes/hojita.png"/>
        <title>EcoBeyond</title>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body background="../Imagenes/nat.png">
        <div id="cuadro">
            <form action="SERVLOGIN" method="POST">
            <img src="Imagenes/NuestroLogo.png" height="200px" width="350px" title="logo"/>
            <br/>
            <p id="titulo">INICIAR SESIÓN</p>
            <hr>
            <br/><br/>
            <input class="entrada" type="text" name = "txtusuario" id="Nombre" placeholder="Ingrese su nombre de usuario">
            <br/><br/>
            <input class="entrada" type="password" name = "txtcontra" id="Contraseña" placeholder="Ingrese su contraseña">
            <br/><br/>
            <input type="submit" name="btnIniciar" value="Iniciar sesión" id="boton"/>
            <br/><br/>
            <a href="registroEcoInfluencer.jsp"><input  type="button" value="Crear una cuenta" class="btn btn-primary" id="boton2"/></a>
            </form>  
        </div>

                <div id="contenedor">
            <div id="referencias">
                <a href="index.jsp">Volver al inicio</a>
            </div>
        </div>
        <% 
        HttpSession sesion = request.getSession();
        int cargo = 0;
        if(request.getAttribute("cargo") != null){
            cargo = (Integer) request.getAttribute("cargo");
            if(cargo==1){
                sesion.setAttribute("nombre", request.getAttribute("nombre"));
                sesion.setAttribute("cargo", cargo);
                response.sendRedirect("EcoInfluencer/perfilEcoInfluencer.jsp");
            }
        }
        if(request.getParameter("cerrar") != null){
            //invalida todas las sesiones
            session.invalidate();
        }
        
        %>
    </body>
</html>