package java_1027.fileinformation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class FileInOutputStream {
	public static void main(String[] args) {
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\" + sdf.format(date)+".bat", true);//로그 기록-절대경로
			
//			String file = UUID.randomUUID().toString();
//			
//			FileOutputStream fos2= new FileOutputStream("./" + file+".txt", true);//로그 기록-상대경로, 랜덤한 문자열 파일이름
//			
			//기록할 메시지 생성
			String msg = " msg %username% Hi \n";
			
			//파일에 기록
			fos.write(msg.getBytes());
			
			//파일을 닫기
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 기록 실패");//경로에 디렉토리가 없으면 실행.
			System.out.println(e.getLocalizedMessage());//지정된 경로를 찾을 수 없습니다 출력-어떤 문제가 생겼는지를 확실히 알 수 있음
			
			
		}
		
		
		//앞에서 작성한 파일 읽기
		try {
			//읽기위한 파일 생성
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\2022-10-27.bat");
			//읽어서 저장할 바이트 배열을 생성
			byte[] b = new byte[fis.available()];
			//읽기
			fis.read(b);
			//읽은 내용 확인
			System.out.println(new String(b));
			System.out.println(Arrays.toString(b));//아스키코드값으로 출력
			
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			
			
		}
		
		
		
	}

}
