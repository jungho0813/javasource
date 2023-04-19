<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//cart.html 에서 사용자가 선택한 자동차 가져오기
	String selectedCar = request.getParameter("product");
	//가져온 자동차 정보를 session 에 저장
	session.setAttribute("selectedCar", selectedCar);
	//이동할 수 있는 페이지 제공
	out.print("<p>선택한 자동차는 "+selectedCar+"입니다.</p>");
%>
<h3>장바구니 저장</h3>
<h4><a href="cartlist.jsp">장바구니 보기</a></h4>
<h4><a href="cartdel.jsp">장바구니 비우기</a></h4>
</body>
</html>