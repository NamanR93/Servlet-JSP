package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet  {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name1");
		String email = request.getParameter("email1");
		String password = request.getParameter("pwd1");
		String gender = request.getParameter("gender1");
		String city = request.getParameter("city1");
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Use explicit column names and correct table name (assumed 'register')
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register_db","root","numun.23!");
				 PreparedStatement ps = con.prepareStatement("INSERT INTO register (name, email, password, gender, city) VALUES (?,?,?,?,?)")) {
				
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, password);
				ps.setString(4, gender);
				ps.setString(5, city);
				
				int x = ps.executeUpdate();
				
				if(x >0) {
					response.setContentType("text/html");
					
					out.print("<h3>Registered Successfully</h3>");
					
					RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
					rd.include(request, response);
				}else {
					response.setContentType("text/html");
					out.print("<h3>Registered unsuccessfully</h3>");
					
					RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
					rd.include(request, response);
				}
			}
			
			
			
		}catch(Exception e) {

			out.print("<h3>Registered unsuccessfully: " + e.getMessage() + "</h3>");
			// also print stacktrace to the response to help debugging (remove in production)
			e.printStackTrace(out);
			
			RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
			rd.include(request, response);
		}
		
		
	}

}