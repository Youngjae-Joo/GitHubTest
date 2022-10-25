package AtCoder;

import java.util.Scanner;

public class 첫번째_격자판 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();
		
		String a=row1.split("")[0];
		String b=row1.split("")[1];
		String c=row2.split("")[0];
		String d=row2.split("")[1];
		String result = "";
		
		if((a.equals(".")&&d.equals("."))||(b.equals(".")&&c.equals("."))) {
			result+="No";
		}else {
			result+="Yes";
		}
		
		System.out.println(result);
		
		
		
		
	}

}
