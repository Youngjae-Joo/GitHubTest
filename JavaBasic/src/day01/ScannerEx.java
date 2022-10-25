package day01;
import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in); //입력을 받고, 스캐너에 전달하겠다.
		
		/*
		 * next(), nextLine(), nextInt(), nextDouble()
		 * 문자, 공백포함문자, 정수, 실수
		 * 
		 * scan.next();를 입력하면 커서가 깜빡이고 이때 입력한 값이 next에 저장된다.
		 * 그 후 앞에 String이나 int등을 사용해 next에 입력된 값을 다른 곳에 저장한다.
		 * 다음, System.out.print("입력">);을 이용해 입력한 값을 받음
		 * 그후 다시 System.out.println();을 사용해 출력
		 * 마지막으로 scan.close();를 통해 닫는다.
		 * 
		 */
		
		
		System.out.print("이름>");
		String name = scan.next(); //문자열을 입력받고 name변수에 저장
		
		System.out.print("나이>");
		 int age = scan.nextInt();
	
		System.out.println("입력된이름:" + name);
		System.out.println("입력된나이:" + age);
		
		scan.close(); //스캐너 자원 끝! (단, 닫으면 이후에 scanner 사용 못함)
	}

}
