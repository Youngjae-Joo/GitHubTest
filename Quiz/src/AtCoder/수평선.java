package AtCoder;

import java.util.Scanner;

public class 수평선 {
	public static void main(String[] args) {
		//수평선
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		double h =Integer.parseInt(row);
		
		double result =Math.sqrt(h*(12800000+h));
		
		System.out.printf("%.9f",result);
		
		
		scan.close();
	}
}
