package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		// set content type before obtaining the writer
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// use null-safe comparisons to avoid NullPointerException
		if ("naman".equals(name) && "1234".equals(password)) {

			//request.setAttribute("name_key", "naman rawat");
			
			HttpSession session = request.getSession();
			session.setAttribute("name_key","naman rawat");

			RequestDispatcher rd = request.getRequestDispatcher("/Profile.jsp");
			rd.forward(request, response);

		} else {
			out.print("Invalid Credentials");
			RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
			rd.include(request, response);
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// delegate POST to GET so form submissions using POST are handled
		doGet(request, response);
	}

}