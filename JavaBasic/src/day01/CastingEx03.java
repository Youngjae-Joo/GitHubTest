package day01;

public class CastingEx03 {

	public static void main(String[] args) {
		
		
		//연산에서의 형변환
		char c ='C'; //그냥 c를 출력하면 C가 나오지만, int문과 연산하여 출력할 경우 67로 인식한다
		int i = 2;
		
		System.out.println(c + i); //69
		//1. 서로 다른 타입의 연산에서는 큰타입을 따라갑니다.
		char cc= (char)(c + i);
		int ii = c + i;
		System.out.println(cc); //E char로 캐스팅했기 때문
		System.out.println(ii); //69 캐스팅하지 않았고, int와 char의 연산이므로 69가 나오는 것
		
		int j = 10;
		double d = 3.14;
		double result = j + d; //실수랑 붙으면 실수가 됨
		System.out.println(result);
		
		//2. int형보다 작은 타입의 연산의 결과는 int가 됩니다.
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);
		int b4 = b1 + b2;
		System.out.println(b3); //byte로 캐스팅하지 않으면 오류 발생
		System.out.println(b4);
		
		short s1 = 100;
		byte s2 = 10;
		short s3= (short)(s1 + s2);
		System.out.println(s3);
		
		
		
	}
	
}
