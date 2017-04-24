package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modelo.Empleados;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/jsp/header.jsp");
    _jspx_dependants.add("/jsp/bodyIndex.jsp");
    _jspx_dependants.add("/jsp/footer.jsp");
  }

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"imagenes\">\n");
      out.write("        <link href=\"https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/estilos.css\">\n");
      out.write("        \n");
      out.write("        <title>Index Cortsem</title>\n");
      out.write("        <script ></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
HttpSession sesion= request.getSession();
        
        
        
        
        if(sesion.getAttribute("rol")== null){
           
        
        
      out.write("\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            <hr class=\"rayainicial\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("                                                                \n");
      out.write("        <nav class=\"navbar navbar-inverse barra\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">CORTSEM</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"#\"><span class=\"glyphicon glyphicon-user loguito\"></span>REGISTRASE</a></li>\n");
      out.write("                   \n");
      out.write("                    <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in loguito\">\n");
      out.write("                                          \n");
      out.write("                            </span>Login</a></li>\n");
      out.write("                           \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        </header>\n");
      out.write("        ");
}else if (sesion.getAttribute("rol").equals("Gerente")){
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            <hr class=\"rayainicial\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("                                                                \n");
      out.write("        <nav class=\"navbar navbar-inverse barra\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" id=\"boton\">CORTSEM</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"ListarEmpleados\">EMPLEADOS</a></li>\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"ListarClientes\">CLIENTES</a></li>\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"#\">PRODUCCION</a></li>\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"#\">VENTAS</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    \n");
      out.write("                    <li><a href=\"CerrarSession\"><span class=\"glyphicon glyphicon-log-in loguito\">\n");
      out.write("                                         \n");
      out.write("                            </span>Cerrar Sesion</a></li>\n");
      out.write("                           \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        </header>\n");
      out.write("       \n");
      out.write("        <header class=\"menu\" id=\"menu\">\n");
      out.write("            <h5>Bienvenido</h5>\n");
      out.write("            <hr>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Pedidos</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Empleados</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Clientes</a>\n");
      out.write("            </li>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"botonloguin container\">\n");
      out.write("\n");
      out.write("            <h4>BIENVENIDO INGRESAR AQUI</h4>\n");
      out.write("\n");
      out.write("            <!-- Boton  -->\n");
      out.write("            <a href=\"login.jsp\"><button type=\"button\" class=\"btn btn-info btn-lg\" >LOGIN</button></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\"> \n");
      out.write("            <div class=\"col-sm-12\">  \n");
      out.write("        <div class=\"banner container\"> \n");
      out.write("            <div class=\"fondonlogueo\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <img src=\"imagenes/baner.jpg\" alt=\"\" class=\"banner\"/>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2 col-sm-offset-1\">\n");
      out.write("                    <h2 class=\"\">MISIÓN</h2>\n");
      out.write("                    <hr class=\"rayamision\"></div>\n");
      out.write("                <div class=\"col-sm-2 col-sm-offset-6\">\n");
      out.write("                    <h2 class=\"\">VISIÓN</h2>\n");
      out.write("                    <hr class=\"raya\"> </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("\n");
      out.write("                        <p align=\"justify\">Somos una empresa que día a día trabaja por su crecimiento económico y corporativo, \n");
      out.write("                        brindando calidad y los mejores productos a cada empresa;logrando la satisfacción \n");
      out.write("                        plena en términos de relación costo – beneficio, este resultado se refleja en la \n");
      out.write("                        constancia y persistencia de cada uno de nuestros trabajadores. </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4 col-sm-offset-4\">\n");
      out.write("                        <p align=\"justify\"> Nuestra meta en el 2015 es seguir siendo una excelente alternativa, y consolidarnos \n");
      out.write("                        como la mejor  opción para el consumidor final en términos de calidad, tiempos de entrega, \n");
      out.write("                        precios competitivos e innovación</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer >\n");
      out.write("            \n");
      out.write("            <div class=\"contenedorTexto\">\n");
      out.write("                \n");
      out.write("                Telefono: 277-45-63<br>\n");
      out.write("                Direccion Cra 56# 56 a 13\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"posicionIconos\">\n");
      out.write("                <a href=\"#\"><span class=\"icon-facebook iconosFooter\"></span> </a>\n");
      out.write("                <a href=\"#\"><span class=\"icon-google-plus iconosFooter\"></span> </a>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"script/funciona.js\"></script>\n");
      out.write("    </body>\n");
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
