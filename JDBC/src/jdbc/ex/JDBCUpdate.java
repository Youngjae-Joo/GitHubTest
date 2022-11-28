package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCUpdate {
	public static void main(String[] args) {

		//Scanner로 auth_id, name, job을 입력받아서 해당 auth_id의 name, job을 업데이트하는 구문

		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int auth_id=scan.nextInt();
		System.out.print(">");
		String name =scan.next();
		System.out.print(">");
		String job=scan.next();

		//변수 선언
		String url="jdbc:oracle:thin:@localhost:1521:xe";//주소
		String uid="hr";//계정
		String upw="hr";//비밀번호

		String sql = "update auth set name = ?, job = ? where auth_id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//connection
			conn =DriverManager.getConnection(url, uid, upw);
			//statement 객체
			pstmt=conn.prepareStatement(sql);

			//3. ?값 세팅- 첫번째부터 1번 순서
			pstmt.setString(1, name);//str타입	
			pstmt.setString(2, job);//str타입
			pstmt.setInt(3,auth_id);//number타입

			//sql실행
			int result =pstmt.executeUpdate(); // 1 or 0 
			
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
			} catch (Exception e2) {
				System.out.println("close 에러");
			}
		}
	}
}
