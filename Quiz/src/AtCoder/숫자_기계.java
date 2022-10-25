package AtCoder;

import java.util.Scanner;

public class 숫자_기계 {
	public static void main(String[] args) {
		//숫자 기계
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		int[] arr = {Integer.parseInt(row.split(" ")[0]),
				Integer.parseInt(row.split(" ")[1]),
				Integer.parseInt(row.split(" ")[2]),
				Integer.parseInt(row.split(" ")[3]),
				Integer.parseInt(row.split(" ")[4]),
				Integer.parseInt(row.split(" ")[5]),
				Integer.parseInt(row.split(" ")[6]),
				Integer.parseInt(row.split(" ")[7]),
				Integer.parseInt(row.split(" ")[8]),
				Integer.parseInt(row.split(" ")[9])};
		
			int result=arr[arr[arr[0]]];
			
			System.out.println(result);
			scan.close();
	}

}
