package com.nt.Servlet;
import java.util.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
public class ExcelServlet extends HttpServlet {
public void doGet(HttpServletRequest reg,HttpServletResponse res) throws ServletException,IOException {
//getPrintWriter
	PrintWriter pw=null;
	//get serponse 
	res.setContentType("application/vnd.ms-excel");
	pw=res.getWriter();
	//write logic below 
	pw.println("<table border='0'>");
	pw.println("<tr><th>player  </th><th>role</th></tr>");
	pw.println("<tr><td>Doni</td><td>Caption</td></tr>");
	pw.println("<tr><td>sachin</td><td>All Rounder</td></tr>");
	pw.println("</table>");
	//close stream
	pw.close();
	
	
}//servic(-)
	
	
	
}//end class
