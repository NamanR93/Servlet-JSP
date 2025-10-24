package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServelet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		
		PrintWriter out = res.getWriter();
		out.println("<h1>This is my first servelet</h1>"); //prints in browser
		
		System.out.println("This is my first servelet");  //prints in server console
	}
	
	

}
