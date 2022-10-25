package AtCoder;

import java.util.Scanner;

public class 샴푸 {
	public static void main(String[] args) {
		//샴푸
		Scanner scan = new Scanner(System.in);

		String row = scan.nextLine();

		long v = Long.parseLong(row.split(" ")[0]);
		long a = Long.parseLong(row.split(" ")[1]);//아버지
		long b = Long.parseLong(row.split(" ")[2]);//어머니
		long c = Long.parseLong(row.split(" ")[3]);//다카하시


		String result ="";
		while(true) {
			if(v<a) {
				result+="F";
				break;
			}
			if(v-a<b) {
				result+="M";
				break;
			}else {
				v-=a;
			}

			if(v-b<c) {
				result+="T";
				break;
			}else {
				v-=b;
			}
			
			if(v-c<a) {
				result+="F";
				break;
			}else {
				v-=c;
			}
		}
		System.out.println(result);
		scan.close();
	}

}
