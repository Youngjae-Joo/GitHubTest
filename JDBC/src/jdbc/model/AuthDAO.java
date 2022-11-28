package jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AuthDAO {
	/*DAO클래스
	 *데이터베이스에 연결했다 처리하고 연결했다 처리하고 하는 역할
	 *멤버변수를 이용하여 필요한 값 가져오기 
	 *sql문들을 메서드로 표현 
	 *
	 *1개의 테이블에 대해서 하나의 클래스가 나옴
	 *
	 */

	//멤버변수
	private String url=MainClass.URL; //주소
	private String uid=MainClass.UID; //계정
	private String upw=MainClass.UPW; //비밀번호 

	//메서드화
	public int insertEx(String name, String job) {
		int result = 0;

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
			pstmt.setString(1, name);			
			pstmt.setString(2, job);

			//4. sql 실행(select문은 query문장 실행, i , d, u문은 update메서드로 실행)
			result=pstmt.executeUpdate();//성공실패 반환


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
		return result;
	}


	//조회메서드
	/*
	 *VO or DTO클래스 사용
	 *멤버변수에 sql조회한 데이터를 하나하나 담아서 전달하는 용도로 사용.
	 * 
	 */
	public ArrayList<AuthVO> selectEx(){
		ArrayList<AuthVO> list = new ArrayList<>();
		
		
		String sql = "select * from auth order by auth_id desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //select결과를 반환받을 객체

		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//connection
			conn = DriverManager.getConnection(url, uid, upw);

			//stmt
			pstmt = conn.prepareStatement(sql);

			//sql실행
			rs = pstmt.executeQuery();


			while(rs.next()) { //다음 row가 있으면 true를 반환. row만큼 반복문 실행

				//한 행에 대한 처리(getInt, getString, getDouble, getTimestamp, getDate)
				int auth_id=rs.getInt("auth_id");
				String name = rs.getString("name");
				String job = rs.getString("job");

				//vo에 행 데이터 저장
				//vo를 list에 저장
				AuthVO vo = new AuthVO(auth_id, name, job);
				list.add(vo);
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

		return list;
	}





}
