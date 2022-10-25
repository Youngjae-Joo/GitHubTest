package quiz01;
import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		
	
//		int a = 1;
//		while(a<=20) {
//			
//			System.out.println(a + "번 학생의 출석을 체크");
//			a++;  //증감은 마지막에 있어야 한다.
//			
//		}
		
		/*
		 * 정수를 입력받아서 
		 * 입력받은 값에 대한 구구단을 출력.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int n = scan.nextInt();
		System.out.println("구구단:"+ n +"단");
		
		int i =1;
		while(i<=9) {
			
			
			//System.out.println(	n + " x " + i + " = " + (n*i));
			System.out.printf("%d x %d = %d\n", n, i, n*i);
			i++;
		}
		
		scan.close();
		
		
	}
}
