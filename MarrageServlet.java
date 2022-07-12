package com.nt.Servlet;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class MarrageServlet extends HttpServlet {
public void  doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException,NullPointerException {
    //Set contentType
	res.setContentType("text/html");
	//getWrite message
	PrintWriter pw=null;
	String name=null;
	String gender=null;
	float age=0.0f;
	//get printwriter
	pw=res.getWriter();
	//Get Request parameter vlaue using form page  
	name=req.getParameter("pname");
	age=Float.parseFloat(req.getParameter("page"));
	gender=req.getParameter("pgender");
	//age=Float.parseFloat(req.getParameter("page"));
	//to devolope business logic
	if(age<18)
		pw.println("<h1><i><center> Mr/mrs/Mis   "+name+" u r not eligible  for vote </center></i></h1>");	
		
		else
			pw.println("<h1><i><center > Mr/mrs/Mis   "+name+" u r  eligible  for vote </center></i></h1>");	
	//Hyperlink to go home page 
	pw.println("<center><a href='input1.html'><i style='color:red'>Home</i> </a></center>");
	//close stream 
	pw.close();
}//end of service(-)
}//end of the class

