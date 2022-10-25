package AtCoder;

import java.util.Scanner;

public class 순환 {
	public static void main(String[] args) {
		//순환

		Scanner scan = new Scanner(System.in);
		String row =scan.nextLine();

		int[] arr= {Integer.parseInt(row.split("")[0]),
				Integer.parseInt(row.split("")[1]),
				Integer.parseInt(row.split("")[2])};

		int result =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<=100;j*=10) {
				result+=arr[i]*j;
			}
		}
		
		System.out.println(result);


		scan.close();

	}

}
