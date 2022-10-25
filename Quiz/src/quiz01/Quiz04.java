package quiz01;
import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		/*
		 * 정수를 하나 입력받습니다. 
		 * 입력받은 값이 0인지, 홀수인지, 짝수인지, 음수인지 구별하는 else if문 
		 *
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 \n>");
		int a = scan.nextInt(); //Scanner 사용 tip---입력한 값(a)은 조건문에서 사용
		
		String num = null;
		
		if(a < 0) {
			num = "음수";
		} else if(a == 0) {
			num = "0";
		} else if(a % 2 == 0) {
			num = "짝수";
		} else {
			num = "홀수";
		}
		
		System.out.println(a +"는 "  + num + " 입니다"); //선언하고 조건문을 거친 변수를 여기서 출력
	
		scan.close();
	
	}
}
