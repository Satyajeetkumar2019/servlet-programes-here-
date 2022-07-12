package com.nt.Servlet;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class CountryServlet extends HttpServlet{
public void GoPost(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException {
//setContent type
	res.setContentType("text/html");
//Get PrintWriter
PrintWriter pw=null;
pw=res.getWriter();
//Get Input from submit butten
String stateIndia[]= {"AP","TS","MH","UP"};
String stateusa[]= {"CA","LA","NY","CR","AZ"};	
String stateausis[]= {"TMS","BB","CRB"};
String country=null;
//red form data 
country=req.getParameter("country");
//state base on selection on country 
if(country.equals("india")) {
pw.println("state ="+Arrays.toString(stateIndia));		
}
else if(country.equals("us")) {
	pw.println("state="+Arrays.toString(stateusa));
	
}
else
{
	pw.println("state="+Arrays.toString(stateausis));
}
//close strime
pw.close();
}//servic(-)	
}//end of the class
