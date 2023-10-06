package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"icon\" href=\"Imagenes/hojita.png\"/>\n");
      out.write("        <title>EcoBeyond</title>\n");
      out.write("        <link href=\"CSS/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"../Imagenes/nat.png\">\n");
      out.write("        <div id=\"cuadro\">\n");
      out.write("            <form action=\"SERVLOGIN\" method=\"POST\">\n");
      out.write("            <img src=\"Imagenes/Loguito (2).png\" height=\"200px\" width=\"350px\" title=\"logo\"/>\n");
      out.write("            <br/>\n");
      out.write("            <p id=\"titulo\">INICIAR SESIÓN</p>\n");
      out.write("            <hr>\n");
      out.write("            <br/><br/>\n");
      out.write("            <input class=\"entrada\" type=\"text\" name = \"txtusuario\" id=\"Nombre\" placeholder=\"Ingrese su nombre de usuario\">\n");
      out.write("            <br/><br/>\n");
      out.write("            <input class=\"entrada\" type=\"password\" name = \"txtcontra\" id=\"Contraseña\" placeholder=\"Ingrese su contraseña\">\n");
      out.write("            <br/><br/>\n");
      out.write("            <input type=\"submit\" name=\"btnIniciar\" value=\"Iniciar sesión\" id=\"boton\"/>\n");
      out.write("            <br/><br/>\n");
      out.write("            <a href=\"registroEcoInfluencer.jsp\"><input  type=\"button\" value=\"Crear una cuenta\" class=\"btn btn-primary\" id=\"boton2\"/></a>\n");
      out.write("            </form>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                <div id=\"contenedor\">\n");
      out.write("            <div id=\"referencias\">\n");
      out.write("                <a href=\"#\">Terminos de uso</a>\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                <center><a href=\"#\">Politica de privacidad</a></center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 
        HttpSession sesion = request.getSession();
        int cargo = 0;
        if(request.getAttribute("cargo") != null){
            cargo = (Integer) request.getAttribute("cargo");
            if(cargo==1){
                sesion.setAttribute("nombre", request.getAttribute("nombre"));
                sesion.setAttribute("cargo", cargo);
                response.sendRedirect("../EcoInfluencer/perfilEcoInfluencer.jsp");
            }
        }
        if(request.getParameter("cerrar") != null){
            //invalida todas las sesiones
            session.invalidate();
        }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
