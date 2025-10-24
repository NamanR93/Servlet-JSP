package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitData")
public class MyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name  = req.getParameter("name");
		String age   = req.getParameter("age");
		
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
		
		
		PrintWriter out = resp.getWriter();
		out.println("<h1> Hello " + name + ", you are " + age + " years old. </h1>");
	}

}
