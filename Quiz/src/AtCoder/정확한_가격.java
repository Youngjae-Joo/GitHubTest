package AtCoder;

import java.util.Scanner;

public class 정확한_가격 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		int x=Integer.parseInt(row);
		
		if(x<100) {
			System.out.println("No");
		}else if(x%100==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
	}

}
