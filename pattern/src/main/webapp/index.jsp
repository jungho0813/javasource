<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<ul>	
	<li><a href='<c:url value="/list.do"/>'>리스트</a></li>
	<li><a href='<c:url value="/insert.jsp"/>'>삽입</a></li>
	<li><a href='<c:url value="/delete.do?code=1001"/>'>삭제</a></li>
	<li><a href='<c:url value="/update.do"/>'>수정</a></li>
</ul>
</body>
</html>