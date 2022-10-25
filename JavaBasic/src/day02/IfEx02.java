package day02;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		//입력받은 점수에 따라서 A, B, C, D, F로 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수>");
		int point = scan.nextInt();
		
		String grade = null; //없는값 의미. 변수 활용하기 if문이나 else if문에서 변수를 선언하면 {}때문에 그곳에서만 사용되고 이후에 사라짐
		
		if(point >= 90) {
			//조건검사 또
			if(point >= 95) {
				grade = "A+";
			} else {    //90~94
				grade = "A";
			}
		} else if(point >=80) { //90점 이상은 위 조건에서 걸러짐. 여기서 걸러지는건 80~89점대.
			grade = "B";
		} else if(point >=70) {
			grade = "C";
		} else if(point >=60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println(grade);
		
		//if문은 main 안이라면 어디든 들어갈 수 있다.
		//당황하지 말고, 차근차근 내려가면서 범위에서 걸러진 값이 어느정도의 범위인지 확인하자.
	}
}
