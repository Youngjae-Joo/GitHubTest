package java_1024;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("실수를 입력하세요>");
		String su = scan.nextLine();
		
		try {
		Double silsu =Double.parseDouble(su);
		
		String msg = silsu.toString();
		System.out.println(msg);
		}catch(Exception e){
			System.out.println("변환 실패");
		}
		
		scan.close();
	}

}
