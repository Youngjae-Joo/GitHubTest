package quiz01;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//키가 140이상이고, 나이가 8세 이상이라면 탑승가능, 아니라면 탑승불가능
		/*
		 * 키와 나이를 입력하세요
		 * 키(실수)>160
		 * 나이(정수)>50
		 * 놀이기구 탑승이 가능합니다
		 * 놀이기구 탑승이 불가능합니다
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키(실수)>"); //println을 하면 아래줄에 입력을 하게 된다. 여기는 print를 사용해야 함
		double a = scan.nextDouble();
		
		System.out.print("나이(정수)>");
		int b = scan.nextInt();
		
		if(a >=140 && b >=8) {          //&&든 &든 잘 돌아가지만, 대체로 &&를 쓰는 게 좋다.
			System.out.println("놀이기구 탑승이 가능합니다");
		} else {
			System.out.println("놀이기구 탑승이 불가능합니다");
		}
		
		 scan.close();
		 
		 
		 
		
		
		
	}
	
}
