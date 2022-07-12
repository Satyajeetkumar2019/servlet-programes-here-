package com.nt.Servlet;
import java.util.*;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LinkServlet")
public class LinkServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      //general seting 
		res.setContentType("text/html");
		//GetPrintWriter
		PrintWriter pw=null;
		String Link=null;
		//Locale locales[] =null;
		//GetPrintWriter
		pw=res.getWriter();
		//red the link 
		Link=req.getParameter("s1");
		
		//writer the B.logic
		if(Link.equalsIgnoreCase("link1"));
		Locale locales[]=Locale.getAvailableLocales();
		for(Locale Ic:locales) {
		pw.println(Ic.getDisplayCountry()+"<br>");		
		}//for
	 if(Link.equalsIgnoreCase("link2")) {
		 Locale localesa[]=Locale.getAvailableLocales();
			for(Locale Ic:locales) {
			pw.println(Ic.getDisplayCountry()+"<br>");
		
	}//for
	 }
			else {
				Date d=new Date();
				pw.println("<h1> Date and Time </h1>"+d);
			}
		//add Hyper link 
	 pw.println("<a href='page1.html'>Home  </a>");
	 pw.close();
	}//dopost(-)
 public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException ,IOException {
		 
		 doGet((HttpServletRequest) res,res);
	 }//end dopost(-)

}//end cLASS
