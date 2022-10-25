package AtCoder;

import java.util.Scanner;

public class 숫자_야구 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();
		String row3 = scan.nextLine();

		int r=Integer.parseInt(row1);
		String[] str1 = row2.split(" ");
		String[] str2 = row3.split(" ");

		int count1=0;
		int count2=0;
		for(int i=0;i<str1.length;i++) {
			for(int j=0;j<str2.length;j++) {
				if(str1[i].equals(str2[j])) {
					if(i==j) {
						count1++;
					}else if(i!=j) {
						count2++;
					}
				}
			}
		}
		System.out.println(count1);
		System.out.println(count2);


		scan.close();

	}

}
