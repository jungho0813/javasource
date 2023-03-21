package database;

import java.sql.Connection;
import java.sql.DriverManager;

/* JDBC
 * 자바에서 데이터 베이스에 접속할 수 있도록 제공해주는 자바 api
 * 
 * 프로젝트에 ojdbc8.jar 포함
 * [build path] = [configure build path] = class path에 ojdbc8.jar 포함
 * 
 * C:\Users\jh095\OneDrive\Desktop\sqldeveloper\jdbc\lib
 * 
 */

public class Connect {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			// jdbc:oracle:thin:@ : 고정
			// localhost:1521:xe  : 유동주소
			// localhost : 내 컴퓨터
			// 1521 (기본 포트번호)
			// xe (기본 sid 이름)
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				System.out.println("연결되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
