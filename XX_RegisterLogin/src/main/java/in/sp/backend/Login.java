package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")

public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email  = request.getParameter("email1");
		String password = request.getParameter("pwd1");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register_db","root","numun.23!");
			
			PreparedStatement ps = con.prepareStatement("select * from users where email=? and password=?");
			
			ps.setString(1, "email");
			ps.setString(2, "password");
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				HttpSession session = request.getSession();
				session.setAttribute("session_name", rs.getString("name"));
				
				out.print("<h3> Login Successful </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/Welcome.jsp");
				rd.include(request, response);
				
			}else {
				
				out.print("<h3> Email id and password didnt match</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
				rd.include(request, response);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
			out.print("<h3> Email id and password didnt match " + e.getMessage() + " </h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
			rd.include(request, response);
		}

		
	}

}
