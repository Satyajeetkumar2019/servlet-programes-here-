package com.nt.Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/WishServlet")
public class WishServlet extends HttpServlet {
  private static final Calendar Calendare = null;

//  private static final Calendar Clendare = null;
   
	// Calendar Clendare = null;

	public void doGet(HttpServletRequest reg,
			HttpServletResponse res) throws ServletException, IOException {
	//set content type 
	res.setContentType("text/html");
	//printWriter 
	PrintWriter pw=null;
	Calendar calendar=null;
	int hour=0;
	// Get system date
	calendar=Calendare.getInstance();
	hour=calendar.get(Calendar.HOUR_OF_DAY);
	//get wish message below
	if(hour<=12)
		pw.println("<h1 style='color:red;'><center>Good Morning </center> </h1>");
		else if(hour<=17)
			pw.println("<h1 style='color:red;'><center>Good Afternoon </center> </h1>");	
	
		else if(hour<=20)
			pw.println("<h1 style='color:red;'><center>Good Evening  </center> </h1>");
		else
			pw.println("<h1 style='color:red;'><center>Good Night </center> </h1>");
	//get Hyper link below 
	pw.println("<br><a href='http://localhost:2525/com.nt.Servlet/wish1/page.html'></a></br>");
	//close stream 
	pw.close();
	}//servic
}//end class
