package AtCoder;

import java.util.Scanner;

public class 완벽한_문자열 {
	public static void main(String[] args) {
		//완벽한 문자열
		Scanner scan = new Scanner(System.in);
		String row = scan.next();
		
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<row.length();i++) {
			if(row.charAt(i)>=97&&row.charAt(i)<=122) {
				count2++;
			}else if(row.charAt(i)>=65&&row.charAt(i)<=90) {
				count1++;
			}
		}
		
		for(int i=0;i<row.length();i++) {
			for(int j=i+1;j<row.length();j++) {
				if(row.charAt(i)==row.charAt(j)) {
					count3++;
				}
			}
		}
		
		
		
		String result="";
		
		if(count1==0||count2==0||count3!=0) {
			result+="No";
		}else {
			result+="Yes";
		}
		
		System.out.println(result);
		
		
	}

}
