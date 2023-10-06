<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
    <script src="https://kit.fontawesome.com/338c5c72af.js" crossorigin="anonymous"></script>
    <link rel="icon" href="Imagenes/hojita.png"/>
    <title>Configuración</title>
</head>
<body>
    
    <section class="form-register">
        <div class="btnA" id="Cerrar">
        <h4 class="h4"><i class="fas fa-tree"></i>  CONFIGURACIÓN  <i class="fas fa-tree"></i></h4>
        <input class="botons" id="Cerrar" type= "submit" value="Cerrar Sesión">
        </div>
        <input class="botons" type= "submit" value="Información">
        <input class="botons" type= "submit" value="Seguir e Invitar amigos">
        <input class="botons" type= "submit" value="Acerca de EcoBeyond">
        <p></p>
        <a href="EcoInfluencer/perfilEcoInfluencer.jsp"><i class="fas fa-backward"></i></a>

        

        <!-- Cuadro de edicion de texto = input class="controls" type= "text" name = "Nombre" id="Nombre" 
            placeholder="Ingrese su Nombre:" -->

      

    <div class = "overlay" id="overlay">
        <div class = "popup" id="popup">
            <a href="#" id = "btn-cerrar-popup" class="btn-cerrar-popup"><i class="fas fa-exclamation-triangle"></i></a>
            <h3>¿Seguro que quieres cerrar sesión?</h3>
            <a href="login.jsp?cerrar=true"><input class="botons" type= "submit" value="Si"></a>
                <input class="botons" id = "no" type= "submit" value="No">
        </div>
    </div>
         </section> 
    <script>
        var btnAbrirPopup = document.getElementById('Cerrar'),
    overlay = document.getElementById('overlay'),
    popup = document.getElementById('popup'),
    btnCerrar = document.getElementById('btn-cerrar-popup');
    btnNo = document.getElementById('no');

btnAbrirPopup.addEventListener('click', function(){
    overlay.classList.add('activate');
});
btnCerrar.addEventListener('click', function(){
    overlay.classList.remove('activate');
});
btnNo.addEventListener('click', function(){
    overlay.classList.remove('activate');
});
    </script>
</body>
</html>