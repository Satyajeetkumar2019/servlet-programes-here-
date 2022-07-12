package com.nt.Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.lang.*;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ProcessServlet")
public class ProcessServlet extends HttpServlet implements Servlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,NullPointerException, IOException {
		//setContentType
		res.setContentType("text/html");
		//PrintWriter
		PrintWriter pw=null;
		//valiable declaraction 
		String m1val=null;
		//get printawRITER
		pw=res.getWriter();
		//red data from 
		int num1=0;
		int num2=0;
	
		m1val=req.getParameter("s1");
		
		
		//Writer B logic
		if(!m1val.equalsIgnoreCase("link1")&&!m1val.equalsIgnoreCase("link2")) {
			    num1=Integer.parseInt(req.getParameter("t1"));
				num2=Integer.parseInt(req.getParameter("t2 "));		
		}
		else 
			if(m1val.equalsIgnoreCase("add")) {
		     //red dat from form 	 
			 int result=num1+num2;
		     pw.println("<h1 style='color:red;text-align:center; '>Addation :"+result+"</h1>");	
		}
		else if(m1val.equalsIgnoreCase("sub")) {
			    //red dat from form 
				int result=num1-num2;
			    pw.println("<h4 style='color:red;text-align:center;'>Subtraction  :"+result+"</h4>");	
			}
		   else if(m1val.equalsIgnoreCase("mul")) {
				//red dat from form 
				int result=num1*num2;
			    pw.println("<h4 style='color:red;text-align:center;'>Multiplication  :"+result+"</h4>");	
			}
			else if(m1val.equalsIgnoreCase("div")) {
				//red dat from form 
				int result =num1/num2;
			    pw.println("<h4 style='color:red;text-align:center;'>Divison    :"+result+"</h4>");
			}

		
		
			if(m1val.equalsIgnoreCase("link1")) {
				pw.println("<h14 style='color:red;text-align:center;'> System Date</center> "+new Date()+"</h1>");
			}//if
			else
			{
				pw.println("<h3 style='color:red;text-align:center;'> System properties : "+
					 java.lang.System.getProperties()  +"<h3>");
			}
			
			
			//Add hyper link
		   pw.println("<center><a href='page3.html' style='color:red;'>Home</a></center>");
		   //close Strime 
		  //pw.close();		
	}//doGet(-)
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
     doGet(req, res);
	}//end dopost(-)
	
}//end class
