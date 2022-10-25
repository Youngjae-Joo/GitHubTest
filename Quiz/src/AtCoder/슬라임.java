package AtCoder;

import java.util.Scanner;

public class 슬라임 {
	public static void main(String[] args) {
		//슬라임
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		long a =Long.parseLong(row.split(" ")[0]);
		long b =Long.parseLong(row.split(" ")[1]);
		long k =Long.parseLong(row.split(" ")[2]);
		
		int result =0;
		
		for(long i=a;i<b;i*=k) {
				result++;
		}
		
		System.out.println(result);
		
	}

}
