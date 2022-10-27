package java_1027.fileinformation;

import java.io.File;
import java.util.Date;

public class FileMain {
	public static void main(String[] args) {
		//파일에 대한 정보 확인
		try {
			// File 인스턴스 생성
			//windows에서는 디렉토리 구분 기호가 \인데,
			//프로그래밍 언어에서는 \가 오고 하나의 문자가 오면 제어문자로 인식
			// \를 입력하고자 할 때는 \\로 2번 해야 함. 
			File f = new File("C:\\Users\\user\\Desktop\\수업폴더\\자바 1회차.txt");
			
			//파일의 존재 여부 확인
			System.out.println(f.exists());//있으면 true, 없으면 false
			//마지막 수정 날짜
			System.out.println(f.lastModified());//어떤 숫자가 나옴. 이걸 Date의 객체로 만들면 날짜를 알 수 있다.
			System.out.println(new Date(f.lastModified()));
			
			
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
		
		
	}
}
