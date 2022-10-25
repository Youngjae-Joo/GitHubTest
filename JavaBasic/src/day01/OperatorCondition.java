package day01;

public class OperatorCondition {

	public static void main(String[] args) {
		//프로그램에서 랜덤한 값은 유효한 의미를 가집니다.
		//System.out.println( Math.random() ); //0이상~1.0미만 랜덤값 출력
		//유효한 정수 랜덤값 1~10
		
		int num = (int)(Math.random() * 10) + 1;
		System.out.println(num); //1~10
								//0~100을 원하면 101을 곱하고, 1~100을 원하면 100을 곱한 뒤 1을 더한다
		
		//랜덤값이 3의 배수인지 아닌지를 검사
		String result = num % 3 == 0 ? "3의배수" : "3의배수가 아님";
		System.out.println(result);
		
		System.out.println("------------------");
		/*
		 * 1~100까지 랜덤한 정수를 생성
		 * 짝수 or 홀수인지 결과를 출력.
		 */
		
		int num2 = (int)(Math.random() * 100) + 1; 
		System.out.println(num2);
		String result2 = num2 % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result2);
		System.out.println(num2 % 2 == 0 ? "짝수" : "홀수"); //출력값이 바로 나온다. String으로 캐스팅하지 않아도
		
		System.out.println("------------------");
		/*
		 * -5~5까지 랜덤한 정수를 생성 (0~10) -5
		 * 어떤 정수가 나오든 절대값으로 출력하세요. (양의 정수로)
		 */
		
		int b = (int)(Math.random() * 11) -5;
		System.out.println(b);
		System.out.println(b < 0 ? -b : b);
		
	}
	
}
