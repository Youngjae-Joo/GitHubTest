package AtCoder;

import java.util.Scanner;

public class 네_자리 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		int result = Integer.parseInt(row);
		System.out.printf("%04d",result);
		scan.close();
	}

}
