<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	jsp 스크립트 요소
	1. <% %> : 자바 코드(_sjpService()메소드 안에 들어가게 됨)
	2. <%= %> : 변수나 메서드의 반환값을 화면에 출력할 수 있음(out.prin()대신 사용)
	3. <%! %> : 멤버 변수, 멤버 메서드, 생성자 등을 정의할 수 있음
--%>
    
    
<% 
	// 클라이언트로부터 요청이 들어올 때 해당 사이트에서 저장해둔 쿠키 가져오기 
	Cookie[] cookies = request.getCookies(); %>
<%!
	private String getCookieValue(Cookie[] cookies, String name){
	if(cookies == null){
		return null;
	}
	for(Cookie c:cookies){
		if(c.getName().equals(name)) return c.getValue();
	}
		return null;
}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>이름 : <%=getCookieValue(cookies,"name") %></li>
		<li>성별 : <%=getCookieValue(cookies,"gender") %></li>
		<li>나이 : <%=getCookieValue(cookies,"age") %></li>
		<li>주소 : <%=getCookieValue(cookies,"addr") %></li>
	</ul>
</body>
</html>