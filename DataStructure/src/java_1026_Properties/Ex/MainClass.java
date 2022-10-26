package java_1026_Properties.Ex;

import java.io.FileOutputStream;
import java.util.Properties;

public class MainClass {
	public static void main(String[] args) {
		//프로퍼티스 인스턴스 생성
		Properties properties = new Properties();
		//없는 key를 사용하면 null이 리턴
		System.out.println(properties.getProperty("name"));
		
		//프로퍼티스에 프로퍼티를 저장
		properties.setProperty("아담", "한국 최초의 사이버 가수");
		properties.setProperty("강진 축구", "세계 최초의 온라인 축구 게임");
		properties.setProperty("프리스톤테일", "한국 최초의 자체 3D 엔진 MMORPG");
		
		System.out.println(properties.getProperty("프리스톤테일"));
		
		//텍스트 파일로 저장
		//자바는 예외처리를 강제할 경우가 있음. =>자바가 만들지 않은 걸 쓸때. 파일-운영체제/웹서버 or 다른 컴퓨터와 통신/데이터베이스 작업 할 때.
		//예외가 발생했을 때는 알림이 가야 함.
		try {
			//현재 작업 디렉토리에 파일로 저장
			//git에 연결되어 있으면 workspace가 아니고 c 드라이브-사용자 디렉토리-자신 계정-git 디렉토리에 있음
		properties.storeToXML(new FileOutputStream("./myproject.xml"), "xml로 저장");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
