package api.lang.string;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		
		String s = "홍길동";
		
		char a=s.charAt(0);
		System.out.println(a);
		
		//"길" 문자를 찾으면 위치반환, 못찾으면 -1반환
		int index = s.indexOf("길");
		System.out.println("길 위치:"+index);
		
		//replace - 원본문자는 유지
		String result =s.replace("길", "");//CharSequance-인터페이스, String이 상속받고 있음.->상속이니 저장가능->String타입 사용가능
		System.out.println("결과:"+result);
		System.out.println("원본문자열:"+s);
		//원본을 바꾸려면 s=s.replace("길","");
		
		//substring -문자열 자르기
		String s2 ="오늘은 날씨가 추워요";
		String result2=s2.substring(4);//절삭
		System.out.println(result2);
		
		String result3=s2.substring(4,7);//추출
		System.out.println(result3);
		
		//trim-앞뒤공백제거
		System.out.println("  홍길동 ".trim());
		
		//split - 문자열 자르기
		String[] result4 = s2.split(" ");
		System.out.println(Arrays.toString(result4));
		
		//매개변수 2개 주면 배열의 크기 제한
		String[] result5="010-1234-3456".split("-", 2);//뒤의 숫자는 자를 수 있는 맥시멈 값
		System.out.println(Arrays.toString(result5));
		
		//contains -boolean값으로 받음. 문자열 포함여부
		if(s.contains("홍")) {
			System.out.println("홍 이 포함됨");
		}
		
		
		String result6 = String.copyValueOf(new char[] {'a', 'b', 'c'});
		System.out.println(result6);
		
		String result7 = String.valueOf(3);
		System.out.println(result7);
		
		
		
		
	}

}
