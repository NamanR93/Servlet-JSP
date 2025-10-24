package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class MyServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		if(name.equals("naman") && password.equals("naman123")) {
			
			req.setAttribute("name", "naman");
			
			RequestDispatcher rd = req.getRequestDispatcher("/Profile.jsp");
			rd.forward(req, res);
		} else {
			
			// RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			// rd.forward(request, response);
			
			res.setContentType("text/html");
			out.println("<h3>Invalid Credentials</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/Index.html");
			rd.include(req, res);
			
			
		}
	}

}
