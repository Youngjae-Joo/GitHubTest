package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelect {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";//주소
		String uid="hr";//계정
		String upw="hr";//비밀번호
		
		
		String sql = "select * from auth order by auth_id desc";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		//select는 조회해서 데이터를 가져온다. 저장 객체 필요
		ResultSet rs = null; //select결과를 반환받을 객체
		
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//connection
			conn = DriverManager.getConnection(url, uid, upw);
			
			//stmt
			pstmt = conn.prepareStatement(sql);
			
			
			//? 가 있으면 값에 대한 처리를 하고, 없으면 넘어감. 여기선 생략
			
			
			//sql실행
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) { //다음 row가 있으면 true를 반환. row만큼 반복문 실행
				
				//한 행에 대한 처리(getInt, getString, getDouble, getTimestamp, getDate)
				int auth_id=rs.getInt("auth_id");
				String name = rs.getString("name");
				String job = rs.getString("job");
				
				System.out.println("번호:"+auth_id+" ,이름:"+ name+" ,직업:"+job);
				
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
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
