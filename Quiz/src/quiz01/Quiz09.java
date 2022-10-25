package quiz01;
import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		//두 수를 입력받습니다.
		//두 수 사이의 합을 구하세요
		//10 13 -> 10 11 12 13
		//13 10 -> 13 12 11 10
		

		// 1. 큰수 작은수 비교
		// 2. 작은수~큰수 반복
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수1>");
//		int a = scan.nextInt();
//		
//		System.out.print("정수2>");
//		int b = scan.nextInt();
//
//	
//		int max = a > b ? a : b; // 항상 큰수
//		int min = a > b ? b : a; // 항상 작은수
//		
//		int sum = 0;
//		 while(min <=max) {
//			 
//			 sum +=min;
//			 min++;
//		}
//		 System.out.println(sum);
		 
	System.out.println("------------");
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("정수1>");
	int a = scan.nextInt();
	
	System.out.print("정수2>");
	int b = scan.nextInt();
	
	
	int sum = 0;
	if(a>b) {
		
		while(b<=a) {
			sum += b;  
			b++;
		} 
	} else if(a<b) {
		
		while(a<=b) {
			sum +=a;
			a++;
		}
	}else {
		sum = a + b;
	}
	
	System.out.println(sum);
	
	scan.close();
	
	}
}
