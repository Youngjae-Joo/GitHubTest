package AtCoder;

import java.util.Scanner;

public class 켜고_끄고 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		int s=Integer.parseInt(row.split(" ")[0]) ;
		int t=Integer.parseInt(row.split(" ")[1]) ;
		int x=Integer.parseInt(row.split(" ")[2]) ;
		
		String result ="";
		s*=60;
		t*=60;
		x=x*60+30;
		
		if(s<t) {
			if(x<s||t<x) {
				result+="No";
			}else {
				result+="Yes";
			}
		}else if(s>t) {
			if(x<t||x>s) {
				result+="Yes";
			}else {
				result+="No";
			}
		}
		
		
		System.out.println(result);
		
		
		
	}

}
