package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/SubmitForm")

public class MyServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = (String) request.getParameter("name");
			
		String password = (String)  request.getParameter("password");
		
		if(name.equals("naman") && password.equals("naman1234") ) {
			
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Failed");
		}
		
	}

}
