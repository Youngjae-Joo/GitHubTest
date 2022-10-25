package quiz01;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		//입력 3개
		//결과 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수1>"); //a
		int a = scan.nextInt();
		
		System.out.print("연산을 선택하세요[+,-,*,/]>");
		String b = scan.next();
		
		System.out.print("정수2>"); //c
		int c = scan.nextInt();
	
		
		
		switch(b) {
		case"+":
			System.out.println("두 수의 덧셈은: " + (a+c)); //소괄호를 쳐주어야 계산. 안하면 문자열로 나옴
			break;
		case"-":
			System.out.println("두 수의 뺄셈은: " + (a-c)); 
			break;
		case "*":
			System.out.println("두 수의 곱셈은: " + (a*c)); 
			break;
		case "/":
			System.out.println("두 수의 나눗셈은: " + (a/c)); 
			break;
		default:
			System.out.println("[+, -, *, /]를 입력하세요");
			break;
		}
		
		scan.close();
	}
}
