package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	
	 protected void service(HttpServletRequest req, HttpServletResponse res) 
	         throws IOException {
	    	
	    	System.out.println("Register Servlet Service Method Called...");
	    }

}
