package StreamQuiz;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		//패턴 찾기 문제 	

		int num = 0;
		int k = 2 * 6 -1;
		for(int i = 0; i < 6; i++) {

			for(int j = 1; j <=k; j++) {

				if(i == 6-1) {
					System.out.print(num);
					num++;
					if(num > 9) {
						num = 0;
					}
				}
				else {

					if(Math.abs(6-j) == i) {
						System.out.print(num);
						num++;
						if(num > 9) {
							num = 0;
						}

					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

		System.out.println("=====================");
		for(int h=0;h<6;h++) {
			if(h<=4) {
				for(int i=5-h;i>0;i--) {
					System.out.print(" ");
				}
				if(h==0) {
					System.out.print(h);
				}else {
					System.out.print(h*2-1);
					for(int j=0;j<h*2-1;j++) {
						System.out.print(" ");
					}
					System.out.print(h*2);
				}
			}
			System.out.println();
		}
		System.out.println("90123456789");

		System.out.println("=====================");
		//GCCG위치 찾기. 겹치는 것은 제외. 염기서열 문제 
		String msg = "GCCGABCGCCGCCGBACGCCGCA";
		for(int i=0;i<msg.length()-3;i++) {
			if(msg.charAt(i)=='G'&&msg.charAt(i+1)=='C'&&msg.charAt(i+2)=='C'&&msg.charAt(i+3)=='G') {
				System.out.println(i);
				i+=3;
			}
		}
		
		String[] str = msg.split("GCCG");
		for(int i=0;i<str.length;i++) {
			int a = msg.indexOf(str[i]);
			
		}
		

		System.out.println("=====================");
		//log.txt
		//맨 앞은 IP, 맨 뒤는 Traffic
		//1.트래픽의 합 
		//2.IP별 접속횟수
		//3.IP별 트래픽의 합


		

	}

}
