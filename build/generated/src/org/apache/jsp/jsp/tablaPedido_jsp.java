package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Pedidos;
import java.util.ArrayList;
import java.sql.ResultSet;

public final class tablaPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\t\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function (e) {\n");
      out.write("\n");
      out.write("            $('#detalles').on('click', function () {\n");
      out.write("\n");
      out.write("                $('#contenido').attr('src', 'prueba.html');\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<div class=\"container\" id=\"contenido\">\n");
      out.write("    <h1>Click the filter icon <small>(<i class=\"glyphicon glyphicon-filter\"></i>)</small></h1>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h3 class=\"panel-title\">Developers</h3>\n");
      out.write("                    <div class=\"pull-right\">\n");
      out.write("                        <span class=\"clickable filter\" data-toggle=\"tooltip\" title=\"Toggle table filter\" data-container=\"body\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-filter\"></i>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"dev-table-filter\" data-action=\"filter\" data-filters=\"#dev-table\" placeholder=\"Filter Developers\" />\n");
      out.write("                </div>\n");
      out.write("                <table class=\"table table-hover\" id=\"dev-table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>#</th>\n");
      out.write("                            <th>Nombre</th>\n");
      out.write("                            <th>Nit</th>\n");
      out.write("                            <th>Numero de Pedido</th>\n");
      out.write("                            <th>Ver Detalle</th>\n");
      out.write("                            <th>Editar</th>\n");
      out.write("                            <th>Eliminar</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    ");
ArrayList<Pedidos> rs = (ArrayList<Pedidos>) request.getAttribute("ListarPedidos");
                        ResultSet rsc = (ResultSet) request.getAttribute("ListarClientes");
                        int cont;
                        cont = 1;
                        try {
                       for(Pedidos var : rs) {
                            
                        

                    
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(cont);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(var.getId());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(var.getDescripcion());
      out.write("</td>\n");
      out.write("                            <td>hola</td>\n");
      out.write("                            <td><a  href=\"EditarPedidos?id=1\" ><span><img src=\"imagenes/ojo.png\"></span></a></td>\n");
      out.write("                            <td><a href=\"#\" id=\"editar\"><span><img src=\"imagenes/editar.png\"></span></a></td>\n");
      out.write("                            <td><a href=\"#\" id=\"eliminar\"><span><img src=\"imagenes/borrar.png\"></span></a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");
cont +=1;
                        }
      out.write("\n");
      out.write("                     ");
   } catch (Exception e) {
                            e.printStackTrace();
                        }
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
