package in.sp.backend;

import java.io.IOException;
import java.net.http.HttpRequest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet
{ 
	
	 protected void deGet(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		 
		 HttpSession session = request.getSession();
		 session.invalidate();
		 
		 RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
		 rd.forward(request, response);
}
	 
	

}
