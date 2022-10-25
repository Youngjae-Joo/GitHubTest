package AtCoder;

import java.util.Scanner;

public class 츄코다이 {
	public static void main(String[] args) {
		//츄코다이
		
		Scanner scan = new Scanner(System.in);
		String row =scan.nextLine();
		String row2=scan.nextLine();
		
		int a=Integer.parseInt(row2.split(" ")[0])-1;
		int b=Integer.parseInt(row2.split(" ")[1])-1;
		
		String[] str =row.split("");
		String temp =str[a];
		str[a]=str[b];
		str[b]=temp;
		
		String result="";
		for(String i : str) {
			result+=i;
		}
		System.out.println(result);
		
	}

}
