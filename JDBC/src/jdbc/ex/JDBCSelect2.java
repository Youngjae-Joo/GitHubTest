package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCSelect2 {
	public static void main(String[] args) {
		/*
		 * 사원수를 입력받습니다.
		 * 
		 * employees, department테이블에서 부서별 사원수가 입력받은 사원수 보다 큰 데이터를 select
		 * 
		 * 조건
		 * 1.출력할 컬럼은 부서명, 사원수, 부서아이디
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사원수>");
		int num = scan.nextInt();
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";//주소
		String uid="hr";//계정
		String upw="hr";//비밀번호
		
		String sql = "select d.department_id, \r\n"
				+ "		d.department name, \r\n"
				+ "		a.total \r\n"
				+ "from department d \r\n"
				+ "inner join (select department_id, \r\n"
				+ "			count(*) total \r\n"
				+ "			from employees \r\n"
				+ "			group by department_id) a \r\n"
				+ "on d.dpartment_id=a.department_id \r\n"
				+ "where total > ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
			
			//?값에 대한 처리
			pstmt.setInt(1, num);
			
			
			//sql 실행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("department_id");
				String name = rs.getString("department_name");
				int total = rs.getInt("total");
				
				System.out.println(id);
				System.out.println(name);
				System.out.println(total);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				System.out.println("close 에러");
			}
		}
	}
}
