package com.nt.Servlet;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class HtmlServlet extends HttpServlet {
public void doGet(HttpServletRequest req,
		HttpServletResponse  res)throws ServletException,IOException {
	//veriable declaraction
	PrintWriter pw=null;
	//set response object type
	res.setContentType("text/html");
	pw=res.getWriter();
	//write a logic to generate  result 
	pw.println("<table border='1'>");
	pw.println("<tr><th>player  </th><th>role</th></tr>");
	pw.println("<tr><td>Doni</td><td>Caption</td></tr>");
	pw.println("<tr><td>sachin</td><td>All Rounder</td></tr>");
	pw.println("</table>");
	//close stream
	pw.close();
}//servic(-)
	
	
	
}//end of class
