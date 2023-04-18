<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- jsp 주석 : 소스 출력시 보이지 않음 --%>
<!-- html 주석 -->


<%
	request.setCharacterEncoding("utf-8");
	String[] animals = request.getParameterValues("animal");
	
	out.print(Arrays.toString(animals));
	
%>

<%-- <%=Arrays.toString(animals) --%>
</body>
</html>