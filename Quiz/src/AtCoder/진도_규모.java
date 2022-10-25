package AtCoder;

import java.util.Scanner;

public class 진도_규모 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row=scan.nextLine();
		
		int a =Integer.parseInt(row.split(" ")[0]);
		int b =Integer.parseInt(row.split(" ")[1]);
		
		int result=1;
		for(int i=1;i<=a-b;i++) {
			result*=32;
		}
		
		System.out.println(result);
		
	}

}
