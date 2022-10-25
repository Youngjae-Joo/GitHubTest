package quiz01;
import java.util.Scanner;

public class Quiz18 {
public static void main(String[] args) {
	/*
	 * 랜덤한 덧셈 문제를 내는 프로그램
	 * 
	 * 반복이 실행될때마다 1~100사이의 랜덤한 덧셈 구문이 출력됩니다.
	 * 0을 입력받으면 프로그램을 종료합니다.
	 * 프로그램이 종료되면 정답횟수, 오답횟수를 출력하면 됩니다.
	 */
	Scanner scan = new Scanner(System.in);
	int countcorrect = 0;
	int countwrong=0;
	while(true) {
		int a =(int)(Math.random()*100)+1;
		int b =(int)(Math.random()*100)+1;
		System.out.println("------------------");
		System.out.println(a+"+"+b+"="+"?");
		System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
		System.out.print(">");
		int answer = scan.nextInt();
		
		if(answer==0) { //입력값이 0일때를 먼저 실행하고 else if나 else로 조건을 걸면 0입력 후 뒤에 틀렸습니다가 나오지 않는다.  
			System.out.println("프로그램 정상 종료");
			System.out.println("정답:"+countcorrect);
			System.out.println("오답:"+countwrong);
			break; //if(answer==0) break;구문을 맨 위에 따로 만들어도 된다. 그 뒤는 if-else구문으로 간단하게. 
		}else if(answer!=a+b){
			countwrong++;
			System.out.println("틀렸는데요?");
		}else {
			countcorrect++;
			System.out.println("정답입니다");
		}
	}
	
 }
}
