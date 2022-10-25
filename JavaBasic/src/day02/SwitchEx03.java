package day02;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "사요나라", "@#$"};

		//System.out.println(arr[0]);
		/*
		 * Math.random()을 사용해서 배열의 인덱스 범위(0~3)까지 랜덤수를 만듭니다.
		 * 랜덤수를 배열의 index에 적용해서 출력된 단어가 한국어, 영어, 일본어, 알수없는언어
		 * 
		 * 인지 처리를 해보세요.
		 */
		
		int a = (int)(Math.random()*4); //4 곱하면 0<=a<4가 됨. 어렵게 생각하지 말자.
		
		System.out.println("선택된단어:" + arr[a]);
		
		//switch에 들어가는 값은 정수, 문자여야 합니다. 실수는 안된다.
		switch (a) {
		
		case 0:
			System.out.println("한국어");
			break;
		case 1:
			System.out.println("영어");
			break;
		case 2:
			System.out.println("일본어");
			break;
		default:
			System.out.println("알수없는언어"); //굳이 case3를 만들지 말고 그냥 default로 처리
			break;
		}
		
	}
}
