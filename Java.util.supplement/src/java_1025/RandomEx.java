package java_1025;

import java.util.Random;
import java.util.UUID;

public class RandomEx {
	public static void main(String[] args) {
		//seed를 사용하지 않는 경우와 사용하는 경우의 차이
		//여러번 실행해보고 확인
		
		//java에서는 seed를 설정하지 않으면 seed가 랜덤
		Random r= new Random();
		System.out.println(r.nextInt());//실행할 때마다 바뀜
		
		//seed를 설정하면 고정된 패턴의 숫자가 리턴
		r= new Random(42);
		System.out.println(r.nextInt());//계속 실행해도 그대로
		
		//배열 내에 존재하는 요소만 랜덤하게 추출
		r = new Random();
		String[] ar = {"오미크론","오미크론","오미크론","다크스펙터","다크스펙터","라투"};
		for(int i=0;i<10;i++) {
			System.out.println(ar[r.nextInt(ar.length)]);
		}
		
		//랜덤한 문자열 추출
		System.out.println(UUID.randomUUID().toString());
		
		
		
		
	}

}
