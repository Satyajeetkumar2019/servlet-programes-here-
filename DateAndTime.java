package com.nt.Servlet;
import java.util.*;
import javax.servlet.*;
import java.io.*;
public class DateAndTime extends GenericServlet {
public void service(ServletRequest reg,
		ServletResponse res)throws ServletException ,IOException {
	//set response object 
	res.setContentType("text/html");
	PrintWriter pw=null;
	Date d=null;
	//GetPrintwtiter
	 pw=res.getWriter();
	//wtrite response object
	 d=new Date();
	pw.println("<b><i><center style='color:#F16013;'>Date and Time "+d+" </center></i></b>");
	pw.close();
	
}//end of the method
}//end class
