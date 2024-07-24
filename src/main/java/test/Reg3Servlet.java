package test;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Reg3Servlet")
public class Reg3Servlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String empState = request.getParameter("empState");
        String empCountry = request.getParameter("empCountry");

        ServletContext context = getServletContext();
        String empName = (String) context.getAttribute("empName");
        String empId = (String) context.getAttribute("empId");
        String empLName = (String) context.getAttribute("empLName");
        String empMail = (String) context.getAttribute("empMail");
        String empPhNo = (String) context.getAttribute("empPhNo");

        EmployeeBean eb = new EmployeeBean(empName, empId, empLName, empMail, empPhNo, empState, empCountry);
        EmployeeDAO empDAO = new EmployeeDAO();
        int result = empDAO.register(eb);

        if (result > 0) {
            response.getWriter().println("Registration Successful. Please login.");
            response.sendRedirect("Login.html");
        } else {
            response.getWriter().println("Registration Failed. Please try again.");
        }
    }

}
