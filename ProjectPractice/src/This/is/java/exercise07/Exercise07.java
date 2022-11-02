package This.is.java.exercise07;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run =true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			String select = scan.next();
			select=select.replaceAll("[^0-9]", "9");
			
			if(Integer.parseInt(select)>=1&&Integer.parseInt(select)<=4) {
				switch (select) {
				case "1":
					System.out.print("예금액>");
					long put = scan.nextLong();
					balance+=put;
					break;
				case "2":
					System.out.print("출금액>");
					long out = scan.nextLong();
					if(balance>=out) {
						balance-=out;
					}else if(balance-out<0) {
						System.out.println("잔액이 부족합니다");
					}
					break;

				case "3":
					System.out.println("잔고조회");
					System.out.println(balance);
					break;

				case "4":
					System.out.println("프로그램 종료");
					return;

				default:
					break;
				}
			}else {
				System.out.println("1~4번 중에 선택하세요");

			}
		}
		scan.close();
	}
}
