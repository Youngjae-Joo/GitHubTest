package AtCoder;

import java.util.Arrays;
import java.util.Scanner;

public class 주문_최소화 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		char[] arr = row.toCharArray();
		Arrays.sort(arr);
		
		StringBuffer str = new StringBuffer();
		
		for(int i=0;i<arr.length;i++) {
			str.append(arr[i]);
		}
		
		System.out.println(str);
	}

}
