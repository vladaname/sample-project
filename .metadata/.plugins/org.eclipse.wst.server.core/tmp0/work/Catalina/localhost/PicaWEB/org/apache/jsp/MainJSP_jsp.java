/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.10
 * Generated at: 2019-02-23 11:48:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/pica-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/PicaWEB/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1532767410426L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Carousel -->\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- Carousel End -->\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Main page</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main {\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding-bottom: 100px;\r\n");
      out.write("\tpadding-top: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-tabs li a {\r\n");
      out.write("\tcolor: #777;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("\talign-content: center;\r\n");
      out.write("}\r\n");
      out.write(".item img {width:100%; max-height:670px;display: block; white; opacity: 0.45;}\r\n");
      out.write(".caraous-title {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 20%;\r\n");
      out.write("    left: 15.8%;\r\n");
      out.write("    right: auto;\r\n");
      out.write("    width: 96.66666666666666%;\r\n");
      out.write("    color: #000;\r\n");
      out.write("}\r\n");
      out.write(".caraous-title h1 {color:#000;font-size:55px; font-weight:700;}\r\n");
      out.write(".caraous-title h3 {margin-bottom:30px;color:#fff;font-size:24px;}\r\n");
      out.write(".caraous-title span {color:#aa1f43;font-size:20px;}\r\n");
      out.write(".caraous-img-box img {width:50%;}\r\n");
      out.write("/* Button */\r\n");
      out.write(".site-btn{padding:12px 25px 12px 25px;border-radius:2px;background:#DF314D;border-color:transparent;font-size:14px;}\r\n");
      out.write(".site-btn:hover{background:#C9223D ;border:transparent;}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\tdata-target=\"#myNavbar\">\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">Logo</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a href=\"/PicaWEB/Main\" method=\"get\">HOME</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/PicaWEB/Login\" method=\"get\">LOGIN</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/PicaWEB/Registracija\" method=\"get\">SIGNUP</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/PicaWEB/Contact\" method=\"get\">CONTACT</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div id=\"myCarousel\" class=\"carousel slide\" data-interval=\"false\">\r\n");
      out.write("  <!-- Indicators -->\r\n");
      out.write("  <ol class=\"carousel-indicators\">\r\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("  </ol>\r\n");
      out.write("  <div class=\"carousel-inner\">\r\n");
      out.write("    <div class=\"item active\">\r\n");
      out.write("      <img src=\"https://cdn2.atlantamagazine.com/wp-content/uploads/sites/4/2018/01/pizzaiolo010_courtesy.jpg\" class=\"img-responsive\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"caraous-title\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <span>Non-Profit PIZZA Organization</span>\r\n");
      out.write("                    <h1>Small Effort <br> Make Big PIZZA </h1>\r\n");
      out.write("                    <h3>We are non-profit PIZZA Organization</h3>\r\n");
      out.write("                    <form action=\"/PicaWEB/Login\" method=\"get\">\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-lg btn-info\">NARUCI PICU</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("                </div>\r\n");
      out.write("                              \r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("      <img src=\"https://cdn2.atlantamagazine.com/wp-content/uploads/sites/4/2018/01/pizzaiolo06_courtesy.jpg\" class=\"img-responsive\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"caraous-title\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <span>Non-Profit PIZZA Organization</span>\r\n");
      out.write("                    <h1>Small Effort <br> Make Big PIZZA </h1>\r\n");
      out.write("                    <h3>We are non-profit PIZZA Organization</h3>\r\n");
      out.write("                      <form action=\"/PicaWEB/Login\" method=\"get\">\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-lg btn-info\">NARUCI PICU</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("      <img src=\"https://cdn2.atlantamagazine.com/wp-content/uploads/sites/4/2018/01/pizzaiolo08_courtesy.jpg\" class=\"img-responsive\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"caraous-title\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <span>Non-Profit PIZZA Organization</span>\r\n");
      out.write("                    <h1>Small Effort <br> Make Big PIZZA </h1>\r\n");
      out.write("                    <h3>We are non-profit PIZZA Organization</h3>\r\n");
      out.write("                      <form action=\"/PicaWEB/Login\" method=\"get\">\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-lg btn-info\">NARUCI PICU</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Controls -->\r\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\r\n");
      out.write("    <span class=\"icon-prev\"></span>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n");
      out.write("    <span class=\"icon-next\"></span>\r\n");
      out.write("  </a>  \r\n");
      out.write("</div> \r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}