/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.10
 * Generated at: 2019-02-28 16:47:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreatePicaJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Create pica</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("   <style>\r\n");
      out.write("\t\r\n");
      out.write("/* BASIC */\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write(" background-color: red;\r\n");
      out.write("  font-family: \"Poppins\", sans-serif;\r\n");
      out.write("  height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("  color: #92badd;\r\n");
      out.write("  display:inline-block;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-weight: 400;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  display:inline-block;\r\n");
      out.write("  margin: 40px 8px 10px 8px; \r\n");
      out.write("  color: #cccccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* STRUCTURE */\r\n");
      out.write("\r\n");
      out.write(".wrapper {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  flex-direction: column; \r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  min-height: 100%;\r\n");
      out.write("  padding: 55px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formContent {\r\n");
      out.write("  -webkit-border-radius: 10px 10px 10px 10px;\r\n");
      out.write("  border-radius: 10px 10px 10px 10px;\r\n");
      out.write("  background: #fff;\r\n");
      out.write("  padding: 20px;\r\n");
      out.write("  width: 90%;\r\n");
      out.write("  max-width: 450px;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  padding: 0px;\r\n");
      out.write("  -webkit-box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);\r\n");
      out.write("  box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formFooter {\r\n");
      out.write("  background-color: #f6f6f6;\r\n");
      out.write("  border-top: 1px solid #dce8f1;\r\n");
      out.write("  padding: 25px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  -webkit-border-radius: 0 0 10px 10px;\r\n");
      out.write("  border-radius: 0 0 10px 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* TABS */\r\n");
      out.write("\r\n");
      out.write("h2.inactive {\r\n");
      out.write("  color: #cccccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2.active {\r\n");
      out.write("  color: #0d0d0d;\r\n");
      out.write("  border-bottom: 2px solid #5fbae9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* FORM TYPOGRAPHY*/\r\n");
      out.write("\r\n");
      out.write("input[type=button], input[type=submit], input[type=reset]  {\r\n");
      out.write("  background-color: #56baed;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 15px 80px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  font-size: 13px;\r\n");
      out.write("  -webkit-box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);\r\n");
      out.write("  box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);\r\n");
      out.write("  -webkit-border-radius: 5px 5px 5px 5px;\r\n");
      out.write("  border-radius: 5px 5px 5px 5px;\r\n");
      out.write("  margin: 5px 20px 40px 20px;\r\n");
      out.write("  -webkit-transition: all 0.3s ease-in-out;\r\n");
      out.write("  -moz-transition: all 0.3s ease-in-out;\r\n");
      out.write("  -ms-transition: all 0.3s ease-in-out;\r\n");
      out.write("  -o-transition: all 0.3s ease-in-out;\r\n");
      out.write("  transition: all 0.3s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=button]:hover, input[type=submit]:hover, input[type=reset]:hover  {\r\n");
      out.write("  background-color: #39ace7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=button]:active, input[type=submit]:active, input[type=reset]:active  {\r\n");
      out.write("  -moz-transform: scale(0.95);\r\n");
      out.write("  -webkit-transform: scale(0.95);\r\n");
      out.write("  -o-transform: scale(0.95);\r\n");
      out.write("  -ms-transform: scale(0.95);\r\n");
      out.write("  transform: scale(0.95);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text] {\r\n");
      out.write("  background-color: #f6f6f6;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: #0d0d0d;\r\n");
      out.write("  padding: 10px 10px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  margin: 5px;\r\n");
      out.write("  width: 85%;\r\n");
      out.write("  border: 2px solid #f6f6f6;\r\n");
      out.write("  -webkit-transition: all 0.5s ease-in-out;\r\n");
      out.write("  -moz-transition: all 0.5s ease-in-out;\r\n");
      out.write("  -ms-transition: all 0.5s ease-in-out;\r\n");
      out.write("  -o-transition: all 0.5s ease-in-out;\r\n");
      out.write("  transition: all 0.5s ease-in-out;\r\n");
      out.write("  -webkit-border-radius: 5px 5px 5px 5px;\r\n");
      out.write("  border-radius: 5px 5px 5px 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text]:focus {\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  border-bottom: 2px solid #5fbae9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text]:placeholder {\r\n");
      out.write("  color: #cccccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* ANIMATIONS */\r\n");
      out.write("\r\n");
      out.write("/* Simple CSS3 Fade-in-down Animation */\r\n");
      out.write(".fadeInDown {\r\n");
      out.write("  -webkit-animation-name: fadeInDown;\r\n");
      out.write("  animation-name: fadeInDown;\r\n");
      out.write("  -webkit-animation-duration: 1s;\r\n");
      out.write("  animation-duration: 1s;\r\n");
      out.write("  -webkit-animation-fill-mode: both;\r\n");
      out.write("  animation-fill-mode: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes fadeInDown {\r\n");
      out.write("  0% {\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("    -webkit-transform: translate3d(0, -100%, 0);\r\n");
      out.write("    transform: translate3d(0, -100%, 0);\r\n");
      out.write("  }\r\n");
      out.write("  100% {\r\n");
      out.write("    opacity: 1;\r\n");
      out.write("    -webkit-transform: none;\r\n");
      out.write("    transform: none;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes fadeInDown {\r\n");
      out.write("  0% {\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("    -webkit-transform: translate3d(0, -100%, 0);\r\n");
      out.write("    transform: translate3d(0, -100%, 0);\r\n");
      out.write("  }\r\n");
      out.write("  100% {\r\n");
      out.write("    opacity: 1;\r\n");
      out.write("    -webkit-transform: none;\r\n");
      out.write("    transform: none;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Simple CSS3 Fade-in Animation */\r\n");
      out.write("@-webkit-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\r\n");
      out.write("@-moz-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\r\n");
      out.write("@keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\r\n");
      out.write("\r\n");
      out.write(".fadeIn {\r\n");
      out.write("  opacity:0;\r\n");
      out.write("  -webkit-animation:fadeIn ease-in 1;\r\n");
      out.write("  -moz-animation:fadeIn ease-in 1;\r\n");
      out.write("  animation:fadeIn ease-in 1;\r\n");
      out.write("\r\n");
      out.write("  -webkit-animation-fill-mode:forwards;\r\n");
      out.write("  -moz-animation-fill-mode:forwards;\r\n");
      out.write("  animation-fill-mode:forwards;\r\n");
      out.write("\r\n");
      out.write("  -webkit-animation-duration:1s;\r\n");
      out.write("  -moz-animation-duration:1s;\r\n");
      out.write("  animation-duration:1s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fadeIn.first {\r\n");
      out.write("  -webkit-animation-delay: 0.4s;\r\n");
      out.write("  -moz-animation-delay: 0.4s;\r\n");
      out.write("  animation-delay: 0.4s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fadeIn.second {\r\n");
      out.write("  -webkit-animation-delay: 0.6s;\r\n");
      out.write("  -moz-animation-delay: 0.6s;\r\n");
      out.write("  animation-delay: 0.6s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fadeIn.third {\r\n");
      out.write("  -webkit-animation-delay: 0.8s;\r\n");
      out.write("  -moz-animation-delay: 0.8s;\r\n");
      out.write("  animation-delay: 0.8s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fadeIn.fourth {\r\n");
      out.write("  -webkit-animation-delay: 1s;\r\n");
      out.write("  -moz-animation-delay: 1s;\r\n");
      out.write("  animation-delay: 1s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Simple CSS3 Fade-in Animation */\r\n");
      out.write(".underlineHover:after {\r\n");
      out.write("  display: block;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  bottom: -10px;\r\n");
      out.write("  width: 0;\r\n");
      out.write("  height: 2px;\r\n");
      out.write("  background-color: #56baed;\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  transition: width 0.2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".underlineHover:hover {\r\n");
      out.write("  color: #0d0d0d;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".underlineHover:hover:after{\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1{\r\n");
      out.write("    color:#60a0ff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* OTHERS */\r\n");
      out.write("\r\n");
      out.write("*:focus {\r\n");
      out.write("    outline: none;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("#icon {\r\n");
      out.write("  width:30%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Container (Login Section - navbar) -->\r\n");
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
      out.write("\t\t\t\t<li><a href=\"/PicaWEB/LogOut\" method=\"get\">LOGOUT</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Container (Login Section) -->\r\n");
      out.write("\t<div class=\"wrapper fadeInDown\">\r\n");
      out.write("\t\t<div id=\"formContent\">\r\n");
      out.write("\t\t\t<!-- Tabs Titles -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Icon -->\r\n");
      out.write("\t\t\t<div class=\"fadeIn first\">\r\n");
      out.write("\t\t\t\t<h3>Create pica</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Login Form -->\r\n");
      out.write("\t\t\t<form action=\"/PicaWEB/CreatePica\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"login\" class=\"fadeIn second\" name=\"nazivPice\" placeholder=\"naziv pice\">\r\n");
      out.write("\t\t\t\t\t <input type=\"text\" id=\"surname\"\r\n");
      out.write("\t\t\t\t\tclass=\"fadeIn second\" name=\"velicina\" placeholder=\"velicina pice\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"login\" class=\"fadeIn second\" name=\"cena\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"cena pice\"> <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\tclass=\"fadeIn fourth\" value=\"Unesi u bazu\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p>Poruka:</p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageP }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
