package day02;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		//IfEx02와 동일하게 실행되도록
		//switch구문으로 변경.
		//100은 생각하지말고~
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수>");
		int point = scan.nextInt();
		
		String grade = null;
		
						
		switch (point/10) {
		case 9:
			if(point>=95) {
				grade = "A+";
			} else {
				grade = "A";
   			} 
			break;
		case 8:
			 grade = "B";
			break;
		case 7:
			 grade = "C";
			break;
		case 6:
			 grade = "D";
			break;
			
		default:
			 grade = "F";
			break;
		}
		System.out.println(grade);
		scan.close();
	}
	
}
