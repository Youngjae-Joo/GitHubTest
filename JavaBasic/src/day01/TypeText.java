package day01;

public class TypeText {
	
	public static void main(String[] args) {
		
		//단일문자를 저장하는 char
		char c1 = 'A';
		char c2= 65;
		
		System.out.println(c1);
		System.out.println(c2); //출력시 둘 다 A. 왜? char는 문자를 저장하고, A는 65라는 숫자값을 가짐
		//아스키코드 ->유니코드의 등장으로 2byte로 확장되고 부호없는 비트값 65536개의 문자를 표기
		
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00'; //백슬래시u는 유니코드를의미
		
		System.out.println(c3 + "-" + c4 + "-" + c5);
		
		String s1 = "hello";
		String s2 = " world"; //공백도 문자로 인식됨 
		
		//문자열은 +로 연결하면 붙인 결과를 가져옵니다.
		System.out.println(s1 + s2);
		//문자열의 길이를 확인 length()
		System.out.println(s1.length()); //5
		//문자열과 다른 타입의 + 연산
		System.out.println(100 + 200); //300
		System.out.println("100" + 200); //100200 문자열에 다른 타입이 붙으면 ->결과는 문자열!
		System.out.println(100 + 200 +"world"); //300world->얘도 문자열
		System.out.println("hello" + 100 + 200); //hello100200-> 문자열 hello100 + 200이 되어서 문자열 hello100200이 된다. 문자열은 가장 강한 타입
		
		//??
		System.out.println("A" + 10); //A10
		System.out.println((char)('A' + 10)); //k
		
	}

}
