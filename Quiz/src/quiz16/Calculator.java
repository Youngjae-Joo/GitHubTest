package quiz16;

import java.util.Scanner;

public class Calculator {

	public static int input()throws Exception{
		/*
		 * 1. 스캐너로 정수 2개를 입력을 받습니다.
		 * 2. 입력된 값이 정수라면 합계를 반환합니다.
		 * 3. 예외가 발생될 수 있는 상황이라면 throw를 이용해서 메서드를 종료하고 예외메시지를 전달해주면 됩니다.
		 * 4. scan.close()는 finally문장에서 사용하세요
		 */
		Scanner scan=null;

		try {
			scan= new Scanner(System.in);//초기화를 안에서 하면 밖에서 선언된 변수를 {}밖 다른곳에서도 사용가능
			int a = scan.nextInt();
			int b = scan.nextInt();
			return a+b;
		} catch (Exception e) {
			throw new Exception("숫자로 입력하세요"); // 예외생성
		}finally {
			scan.close();
		}

	}




}
