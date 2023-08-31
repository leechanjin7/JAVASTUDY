package Ch23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C01DBConn {
	
	public static void main(String[] args) {
		
		//DB연결정보 저장용 변수
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql:localhost:3306/tmpdb";
		
		//JDBC참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Sucess..");
			conn = DriverManager.getConnection(url, id,pw);
			System.out.println("DB Connected..");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
