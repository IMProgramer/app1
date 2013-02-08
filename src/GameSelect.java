package example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GameSelect extends HttpServlet{
       public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException{
              response.setContentType("text/html");
              PrintWriter out = response.getWriter();
              String c = request.getParameter("type");
              out.println("Game Advice<br>"+
                          "Got Type:"+c);
       }
}