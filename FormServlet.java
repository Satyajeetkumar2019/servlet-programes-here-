package com.nt.Servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.io.*;
import java.lang.Object;
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,NullPointerException
, IOException {
	//Veriable decleraction 
		PrintWriter pw=null;
		String name=null;
		String ms=null;
		String gender=null;
		String add=null;
		//String[] gf=null;
		
		//String scr=null;
		//String hb=null;
		
		int age=0;
		
		
		//get PrintWriter
		pw=res.getWriter();
		//setContentType
		res.setContentType("text/html");
		//red form data 
		name=req.getParameter("pname");
		gender=req.getParameter("pgender");
		add=req.getParameter("padd");
		String gf[]=req.getParameterValues("qalification");
		
	String src[]=req.getParameterValues("course");
	String 	hb[]=req.getParameterValues("hb");
	
		age=Integer.parseInt(req.getParameter("page"));
		ms=req.getParameter("ms");
		//Write request Processing logic 
		if(gender.equalsIgnoreCase("M")) {
			if(age<=5)
				pw.println(name+   ": you are baby boy :");
			else if(age<=12)
				pw.println(name+  " :u r small boy");
			else if(age<=19)
				pw.println(name+" :u r teenage boy");
			else if(age<=35)
				pw.println(name+" :u r young man");
			else if(age<=50)
				pw.println(name+" :u r middle age  boy");
			else 
				pw.println(name+" :u r Budda boy");
			
		}//end if
		else if(gender.equalsIgnoreCase("F")) {
			if(age<=5)
				pw.println(name+" :you are baby girl :");
			else if(age<=12)
				pw.println(name+" :u r small girl");
			else if(age<=19)
				pw.println(name+": u r teenage girl");
			else if(age<=35)
				pw.println(name+" :u r young woman");
			else if(age<=50)
				pw.println(name+" :u r middle age  woman");
			else 
				pw.println(name+" :u r Budda woman");
		}//end of the if
		pw.println("<center><div style='color:red'>");
		pw.println("<br>name  :"           +name);
		pw.println("<br>Age :"              +age);
		pw.println("<br>Gender :"           +gender);
		pw.println("<br>Marital State :"  +ms);
		pw.println("<br>Addres :"         +add);
		pw.println("<br>Qualification : " +Arrays.toString(gf));
		pw.println("<br>Course  :"        +Arrays.toString(src));
		pw.println("<br>Hobies    :"       +Arrays.toString(hb));
		pw.println("</div></center>");
		//add Hyper link 
		pw.println("<center><a href='form1.html'>Home </a></center>");
		pw.close();
	}//end doGet(-)

	
	
	
	
	
}//end cass
