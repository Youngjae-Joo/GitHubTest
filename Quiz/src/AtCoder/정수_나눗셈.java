package AtCoder;

import java.util.Scanner;

public class 정수_나눗셈 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row =scan.nextLine();
		
		Long x =Long.parseLong(row);
		
		if(x>0) {
			System.out.println(x/10);
		}else if(x==0) {
			System.out.println(x);
		}else if(x<0&&x%10==0) {
			System.out.println(x/10);
		}else {
			System.out.println(x/10-1);
		}
		
		
		
	}

}
