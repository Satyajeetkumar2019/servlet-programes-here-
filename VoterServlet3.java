package com.nt.Servlet;
import java.io.IOException;
import java.sql.Date;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/VoterServlet3")
public class VoterServlet3 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("voterServlet doPost(-)");
		//to create local object
		PrintWriter pw=null;
		String name=null;
		String add=null;
		String vstatus=null;
		int age=0;
		//general seting 
		res.setContentType("text/html");
		pw=res.getWriter();
		
		//Get red input data from client side
		name=req.getParameter("pname").trim();
		add=req.getParameter("padd").trim();
		vstatus=req.getParameter("vflag").trim();
		age=Integer.parseInt(req.getParameter("page"));
		
		//to write server side validation 
		if(vstatus.equalsIgnoreCase("no")) {
			System.out.println("voterservlet server side validation is doPost(-)");
			List<String> arrayList=new ArrayList();
			if(name=="" ||name.length()==0||name.equals("")) {
			arrayList.add("Person name  is requird :");	
			 if(name.length()< 10) {
				arrayList.add("Person name is requird :");
				
			}//inner else if
			 
			 //To age validation creation 
			 try {
				 age=Integer.parseInt(req.getParameter("page"));
					
			 if(age<0||age>125) {
				arrayList.add("Persone age must be requird :"); 
				 
			 }
			 }catch(NumberFormatException e) {
				 e.printStackTrace();
				 arrayList.add("Persone age must be 0 to 125 :");
			 }
			 //on persone add validation logic
			 try {
			 if(add==null||add.length()==0||add.equals("")) {
				arrayList.add("Person add is requird :");  
			 }//if
			 }catch(NumberFormatException e) {
				 arrayList.add("Persone add is requird :");
				 e.printStackTrace();
			 }//catch
			 //Display form validation logic
			 if(arrayList.size()!=0) {
				pw.println("<ul style='color:red;'>") ;
				for(String ErrMess:arrayList)
				pw.println("<li>"+ErrMess+"</li>");
				pw.println("</ul>");
				return ;
			 }//if
			}//end outer if 
			else {
				age=Integer.parseInt(req.getParameter("page"));
				
			}
		}//end if
		//write B logic
		if(age<18)
			pw.println("<h1>Mr/Mrs "+name+" you are not eligible for vote </h1>");
		else
			pw.println("<h1> Mr/Mrs  "+name+" you are eligible for vote </h1>");
		//add hyper link 
		pw.println("<a href='input5.html'>Home </a>");
		//close stream
		pw.close();
	}//end doPOST(-)
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//heneral seting 
		PrintWriter pw=null;
		//set contentType
		res.setContentType("text/html");
		pw=res.getWriter();
		//Write request processing logic 
		Date d=new Date(0);
		//add hyper link 
		pw.println("<h1 style='color:red;text-align:center;'>  Sysdate "+d+"</h1>");
		//close stream
		pw.close();
	
	}//end doGet(-)

}//end class
