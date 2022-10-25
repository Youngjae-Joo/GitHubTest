package AtCoder;

import java.util.Scanner;

public class 고유한_별명 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		int n =Integer.parseInt(row);
		
		String result="No";
		String[][] str = new String[n][2];
		for(int i=0;i<n;i++) {
			String st =scan.nextLine();
			String s =st.split(" ")[0];
			String t =st.split(" ")[1];
			str[i][0]=s;
			str[i][1]=t;
		}
		
		
		int count1=0;
		int count2=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(str[i][0].equals(str[j][0]) || str[i][0].equals(str[j][1])) {
					count1++;
				}
				
				if(str[i][1].equals(str[j][0]) || str[i][1].equals(str[j][1])) {
					count2++;
				}
				
			}
		}
		
		if(count1==0||count2==0) {
			result="Yes";
		}
		
		System.out.println(result);
		scan.close();
	}

}
