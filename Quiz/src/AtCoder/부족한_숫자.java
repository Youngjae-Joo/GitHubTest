package AtCoder;

import java.util.Scanner;

public class 부족한_숫자 {
	public static void main(String[] args) {
		//부족한 숫자..
		Scanner scan =new Scanner (System.in);
		String row1 =scan.nextLine();
		
		//로직 처리...
		int result =0;
		
		
		int sum=0;
		for(String s : row1.split("")) {
			sum+=Integer.parseInt(s);
		}
		result=45-sum;
		
		//출력...
		System.out.println(result);
		
		scan.close();
	}

}
