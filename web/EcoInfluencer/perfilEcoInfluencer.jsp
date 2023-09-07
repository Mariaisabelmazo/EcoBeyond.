<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<%
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("cargo") == null){
        response.sendRedirect("../login.jsp");
    }else{
        String cargo = sesion.getAttribute("cargo").toString();
        if(!cargo.equals("1")){
            response.sendRedirect("../login.jsp");
        }
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="../Imagenes/hojita.png"/>
        <title>EcoBeyond</title>
        <link href="../CSS/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <section class="perfil-usuario">
        <div class="contenedor-perfil">
            <div class="portada-perfil" style="background-image: url(https://www.teahub.io/photos/full/167-1676088_fondos-de-naturaleza-verde.jpg)">
                <div class="avatar-perfil">
                    <img src="../Imagenes/User.jpg" alt=""/>
                </div>
                <div class="datos-perfil">
                    <h4 class="titulo-usuario"><%= sesion.getAttribute("nombre")%></h4>
                    <p class="bio-usuario">
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit repellendus ex culpa natus temporibus.
                    </p>
                    <ul class="lista-perfil">
                        <li>35 Seguidores</li>
                        <li>8 Seguidos</li>
                        <li>12 Publicaciones</li>
                    </ul>
                </div>
                <div class="opciones-perfil">
                    <button type="">Editar Perfil</button>
                    <a href="../configuracion.jsp"><button type="">Configuracion</button></a>
                </div>
            </div>
        </div>
        <div class="menu-perfil">
            <ul>
                <li><a href="#" title="">Publicaciones</a></li>
                <li><a href="#" title="">Seguidores</a></li>
                <li><a href="#" title="">Recomendados 28</a></li>
                <li><a href="#" title="">Lista de Espera</a></li>
            </ul>
        </div>
    </section>
</body>
</html>