<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// form 내용 가져오기
request.setCharacterEncoding("utf-8");

int no = Integer.parseInt(request.getParameter("no"));
String newAddr = request.getParameter("newaddr");
String newMobile = request.getParameter("newmobile");

Class.forName("oracle.jdbc.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "javadb";
String password = "12345";
Connection con = DriverManager.getConnection(url, user, password);

PreparedStatement pstmt = null;

if (newAddr!="" && newMobile!="") {
    // 둘 다 값이 있는 경우
    String sql = "update usertbl set addr=?, mobile=? where no=?";
    pstmt = con.prepareStatement(sql);
    pstmt.setString(1, newAddr);
    pstmt.setString(2, newMobile);
    pstmt.setInt(3, no);
} else if (newAddr !="") {
    // addr 값만 있는 경우
    String sql = "update usertbl set addr=? where no=?";
    pstmt = con.prepareStatement(sql);
    pstmt.setString(1, newAddr);
    pstmt.setInt(2, no);
} else {
    // mobile 값만 있는 경우
    String sql = "update usertbl set mobile=? where no=?";
    pstmt = con.prepareStatement(sql);
    pstmt.setString(1, newMobile);
    pstmt.setInt(2, no);
}
int count = pstmt.executeUpdate();

pstmt.close();
con.close();

if (count > 0) {
    response.sendRedirect("list.jsp");
} else {
   // out.println("수정에 실패하였습니다.");
	response.sendRedirect("list.jsp");
}


%>