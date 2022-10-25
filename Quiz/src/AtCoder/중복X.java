package AtCoder;

import java.util.Scanner;

public class 중복X {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();
		int a = Integer.parseInt(row1);
		
		String[] str = row2.split(" ");
		int count=0;
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					str[i]="";
					count++;
				}
				
			}
		}
		
		
		
		System.out.println(a-count);
		
		
		
		
	}

}
