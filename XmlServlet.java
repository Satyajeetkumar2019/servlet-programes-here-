package com.nt.Servlet;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class XmlServlet extends HttpServlet {
	public void doGet(HttpServletRequest reg,
			HttpServletResponse res)throws ServletException ,IOException {
//get printWriter
	PrintWriter pw=null;
	//set content type 
	res.setContentType("text/xml");
	pw=res.getWriter();
	//writer b logic below 
	pw.println("<table border='0'>");
	pw.println("<tr><th>player  </th><th>role</th></tr>");
	pw.println("<tr><td>Doni</td><td>Caption</td></tr>");
	pw.println("<tr><td>sachin</td><td>All Rounder</td></tr>");
	pw.println("</table>");
	//close stream
	pw.close();
	}//servic(-)
	
}//end class
