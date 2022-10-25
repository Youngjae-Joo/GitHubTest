package day01;

public class TypeInteger {

	public static void main(String[] args) {

		//byte, short, int, long
		byte a = 127; 
		byte b = -128;

		short c = 32767;
		short d = -32768;

		int e = 2147483647;
		int f = -2147483648;

		long g = 1231231213212123123L; //long은 L을 붙여 Long타입임을 지정시켜 줘야 한다. 4byte(int-기본채택)가 아닌 8byte임을 알려주기 위해
		System.out.println(g);

		/* 참고
		 * 2진수 저장할때는 0b를 붙임
		 * 8진수 저장할때는 0을 붙임
		 * 16진수 저장할때는 0x를 붙임
		 */

		int bin = 0b1010; //2진수
		int octa = 064; //8진수
		int hexa = 0xAC00; //16진수

		System.out.println("이진수 1010은:" + bin + "입니다"); //+로 문자열과 숫자를 붙임
		System.out.println("팔진수 64는:" + octa + "입니다");
		System.out.println("십육진수 AC00은:" + hexa + "입니다"); //A가 10 B가 11 C가 12...

		System.out.println("-------------------------------");

		float f1 = 3.14F;//float을 나타낼때는 f를 붙임. 마찬가지로 double이 기본채택이기 때문
		double d1 = 3.14;

		float f2 = 3.1415923333F; //7자리까지 유효함 (소수부분) -신뢰도가 7자리까지임
		double d2 = 3.1415923333; //15자리까지 유효함 신뢰도가 -15자리까지임

		System.out.println(f2);
		System.out.println(d2);

		System.out.println("-----------------------");
		//e표기법
		float f3 = 314.15e-2F; //e-2는 10^-2를 의미한다. 
		double d3 = 0.031415e2; //e2는 10^2를 의미한다.

		System.out.println(f3);
		System.out.println(d3);
		
		System.out.println("------------------------");
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		

	}

}
