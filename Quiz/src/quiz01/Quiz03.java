package quiz01;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		//정수를 하나 입력 받습니다. -스캐너를 이용하라는 뜻 (입력받는다,주어진다)
		//이 정수가 짝수인지, 홀수인지 if문을 통해서 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int a = scan.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		scan.close();
		
		
	}
}
