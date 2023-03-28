package shop2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static shop2.JdbcUtil.*;
/*
 * JdbcUtil 메소드 호출하는 방법
 * 
 * 1) static 메소드 이므로
 *    클래스이름.메소드명();
 * 
 * 2) jdbcUtil 클래스 안 메소드가 모두 static이라면
 *    improt static jdbcUtil.*;
 * 
 */

public class UserDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//회원가입
	public boolean insert(int user_id,String name,int pay_no) {
		boolean status = false;
		try {
			con = getConnection();
			String sql = "insert into suser(user_id,name,pay_no) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, user_id);
			pstmt.setString(2, name);
			pstmt.setInt(3, pay_no);
			
			int result  = pstmt.executeUpdate();
			
			if(result>0) status = true;	
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(con, pstmt);
		}
		return status;
	}
	
	public List<UserDTO> getList(){
		List<UserDTO> list = new ArrayList<>();
		try {
			con = getConnection();
			String sql = "select * from suser";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserDTO userDTO = new UserDTO(rs.getInt(1),rs.getString(2),rs.getInt(3));
				list.add(userDTO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}
}















