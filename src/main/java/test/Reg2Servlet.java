package test;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Reg2Servlet")
public class Reg2Servlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String empLName = request.getParameter("empLName");
        String empMail = request.getParameter("empMail");
        String empPhNo = request.getParameter("empPhNo");

        ServletContext context = getServletContext();
        context.setAttribute("empLName", empLName);
        context.setAttribute("empMail", empMail);
        context.setAttribute("empPhNo", empPhNo);

        response.sendRedirect("Reg3.html");
    }

}
