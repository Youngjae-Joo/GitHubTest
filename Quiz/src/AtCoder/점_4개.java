package AtCoder;

import java.util.Scanner;

public class 점_4개 {
	public static void main(String[] args) {

		//4개의 점..
		Scanner scan = new Scanner(System.in);
		String row1 =scan.nextLine();
		String row2 =scan.nextLine();
		String row3 =scan.nextLine();

		int x1=Integer.parseInt(row1.split(" ")[0]);
		int y1=Integer.parseInt(row1.split(" ")[1]);

		int x2=Integer.parseInt(row2.split(" ")[0]);
		int y2=Integer.parseInt(row2.split(" ")[1]);

		int x3=Integer.parseInt(row3.split(" ")[0]);
		int y3=Integer.parseInt(row3.split(" ")[1]);


		int x4=0;
		int y4=0;
		
		if(x1==x2) {
			x4=x3;
		}else if(x1==x3) {
			x4=x2;
		}else {
			x4=x1;
		}
		
		if(y1==y2) {
			y4=y3;
		}else if(y1==y3) {
			y4=y2;
		}else {
			y4=y1;
		}
		
		String result = x4+" "+y4;

		System.out.println(result);



	}

}
