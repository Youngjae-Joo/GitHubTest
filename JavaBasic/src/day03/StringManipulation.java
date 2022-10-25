package day03;

import java.util.Arrays;

public class StringManipulation {
	public static void main(String[] args) {
		
		//문자열 다루기
		//컴퓨터는 char[]={a,a,a};를 하나씩 붙여서 aaa로 나타냄
		//String str = new String(new char[] {'A', 'B', 'C'});
		//System.out.println(str);
		
		String str = "안녕하세요~";
		//문자열의 길이를 확인
		//System.out.println(str.length());
		int len = str.length();
		System.out.println(len);
		
		//문자열을 한글자 자르기
		char c = str.charAt(5);//str.charAt(0);-안
		System.out.println(c);
		
		//문자열의 위치 확인 indexOf, lastIndexOf-찾은 문자의 위치 반환. 문자열의 첨부터 or 끝부터 찾음. 나오는 index는 같다
		int a =str.indexOf("녕");
		System.out.println("찾은위치:"+a);
		int b =str.lastIndexOf("녕");
		System.out.println();
		System.out.println("찾은위치:"+b);
		int d =str.indexOf("sdf");
		System.out.println("찾은위치:"+d); //찾은 결과가 없으면 -1 출력. if(str.intdexOf("~")) != -1 뜻은 문자열이 안에 있다는 뜻
		
		//문자열 변경 -replace
		String e = str.replace("안", "헐");//앞은 찾을 문자, 뒤는 변경할 문자. 안->헐(전부다)
		System.out.println(e);
		System.out.println(str); //위에도 전부 새로운결과를 출력한 것. 원본 문자는 그대로 유지되어 있다! 원본은 바뀌지 않음!
		
		//대소문자 변경 toUpperCase, toLowerCase 그런데, 전부 바뀜. 단 원본은 유지
		str = "abcDeFg";
		String f = str.toUpperCase();
		System.out.println(f);
		
		//공백제거 trim or replace
		str = "   010-1234-5678    ";
		String g = str.trim();
		System.out.println(g); //앞뒤 공백제거 사이에 있는 공백은 제거 못함
		
		
		str = " 안 녕 하 세 요 개 천 절 날 은 쉽니다  ";
		String h = str.trim();
		System.out.println(h);
		
		String i =str.replace(" ","");
		System.out.println(i); //모든공백 제거
		
		//String.valueOf() -> 기본타입을 문자로 변경
		System.out.println(String.valueOf(10) + 20);//10을 문자로 바꾸어 전체를 문자열로 바꿈. 
													//System.out.println(""+10+20);하면 문자열로 변경됨
		
		
		//문자열 자르기★
		//substring-인덱스 기준으로 자름
		//split -특정문자 기준으로 잘라서 배열로 담아줌. 많이 쓴다. split은 String배열로,
		//toCharArray  toCharArray는 char배열로
		
		str="010-1234-5678";
		String j = str.substring(3); //인덱스 미만 절삭
		System.out.println(j);
		
		String k = str.substring(2, 6);//인덱스 이상 ~ 인덱스 미만 추출
		System.out.println(k);
		
		String[] arr= str.split("-");//""를 넣으면 하나하나씩 잘라줌
		System.out.println(Arrays.toString(arr));
		
		char[] arr2=str.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		
		
		
	}
}
