package AtCoder;

import java.util.Scanner;

public class 더_가까이 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String row = scan.nextLine();
		
		int a = Integer.parseInt(row.split(" ")[0]);
		int b = Integer.parseInt(row.split(" ")[1]);
		
		double x =0;
		double y =0;
		
		
		x = a/Math.sqrt(a*a+b*b); 
	    y = b/Math.sqrt(a*a+b*b); 
	    
	    System.out.println(x+" "+y);
	    scan.close();
	}

}
