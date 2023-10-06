package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class acercaDe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script src=\"https://kit.fontawesome.com/338c5c72af.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <title>Acerca De</title>\n");
      out.write("    <link href=\"CSS/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"contC\">\n");
      out.write("        <div class=\"contIC\">\n");
      out.write("            <h1><i class=\"fas fa-tree\"></i>  EcoBeyond  <i class=\"fas fa-tree\"></i></h1>\n");
      out.write("            <p>\"Mas alla de la Naturaleza\"\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"contCont\">\n");
      out.write("        <article>\n");
      out.write("            <h1>Significado de nuestro Nombre</h1>\n");
      out.write("            <p>EcoBeyond | Eco = Ecología | Beyond = Más allá de | Más allá de la ecología</p>\n");
      out.write("            <br>\n");
      out.write("            <h1>Problemática</h1>\n");
      out.write("            <p>Aunque la industria del turismo está en constante crecimiento, este crecimiento no \n");
      out.write("                siempre tiene necesariamente implicaciones positivas para el destino y sus recursos, \n");
      out.write("                puede también causar un gran impacto medioambiental, social y económico. Por ejemplo, \n");
      out.write("                la acumulación excesiva de basura en zonas turísticas altera la vegetación. El uso de \n");
      out.write("                fogatas en los lugares que no se deben y la contaminación del agua son claramente unos \n");
      out.write("                de los impactos más nocivos, pues viene asociada a la destrucción del hábitat de muchas \n");
      out.write("                especies, la contaminación arquitectónica y la pérdida de calidad paisajística.</p>\n");
      out.write("                <br>\n");
      out.write("                <img src=\"85ff617d-b610-4ca8-bb77-2bf290cfacd7.jpg\" alt=\"\">\n");
      out.write("                <br>\n");
      out.write("                <h1>Alcance</h1>\n");
      out.write("                <p>Se hará un ?Blog EcoTurístico? que le muestre a los dos tipos de usuarios los diferentes \n");
      out.write("                    sitios que pueden visitar en sus días libres, como se mencionó anteriormente nuestro \n");
      out.write("                    ?Blog? tendrá dos tipos de usuarios los Eco Turistas y los Eco Influencers, \n");
      out.write("                    ?El eco-turista? que podrá seguir, comentar y calificar al eco influencer y \n");
      out.write("                    los lugares que éste promociona. No tendrá chat sino muros de comentarios y ?\n");
      out.write("                    El eco-influencer? que es una persona que puede crear reseñas, también podrá \n");
      out.write("                    publicar historias con los lugares donde se hace el eco turismo y así promocionarlos,\n");
      out.write("                     será simple de usar y proporcionará una navegación intuitiva. Se dará la alternativa\n");
      out.write("                      de conocer como llegar a estos sitios y la información sobre el clima de cada uno, \n");
      out.write("                      se propondrán también diferentes actividades para promover el cuidado del medio ambiente.\n");
      out.write("                      <br>\n");
      out.write("                      <p></p>\n");
      out.write("                    Esta alternativa del ?Ecoturismo'' es una mejor idea ya que no modifica el medio ambiente, \n");
      out.write("                    por lo contrario ayuda a que a este se le de mayor relevancia ya que este tipo de turismo \n");
      out.write("                    va de la mano con la ecología.  teniendo como objetivo el  desarrollo sostenible, \n");
      out.write("                    manteniéndose así durante un largo tiempo sin que se agoten los recursos de la naturaleza.\n");
      out.write("                    </p>\n");
      out.write("                    <h1>Objetivo General</h1>\n");
      out.write("                    <p>Desarrollar una aplicación web con funciones de ?blog? que permita a los usuarios \n");
      out.write("                        conocer los lugares turísticos que hay en el país y dar diferentes iniciativas para \n");
      out.write("                        concientizar a las personas a preservar estos lugares.\n");
      out.write("                    </p>\n");
      out.write("        </article>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
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
