package com.nt.Servlet;
import java.util.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class VoterServlet1 extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
//setContent type
	res.setContentType("text/html");
	//Get PrintWriter
	PrintWriter pw=null;
	pw=res.getWriter();
	//red date from form 
	String name=null;
	float age=0;
	name=req.getParameter("pname");
	age=Float.parseFloat(req.getParameter("page"));
	//write bunisess logi below 
	if(age<18) {
		pw.println("<h1><center><i>Mr/mrs  "+name+"You are not Eligible for vote </i></center></h1>");
	}else {
		pw.println("<h1><center><i>Mr/mrs  "+name+"You are  Eligible for vote </i></center></h1>");
	}//end else block
	//add Hyper link 
	pw.println("<center><a href='http://localhost:2525/com.nt.Servlet/input3.html'>Home </a></center>");
	pw.close();
	
	
	
}//end of the method 
}//end class
