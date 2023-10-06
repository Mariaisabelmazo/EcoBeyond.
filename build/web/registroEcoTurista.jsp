<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="Imagenes/hojita.png"/>
        <title>EcoBeyond</title>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <form id="cuadro">
        <img src="Imagenes/Loguito (2).png" height="200px" width="300px" title="logo"/>
        <br/>
        <p id="titulo">Registro Eco Turista</p>
        <br/>
        <input class="entrada" type="text" name = "Nombre" id="Nombre" placeholder="Ingrese su Nombre:">
        <input class="entrada" type="text" name = "Apellidos" id="Apellidos" placeholder="Ingrese sus correo:">
        <input class="entrada" type="password" name = "Contraseña" id="Constraseña" placeholder="Ingrese su Constraseña:">
        <p>Estoy de acuerdo con <a href="#">Terminos y Condiciones</a></p>
        <br/>
        <input type="button" value="Registrar" id="boton"/>
        
        <p><a href="index.jsp">¿Ya tienes Cuenta?</a></p>
    </form> 

</body>
</html>