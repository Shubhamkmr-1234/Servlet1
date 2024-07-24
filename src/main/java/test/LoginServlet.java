package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String empId = request.getParameter("empId");
	        String empName = request.getParameter("empName");

	        LoginDAO loginDAO = new LoginDAO();
	        if (loginDAO.login(empId, empName)) {
	            response.getWriter().println("Login Success. Welcome " + empName);
	        } else {
	            response.getWriter().println("Login Failed. Please try again.");
	        }
	    }

}
