<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
        <form id="cuadro" action="registroEcoInfluencer.jsp" method="post">
        <img src="Imagenes/NuestroLogo.png" height="200px" width="300px" title="logo"/>
        <br/>
        <p id="titulo">Registro EcoBeyond</p>
        <br/>
        <input class="entrada" type="text" name = "Nombre" id="Nombre" requiered="required" placeholder="Ingrese su Nombre:">
        <input class="entrada" type="email" name = "Correo" id="Correo" requiered="required" placeholder="Ingrese sus correo:">
        <input class="entrada" type="text" name = "Contraseña" id="Constra" requiered="required" placeholder="Ingrese su Constraseña:">
        <p>Para registrarse como ecoInfluencer ingrese 1, para registrarse como EcoTurista ingrese 2</p>
        <input class="entrada" type="text" name = "idCargo" id="idCargo" requiered="required" placeholder="Tipo de usuario: ">
        <p>Estoy de acuerdo con <a href="#">Terminos y Condiciones</a></p>
        <br/>
        <button type="submit" name="enviar" value="Registrar" id="boton">Registrarse</button>
        
        <p><a href="login.jsp">¿Ya tienes Cuenta?</a></p>
    </form> 

        <%
        if(request.getParameter("enviar") != null){
            String nombre = request.getParameter("Nombre");
            String correo = request.getParameter("Correo");
            String contra = request.getParameter("Contra");
            int idCargo = Integer.parseInt(request.getParameter("idCargo"));
            
            try{
                Connection con = null;
                Statement st = null;
                
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbEcoBeyond","root","");
                st = con.createStatement();
                st.executeUpdate("insert into usuario ( nombre, correo, contraseña, idCargo) values('"+nombre+"','"+correo+"','"+contra+"','"+idCargo+"');");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                
            }catch(Exception e){
                out.print(e);
            }
        }
        %>
        
</body>
</html>