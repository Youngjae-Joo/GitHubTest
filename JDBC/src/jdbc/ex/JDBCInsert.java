package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsert {
	
	public static void main(String[] args) {
		
		//insert
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";//주소
		String uid="hr";//계정
		String upw="hr";//비밀번호
		
		//String sql="insert into auth values(?,?,?)";
		//첫번째 물음표 안에 들어가는 건 시퀀스 값
		String sql="insert into auth values(seq_auth.nextval,?,?)";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//connection
			conn =DriverManager.getConnection(url, uid, upw);
			
			//statement 객체
			pstmt=conn.prepareStatement(sql);
			
			//3. ?값 세팅- 첫번째부터 1번 순서
			pstmt.setString(1, "홍길동");			
			pstmt.setString(2, "프로그래머");
			
			//4. sql 실행(select문은 query문장 실행, i , d, u문은 update메서드로 실행)
			int result=pstmt.executeUpdate();//성공실패 반환
			
			if(result==1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("close에러");
			}
			
			
		}
		
		
	}

}