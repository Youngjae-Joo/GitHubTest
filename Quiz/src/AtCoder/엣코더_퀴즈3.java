package AtCoder;

import java.util.Scanner;

public class 엣코더_퀴즈3 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String row = scan.nextLine();
		int n = Integer.parseInt(row);
		
		
		int result=0;
		if(n>=42) {
			result=n+1;
		}else {
			result+=n;
		}
		
		
		
		
		System.out.printf("AGC%03d",result);
		
	}

}
