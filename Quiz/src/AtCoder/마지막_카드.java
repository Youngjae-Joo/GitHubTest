package AtCoder;

import java.util.Scanner;

public class 마지막_카드 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();

		int n = Integer.parseInt(row.split(" ")[0]);
		int k = Integer.parseInt(row.split(" ")[1]);
		int a = Integer.parseInt(row.split(" ")[2]);

		int result=-1;

		for(int i=0;i<k;i++) {
			if(a>n) {
				a-=n;
			}
			a++;

		}
		result+=a;
		System.out.println(result);
		scan.close();

	}

}
