package AtCoder;

import java.util.Scanner;

public class 좋은_아침 {
	public static void main(String[] args) {
		//좋은 아침
		Scanner scan = new Scanner(System.in);
		String time = scan.nextLine();
		
		String result="";
		int takahashi =Integer.parseInt(time.split(" ")[0])*3600+(Integer.parseInt(time.split(" ")[1]))*60;
		int aoki =Integer.parseInt(time.split(" ")[2])*3600+(Integer.parseInt(time.split(" ")[3]))*60+1;
		
		if(takahashi<aoki) {
			result+="Takahashi";
		}else{
			result+="Aoki";
		}
			
		System.out.println(result);
		
		
		
		
	}

}
