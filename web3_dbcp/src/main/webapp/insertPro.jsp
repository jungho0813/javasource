<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//form 에서 데이터 가져오기
	String name = request.getParameter("name");
	String birthYear = request.getParameter("birthYear");
	String addr = request.getParameter("addr");
	String mobile = request.getParameter("mobile");
	
	UserDAO dao = new UserDAO();
	boolean flag = dao.insert(name, birthYear, addr, mobile);
	
	
	String path="";
	if(flag){
		path="list.jsp";
	}else{
		path="insert.jsp";
	}
	response.sendRedirect(path);
%>







