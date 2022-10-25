package AtCoder;

import java.util.Scanner;

public class 반올림_소수 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		float a = Float.parseFloat(row);
		
		
		int result = Math.round(a);
		System.out.println(result);
		scan.close();
		
	}

}
