<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//no 값 가져오기
	int no = Integer.parseInt(request.getParameter("no"));
Class.forName("oracle.jdbc.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "javadb";
String password = "12345";
Connection con = DriverManager.getConnection(url, user, password);
	//no 에 해당하는 사용자 삭제
String sql="delete from usertbl where no=?";
	PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setInt(1,no);
	//삭제 결과에 따라 페이지 이동
	pstmt.executeUpdate();
	response.sendRedirect("list.jsp");
%>