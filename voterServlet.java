package com.nt.Servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class voterServlet extends HttpServlet {
	@Override
public void doGet(HttpServletRequest reg,HttpServletResponse res)throws ServletException ,IOException ,NullPointerException{
//set response type 
res.setContentType("text/html");
//getPrint writer
PrintWriter pw=null;
String name=null;
String add=null;
float age=0;
//general seting 
pw=res.getWriter();

//get Request parameter values using form 
name=reg.getParameter("pname");
add=reg.getParameter("padd");
age=Float.parseFloat(reg.getParameter("page"));

//write request processing logic
if(age<18)

pw.println("<h1 style='color:red;text-align='center'>"
		+ "Mr/Miss/Mri  "+name+"  you not Eligible for Vote</h1>");
else
	//pw.println("<h1 style='color:green;'>"+name+"you are not  Eligible for Vote</h1>");
	pw.println("<h1 style='color:red;text-align='center'>"
			+ "Mr/Miss/Mri "+name+" you  Eligible for Vote</h1>");
//add Hyper link 
pw.println("<center><a href='input.html'>Home </a></center>");
pw.close();
}//end servic method 	
}//end of the class
