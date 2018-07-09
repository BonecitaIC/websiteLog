package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logueo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script> \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"Inicio.html\">Desempleados.com.ec</a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"Inicio.html\">Inicio <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li class=\"\"><a href=\"#\">Empresas Asociadas <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\">Ayuda</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("            </div><!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <h2 align=\"center\">LOGIN</h2>\n");
      out.write("             <center>\n");
      out.write("            <div class=\"col-md-6\" bordercolor=\"blue\" >\n");
      out.write("                <div class=\"panel panel-primary\">\n");
      out.write("                    <center>\n");
      out.write("                    <h3 align=\"center\">SOY CANDIDATO</h3>\n");
      out.write("                    <br/>\n");
      out.write("\n");
      out.write("                    <form action=\"procesolog.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <label for=\"exampleInputPassword1\">Nickname</label>\n");
      out.write("\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Nickname\" name=\"nick\" aria-describedby=\"sizing-addon2\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <br/>\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"pass\" name=\"pass\" placeholder=\"Password\" aria-describedby=\"sizing-addon2\">\n");
      out.write("                        </div>\n");
      out.write("                        <br/>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-outline-dark\">Login</button>\n");
      out.write("\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        <a href=\"#\">Olvide mi contraseña..!</a>\n");
      out.write("                        <br/>\n");
      out.write("                        <a href=\"#\">Registrarme</a>\n");
      out.write("                        <br/> <br/> <br/>\n");
      out.write("\n");
      out.write("                        <img src=\"Imagenes/Users.png\" alt=\"\" height=\"350\" width=\"350\" align=\"center\" />\n");
      out.write("                    </form>\n");
      out.write("                    </center>   \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <div class=\"panel panel-success\">\n");
      out.write("                    <center>\n");
      out.write("                    <h3 align=\"center\">SOY EMPRESA</h3>\n");
      out.write("                    <br/>\n");
      out.write("\n");
      out.write("                    <form action=\"procesologemp.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <label for=\"exampleInputPassword1\">Correo Empresarial</label>\n");
      out.write("\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Correo Empresarial\" name=\"correo_e\" aria-describedby=\"sizing-addon2\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <br/>\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"pass_e\" name=\"pass_e\" placeholder=\"Password\" aria-describedby=\"sizing-addon2\">\n");
      out.write("                        </div>\n");
      out.write("                        <br/>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-outline-dark\">Login</button>\n");
      out.write("\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        <a href=\"#\">Olvide mi contraseña..!</a>\n");
      out.write("                        <br/>\n");
      out.write("                        <a href=\"RegistrarUsuario.jsp\">Registrarme</a>\n");
      out.write("                        <br/> <br/> <br/>\n");
      out.write("\n");
      out.write("                        <img src=\"Imagenes/Users.png\" alt=\"\" height=\"350\" width=\"350\" align=\"center\" />\n");
      out.write("                    </form>\n");
      out.write("                    </center> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             </center>\n");
      out.write("        </div>\n");
      out.write("\n");
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
