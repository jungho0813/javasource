package book.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import book.domain.BookDTO;

public class BookDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;	
	

	
	public Connection getConnection() {
		Context ctx;
		
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myoracle");
			Connection con = ds.getConnection();
			con.setAutoCommit(false);
			return con;
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return null;
	}
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		try {			
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<BookDTO> getList(){
		List<BookDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = "select code,title,writer,price from booktbl";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				int code =rs.getInt("code");
//		    	String title = rs.getString("title");
//		    	String writer = rs.getString("writer");
//		    	int price = rs.getInt("price");
				
//				list.add(new BookDTO(code,title,writer,price));
				
				BookDTO dto = new BookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				list.add(dto);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	
	public BookDTO getRow(int code) {
		BookDTO dto = null;
		
		try {
			con = getConnection();
			String sql = "select * from booktbl where code=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, code);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				code =rs.getInt("code");
		    	String title = rs.getString("title");
		    	String writer = rs.getString("writer");
		    	int price = rs.getInt("price");
		    	String description = rs.getString("description");
				
				dto = new BookDTO(code, title, writer, price, description);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return dto;
	}

	public boolean insert(BookDTO insertDto) {
		boolean flag = false;
		try {
			con = getConnection();
			String sql = "INSERT INTO booktbl(code,title,writer,price,description) ";
			sql += "VALUES(user_seq.NEXTVAL, ?,?,?,?,?)";			
			pstmt = con.prepareStatement(sql);
		
			pstmt.setInt(1, insertDto.getCode());
			pstmt.setString(2, insertDto.getTitle());
			pstmt.setString(3, insertDto.getWriter());
			pstmt.setInt(4, insertDto.getPrice());
			pstmt.setString(5, insertDto.getDescription());
			
			int count = pstmt.executeUpdate();
			
			if(count>0) {
				flag = true;
				commit(con);
			}
			
		} catch (Exception e) {
			rollback(con);
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	
	
	
	
	
	
	
	
	

}
	
	
	

