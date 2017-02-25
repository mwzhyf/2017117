package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class course_005fjson_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>我不是真正的慕课网</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/main.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("jQuery(function($){\r\n");
      out.write("\tvar urlStr = \"");
      out.print(request.getContextPath());
      out.write("/courses/");
      out.print(request.getParameter("courseId"));
      out.write("\";\r\n");
      out.write("\t//alert(\"Before Call:\"+urlStr);\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\tmethod: \"GET\",\r\n");
      out.write("\t\turl: urlStr,\r\n");
      out.write("\t\tsuccess:function(data,status,jqXHR){\r\n");
      out.write("\t\t\t//alert(\"Success:\"+data);\r\n");
      out.write("\t\t\tvar course = data;\r\n");
      out.write("\t\t\tvar path = \"");
      out.print(request.getContextPath());
      out.write("/\";\t\r\n");
      out.write("\t\t\t$(\".course-title\").html(course.title);\r\n");
      out.write("\t\t\t$(\".course_video\").attr(\"src\", path+course.imgPath);\r\n");
      out.write("\t\t\t$(\"#learningNum\").text(course.learningNum);\r\n");
      out.write("\t\t\t$(\"#duration\").text(course.duration);\r\n");
      out.write("\t\t\t$(\"#levelDesc\").text(course.levelDesc);\r\n");
      out.write("\t\t\t$(\".course_shortdecription\").html(course.descr);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar chapterList = course.chapterList;\r\n");
      out.write("\t\t\tvar chapter;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfor(var i = 0;i<chapterList.length;i++){\r\n");
      out.write("\t\t\t\tchapter = chapterList[i];\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar liObj = $(\"li\",$(\"#chapterTemplate\")).clone();\t\t\t\t \r\n");
      out.write("\t\t\t\t$(\".outline_name\", liObj).text(chapter.title);\r\n");
      out.write("\t\t\t\t$(\".outline_descr\", liObj).text(chapter.descr);\t\t\t\t\r\n");
      out.write("\t\t\t\tliObj.appendTo(\"#couList\");\t\t\t\t\r\n");
      out.write("\t\t\t}// ~ end for\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}); // end ajax\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"newcontainer\" id=\"course_intro\">\r\n");
      out.write("\t\t\t<div class=\"course-title\"></div>\r\n");
      out.write("\t\t\t<div class=\"course_info\">\r\n");
      out.write("\t\t\t\t<div class=\"course-embed l\">\r\n");
      out.write("\t\t\t\t\t<div id=\"js-course-img\" class=\"img-wrap\">\r\n");
      out.write("\t\t\t\t\t\t<img width=\"600\" height=\"340\" alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"course_video\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"js-video-wrap\" class=\"video\" style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"video_box\" id=\"js-video\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"course_state\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><span>学习人数</span> <em id=\"learningNum\"></em></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"course_hour\"><span>课程时长</span> <em\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"ft-adjust\"><span id=\"duration\"></span>秒</em></li>\r\n");
      out.write("\t\t\t\t\t\t<li><span>课程难度</span> <em id=\"levelDesc\"></em></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"course_list\">\r\n");
      out.write("\t\t\t\t<div class=\"outline\">\r\n");
      out.write("\t\t\t\t\t<h3 class=\"chapter_introduces\">课程介绍</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"course_shortdecription\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h3 class=\"chapter_catalog\">课程提纲</h3>\r\n");
      out.write("\t\t\t\t\t<ul id=\"couList\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"chapterTemplate\"  style=\"display:none\">\r\n");
      out.write("       <li class=\"clearfix open\"><a href=\"#\">\r\n");
      out.write("\t\t\t\t<div class=\"openicon\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"outline_list l\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"outline_name\"></h5>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"outline_descr\"></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t </a></li>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
