package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	 protected void service(HttpServletRequest req, HttpServletResponse res) 
	         throws IOException {
	    	
	    	System.out.println("Login Servlet Service Method Called...");
	    }

}
