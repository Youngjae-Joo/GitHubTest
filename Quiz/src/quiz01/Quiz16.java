package quiz01;
import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		
		/*
		 * 정수형태로 입력을 2개 받습니다.
		 * 첫번째=가로길이, 두번째=세로길이
		 * 
		 *입력받은 가로,세로 길이의 사각형을 출력하면 됩니다.
		 *단, 윤곽만 출력합니다. 
		 *
		 *힌트->1행, 마지막행, 1열, 마지막열만 출력, 공백도 문자임
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int a = scan. nextInt();
		System.out.print("세로>");
		int b = scan. nextInt();
		
		for(int i=1;i<=b;i++) {//열 개수(세로)만큼 반복해서 가로를 만들겠다 
			
			 //열이 1열 번호이거나 마지막열 번호이면 가로로 *이 쫙
			if(i==1||i==b) {                                     
				for(int j=1;j<=a;j++) {		//가로만큼 *이 쫙
					System.out.print("*");
				}
				System.out.println();	//열번호 하나의 가로를 만들었으니 줄바꿈
				
				
				
				//열이 가운데일때, 즉 공백이 들어가야 할 때
			} else {                                             
				for(int j=1;j<=a;j++) {		//가로만큼 *과 공백 넣기
					if(j==1||j==a) {   		//행(가로) 첫번째와 마지막은 *.
						System.out.print("*");
					}else { 				//행(가로)의 중간은 공백
						System.out.print(" ");
					}
				}
				System.out.println(); //열 하나의 가로를 만들었으니 줄바꿈
			}
				
				
		
//
//	int w = scan.nextInt();
//	int h = scan.nextInt();
//
//	for(int i=1;i<=h;i++) { //세로(행)
//	
//		for(int j=1;j<=w;j++) { //가로(열)
//			
//			if(i ==1 || i ==h || j ==1||j==w) { //1행,마지막행,1열,마지막열
//				System.out.print("*");
//			} else {
//				System.out.print(" ");
//			}
//
//			
//	}
//		System.out.println();
//} //가로세로를 "좌표"개념으로 생각하기! (n,m)로 생각하면 1이 들어가는 곳에 다 *을 넣어버리면 된다. 
	}
 }
}
	
