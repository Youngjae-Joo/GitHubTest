package AtCoder;

import java.util.Scanner;

public class 이상한_함수 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		int t=Integer.parseInt(row.split(" ")[0]);
		int result=이상한_함수.f(이상한_함수.f(이상한_함수.f(t)+t)+이상한_함수.f(이상한_함수.f(t)));
		
		System.out.println(result);
		
	}
	
	public static int f(int x) {
		return x*x+2*x+3;
	}

	
}
