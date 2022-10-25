package quiz01;
import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		//for~~>
		//1. 7~100까지 정수 중의 7의 배수를 가로로 출력
		for(int a = 7; a<=100; a+=7) { //더 간단하게 푸는 법
			
			System.out.print(a+ " ");
		}
		System.out.println();
//		for(int a=7;a<=100;a++) {
//			if(a%7==0) {
//				System.out.print(a+" ");
//			}
//		}
//		System.out.println();
		
		//2. 1~200까지 정수주의 9의 배수의 개수를 출력
		int count=0;
		for(int b=1;b<=200;b++) {
			if(b%9==0) {
				count++;
			}
		}
		System.out.println(count);
		//3. 50~100까지 두 수 사이의 합
		int sum = 0;
		for(int c=50;c<=100;c++) {
			sum+=c;
		}
		System.out.println(sum);
		
		//4.char변수를 활용해서 A~Z까지 출력 A=65, Z=90
		for(char c= 'A';c<='Z';c++) { //바로 char로 시작해버리기. char값에는 아스키코드 숫자값이 있음
			System.out.print(c+" ");
		}
//		for(int d =65;d<=90;d++) {
//			char e =(char)d;
//			System.out.print(e+" ");
//		}
		//5.어떤수를 입력받아서 입력받은 수의 구구단 출력.
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("정수>");
		int f=scan.nextInt();
		System.out.println("구구단 "+ f+"단");
		
		for(int g=1;g<=9;g++) {
			System.out.println(f +" x "+g+" = "+f*g);
		}
			scan.close();
		
	}
}
