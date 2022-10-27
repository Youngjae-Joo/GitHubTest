package java_DTO.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class SerializableMain {
	public static void main(String[] args) {
		
		//인스턴스 단위에 파일에 기록할 수 있는 객체를 생성
		try (ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("multiobject.txt"))){//이렇게하면 close()호출할 필요 없음.
			
			//기록할 인스턴스 생성
			DTOTestEx dto1 = new DTOTestEx(1, "아담", new Date());
			DTOTestEx dto2 = new DTOTestEx(2, "강진축구", new Date());
			
			
			//기록할 인스턴스가 여러개이므로 하나의 List로 묶어줍니다
			ArrayList<DTOTestEx> list = new ArrayList<>();
			list.add(dto1);
			list.add(dto2);
			
			//기록
			oos.writeObject(list);//write는 한번만에 해야 함. 데이터는 하나. 파워포인트를 열 때 여러 개의 파워포인트를 열기 위해 파워포인트앱을 여러번 클릭하진 않음. 
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try(//인스턴스 단위에 파일에 읽어낼 수 있는 객체를 생성
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multiobject.txt"))) {
			
			
			//기록을 할 때 List를 사용했으므로 읽어올 때 List로 읽어와야 합니다.
			ArrayList list = (ArrayList)ois.readObject();//형변환
			for(Object obj : list) {
				System.out.println(obj);
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
