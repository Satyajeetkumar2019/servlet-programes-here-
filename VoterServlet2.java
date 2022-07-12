package com.nt.Servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class VoterServlet2 extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException {
	System.out.println("VoteServlet dopost(-)");
	//Variable decleraction
	String name=null;
	String add=null;
	PrintWriter pw=null;
	int age=0;
	String vstatus=null;
	//set content type 
	res.setContentType("text/html");
    //get PrintWriter
	pw=res.getWriter();
	
	//red date form input form 
	name=req.getParameter("pname").trim();
	add=req.getParameter("padd").trim();
	age=Integer.parseInt (req.getParameter("page"));
	vstatus=req.getParameter("vflag").trim();
	
	//service side validation 
	if(vstatus.equalsIgnoreCase("no")) {
		System.out.println("server side validation done");
	         if(name.equals(" ") || name==null||name.length()==0) {
	         pw.println("<h1><center>Persone name is required</center></h1>");
	}//end inner
	//age validation          
	 if(age==0) {
		 pw.println("<h1><center>Persone age is required</center></h1>");
	 }
	 else {
		 try {
	//convert give age vslue to number value 
			 age=Integer.parseInt("age");
		 }catch(ArithmeticException e) {
			 e.printStackTrace();
			 pw.println("<h1><center>Persone age is required</center></h1>");
				
		 }catch(NumberFormatException e) {
			 e.printStackTrace();
			 pw.println("<h1><center>Persone age is required</center></h1>");
			
		 } 
	 }//else close
	 System.out.println("Server side validation done :");
	}//end outer
	else
	{
		age=Integer.parseInt("age");	
	}
	
	
	//wriete b logic 
	if(age<18) 
		pw.println("<h1><center> Mr/Mrs  "+name+" you anr not eligible for vote </center></h1>");
	else
		pw.println("<h1><center> Mr/Mrs  "+name+" you anr  eligible for vote </center></h1>");
	//add hyper link 
	pw.println("<center><a href='http://localhost:2525/com.nt.Servlet/input4.html'>Home </a></center>");
		//close stream
	pw.close();
}//end doPost(-)
}//end of the class
