package AtCoder;

import java.util.Scanner;

public class 타이어 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		
		if(row.substring(row.length()-2, row.length()).equals("er")) {
			System.out.println("er");
		}else if(row.substring(row.length()-3, row.length()).equals("ist")) {
			System.out.println("ist");
		}
	}

}
