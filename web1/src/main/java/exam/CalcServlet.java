package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String op = request.getParameter("op");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int result = 0;
		if (op.equals("+")) {
	        result = num1 + num2;
	    } else if (op.equals("-")) {
	        result = num1 - num2;
	    } else if (op.equals("*")) {
	        result = num1 * num2;
	    } else if (op.equals("/")) {
	        result = num1 / num2;
	    } 
		out.print(num1+op+num2+"="+result);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
