package AtCoder;

import java.util.Scanner;

public class 고유_문자열 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		String[] str=row.split("");
		int count=0;
		
		for(int i=0;i<str.length-1;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
				}
			}
		}
		
		if(count==0) {
			System.out.println(6);
		}else if(count==1) {
			System.out.println(3);
		}else if(count==3){
			System.out.println(1);
		}
		
		scan.close();
	}

}
