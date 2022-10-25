package quiz16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*up down 게임
		 * 
		 * 1~100까지의 임의 숫자를 1번 생성
		 * 반복문 안에서 스캐너를 이용해서 정답을 입력받습니다.
		 * 
		 * 랜덤수가 입력받은 값보다 작으면 "더 큰수를 입력하세요"
		 * 랜덤수가 입력받은 값보다 크면 "더 작은수를 입력하세요"
		 * 
		 * 정답이라면 시도횟수: x회를 출력하고 종료
		 * 
		 * 만약 숫자가 아닌값이 들어온다면 예외를 처리하고, 다시 입력받으세요
		 * 
		 */
		int r = (int)(Math.random()*100+1);
		int count =0;
		
		while(true) {
			Scanner scan = new Scanner(System.in);//객체를 매번 새로 만들기 때문에 catch문에서 엔터개행을 제거할 필요가 없음. 만약 try문안에 생성문이 있으면 catch문에 scan.nextLine();을 통해 제거해줘야 함
			count++;
			try {
				System.out.print(">");
				int answer = scan.nextInt();
				if(answer>r) {
					System.out.println("더 작은 수를 입력하세요");
				}else if(answer<r) {
					System.out.println("더 큰 수를 입력하세요");
				}else {
					System.out.println("시도횟수:"+count);
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
			}
		}
	}

}
