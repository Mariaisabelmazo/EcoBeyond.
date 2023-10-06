package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class configuracion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link href=\"CSS/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/338c5c72af.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <title>Configuración</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <section class=\"form-register\">\n");
      out.write("        <div class=\"btnA\" id=\"Cerrar\">\n");
      out.write("        <h4 class=\"h4\"><i class=\"fas fa-tree\"></i>  CONFIGURACIÓN  <i class=\"fas fa-tree\"></i></h4>\n");
      out.write("        <input class=\"botons\" id=\"Cerrar\" type= \"submit\" value=\"Cerrar Sesión\">\n");
      out.write("        </div>\n");
      out.write("        <input class=\"botons\" type= \"submit\" value=\"Información\">\n");
      out.write("        <input class=\"botons\" type= \"submit\" value=\"Seguir e Invitar amigos\">\n");
      out.write("        <input class=\"botons\" type= \"submit\" value=\"Acerca de EcoBeyond\">\n");
      out.write("        <p></p>\n");
      out.write("        <a href=\"#\" id = \"btnA\" class=\"btnA\"><i class=\"fas fa-backward\"></i>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- Cuadro de edicion de texto = input class=\"controls\" type= \"text\" name = \"Nombre\" id=\"Nombre\" \n");
      out.write("            placeholder=\"Ingrese su Nombre:\" -->\n");
      out.write("\n");
      out.write("    </section>    \n");
      out.write("\n");
      out.write("    <div class = \"overlay\" id=\"overlay\">\n");
      out.write("        <div class = \"popup\" id=\"popup\">\n");
      out.write("            <a href=\"#\" id = \"btn-cerrar-popup\" class=\"btn-cerrar-popup\"><i class=\"fas fa-exclamation-triangle\"></i></a>\n");
      out.write("            <h3>¿Seguro que quieres cerrar sesión?</h3>\n");
      out.write("            <form action=\"\">\n");
      out.write("               \n");
      out.write("                    <input class=\"botons\" type= \"submit\" value=\"Si\">\n");
      out.write("                    <input class=\"botons\" id = \"no\" type= \"submit\" value=\"No\">\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        var btnAbrirPopup = document.getElementById('Cerrar'),\n");
      out.write("    overlay = document.getElementById('overlay'),\n");
      out.write("    popup = document.getElementById('popup'),\n");
      out.write("    btnCerrar = document.getElementById('btn-cerrar-popup');\n");
      out.write("    btnNo = document.getElementById('no');\n");
      out.write("\n");
      out.write("btnAbrirPopup.addEventListener('click', function(){\n");
      out.write("    overlay.classList.add('activate');\n");
      out.write("});\n");
      out.write("btnCerrar.addEventListener('click', function(){\n");
      out.write("    overlay.classList.remove('activate');\n");
      out.write("});\n");
      out.write("btnNo.addEventListener('click', function(){\n");
      out.write("    overlay.classList.remove('activate');\n");
      out.write("});\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
