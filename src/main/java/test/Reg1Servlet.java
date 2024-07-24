package test;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Reg1Servlet")
public class Reg1Servlet extends HttpServlet {
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String empName = request.getParameter("empName");
	        String empId = request.getParameter("empId");

	        ServletContext context = getServletContext();
	        context.setAttribute("empName", empName);
	        context.setAttribute("empId", empId);

	        response.sendRedirect("Reg2.html");
	    }

}
