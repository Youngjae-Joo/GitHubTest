package AtCoder;

import java.util.Scanner;

public class 오버플로우_not {
	public static void main(String[] args) {
		//오버플로우 내지 않기

		Scanner scan = new Scanner(System.in);
		String row=scan.nextLine();
		long n = Long.parseLong(row.split(" ")[0]);
		
		long max=(long)Math.pow(2, 31)-1;
		long min=(long)Math.pow(2, 31)*-1;
		
		String result ="";
		
		if(n>=min&&max>=n) {
			result+="Yes";
		}else {
			result+="No";
		}
		
		System.out.println(result);
		
		
	}

}
