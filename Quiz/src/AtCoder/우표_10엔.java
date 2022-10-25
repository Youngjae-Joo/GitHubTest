package AtCoder;

import java.util.Scanner;

public class 우표_10엔 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		int x = Integer.parseInt(row.split(" ")[0]);
		int y = Integer.parseInt(row.split(" ")[1]);
		
		
		int result=0;
		for(int i=x;i<y;i+=10) {
			result++;
		}
		
		System.out.println(result);
	}

}
