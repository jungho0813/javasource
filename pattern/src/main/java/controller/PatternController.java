package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.DeleteAction;
import action.insertAction;

/**
 * Servlet implementation class PatternController
 */
@WebServlet("*.do")
public class PatternController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String cmd = requestURI.substring(contextPath.length());
		
		System.out.println("requestURI "+requestURI);
		System.out.println("contextPath "+contextPath);
		System.out.println("cmd "+cmd);
		
		Action action = null;
		
		if(cmd.equals("/insert.do")) {
			action = new insertAction();
			try {
				action.execute(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(cmd.equals("/list.do")) {
			
		}else if(cmd.equals("/delete.do")) {
			action = new DeleteAction();
			try {
				action.execute(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(cmd.equals("/update.do")) {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
