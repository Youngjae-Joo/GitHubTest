package AtCoder;

import java.util.Scanner;

public class 직진_후_우회전 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();

		int n = Integer.parseInt(row1);
		String[] t=row2.split(""); 

		int x=0;
		int y=0;

		int spin = 0;

		for(int i=0;i<n;i++) {
			if(spin==0) {
				if(t[i].equals("S")) x++;
				if(t[i].equals("R")) spin =1;
			}else if(spin==1) {
				if(t[i].equals("S")) y--;
				if(t[i].equals("R")) spin =2;
			}else if(spin==2) {
				if(t[i].equals("S")) x--;
				if(t[i].equals("R")) spin =3;
			}else if(spin==3) {
				if(t[i].equals("S")) y++;
				if(t[i].equals("R")) spin =0;
			}
		}

		System.out.println(x+" "+y);
	}
}
