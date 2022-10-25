package AtCoder;

import java.util.Scanner;

public class 파스타 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		String s = scan.nextLine();
		String n = scan.nextLine();
		String m = scan.nextLine();
		
		String[] N =n.split(" ");
		String[] M =m.split(" ");
		
		int count=0;
		ok:for(int i=0;i<M.length;i++) {
			for(int j=0;j<N.length;j++) {
				if(M[i].equals(N[j])) {
					N[j]="";
					count++;
					continue ok;
				}
			}
		}
		
		
		
		if(M.length==count) {
			System.out.println("Yes");
		}else if(M.length!=count) {
			System.out.println("No");
		
		}
		
		
		
		
		
	}

}
