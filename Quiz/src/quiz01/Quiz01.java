package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); //13
		System.out.println(x+=2); //5
		System.out.println( !('A' <= c && c <='Z') ); //f char도 숫자값을 가지고 있기 때문에 계산 가능. 비교연산자, 논리연산자는 boolean으로 나옴
		System.out.println('C'-c); //2 연산들어감-int로 
		System.out.println(c+1); //66 연산들어감-int로
		System.out.println(++c); //B c는 char로 변수선언되어있다. 이항연산이 아닌 문자형 c값에 하나를 증가하는 것! ++c이기 때문에 변환되서 출력
		System.out.println(c++); //B c는 char로 변수선언되어있다. 이항연산이 아닌 문자형 c값에 하나를 증가하는 것! c++이기 때문에 출력 후 변환
		System.out.println(c);  //C c++로 인해 변경되었음

		
		
		
		
		
		
		char f = 'D';
		System.out.println(f-20); //char가 숫자값을 가지고 있기 때문에 계산이 되었음. 연산이기 때문에 int값에 따라 48이 출력됨
		System.out.println(f<=67); //비교연산이기 때문에 boolean값인 false가 나온다.
		
		
		
		
		
		
	}
}
