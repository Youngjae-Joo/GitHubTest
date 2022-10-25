package day10.exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {
	public static void main(String[] args) {
		
		//입력과 예외처리
		//0을 입력하기 전까지 숫자를 입력.
		
		
		
		Scanner scan = new Scanner(System.in);//반복오류가 난 이유는 scan.nextInt();가 받은 개행문자(enter)를 제거하지 않았기 때문. 원래 입력받으면 5 에서 5뒤의 엔터를 지우고 5만 받음. 엔터는 남아있다고 판단함
		while(true) {
			
			try {
				System.out.print(">");
				int num = scan.nextInt();//정수를 받음
				//int num = Integer.parseInt(scan.nextLine());//이러면 엔터를 포함해서 다 받음. 오류가 나도 엔터값을 포함해서 다시 받음. 그리고 제거함.
				if(num==0) break;
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
				scan.nextLine();//엔터개행을 제거, 그리고 다시 돌면서 nextInt로 돌아옴
				
				 
			}
			
			
			
		
		}
		
		
		
	}

}
