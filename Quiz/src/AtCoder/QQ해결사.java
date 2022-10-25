package AtCoder;

import java.util.Scanner;

public class QQ해결사 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		int a=Integer.parseInt(row.split("")[0]);
		int b=Integer.parseInt(row.split("")[2]);
		
		int result=a*b;
		System.out.println(result);
		scan.close();
	}

}
