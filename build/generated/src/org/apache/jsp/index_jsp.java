package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>EcoBeyond</title>\n");
      out.write("    <link rel=\"shortcun icon\" href=\"Imagenes/hojita.png\" type=\"image/x-icon\">\n");
      out.write("    <link href=\"CSS/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav>\n");
      out.write("            <a href=\"#\">Inicio Sesión</a>\n");
      out.write("            <a href=\"#\">Registro</a>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"textos-header\">\n");
      out.write("            <section class=\"textos-header\">\n");
      out.write("                <h1>EcoBeyond</h1>\n");
      out.write("                <h2>#Más_Allá_de_la_Ecología</h2>\n");
      out.write("            </section>\n");
      out.write("            <div class=\"wave\" style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path d=\"M-1.41,21.20 C131.20,170.22 346.78,-84.38 527.36,112.98 L500.00,150.00 L0.00,150.00 Z\" style=\"stroke: none; fill: #fff;\"></path></svg></div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("        <section class=\"contenedor-sobre-nosotros\">\n");
      out.write("            <img src=\"img/logotipo2.png\" alt=\"\" class=\"imagen-about-us\">\n");
      out.write("            <div class=\"contenido-textos\">\n");
      out.write("                <h3>¿Qué es?</h3>\n");
      out.write("                <p>Un blog Ecoturístico en el cual dependiendo de el Usuario que elijas ser podrás publicar, comentar,\n");
      out.write("                   reaccionar e interactuar con la plantaforma y tus lugares favoritos.</p>\n");
      out.write("                <h3>¿A donde queremos llegar?</h3>\n");
      out.write("                <p>Desarrollar una aplicación web con funciones de “blog” que permita a los usuarios conocer los lugares \n");
      out.write("                   turísticos que hay en el país y dar diferentes iniciativas para concientizar a las personas a preservar \n");
      out.write("                   estos lugares.</p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"creditos contenedor\">\n");
      out.write("            <h2 class=\"titulo\">Créditos</h2>\n");
      out.write("            <div class=\"cards\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img src=\"img/maria.jpeg\" alt=\"\">\n");
      out.write("                    <div class=\"contenido-texto-card\">\n");
      out.write("                        <h4>Maria Isabel Mazo Rodriguez</h4>\n");
      out.write("                        <p>maria_mazo23211@elpoli.edu.co</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img src=\"img/cinthia-prueba.jpeg\" alt=\"\">\n");
      out.write("                    <div class=\"contenido-texto-card\">\n");
      out.write("                        <h4>Cinthia Mariana Serna Cartagena</h4>\n");
      out.write("                        <p>cinthia_serna23211@elpoli.edu.co</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img src=\"img/maria.jpeg\" alt=\"\">\n");
      out.write("                    <div class=\"contenido-texto-card\">\n");
      out.write("                        <h4>Brayan Estiben Tamayo Lopez</h4>\n");
      out.write("                        <p>brayan_tamayo23211@elpoli.edu.co</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("    <footer>\n");
      out.write("        <h2 class=\"titulo-final\">&copy; Politecnico Colombiano Jaime Isaza Cadavid</h2>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
