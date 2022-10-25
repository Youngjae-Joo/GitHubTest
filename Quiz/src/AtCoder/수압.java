package AtCoder;

import java.util.Scanner;

public class 수압 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		int d = Integer.parseInt(row);
		
		double result =(double)d/100;
		System.out.println(result);
		scan.close();
		
	}

}
