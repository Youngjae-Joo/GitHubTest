package AtCoder;

import java.util.Scanner;

public class 티셔츠 {
	public static void main(String[] args) {
		//티셔츠
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		int a = Integer.parseInt(row.split(" ")[0]);
		int b = Integer.parseInt(row.split(" ")[1]);
		int c = Integer.parseInt(row.split(" ")[2]);
		int x = Integer.parseInt(row.split(" ")[3]);
		
		double result =0;
		
		if(x<=a) {
			result=1;
		}else if(x<=b&&x>=a+1){
			result= (double)c/(b-a);
		}else {
			result=0;
		}
		
		
		
		
		System.out.printf("%.12f",result);
	}


}
