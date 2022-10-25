package day02;

public class MultiForEx01 {
	public static void main(String[] args) {
		
		//1~9까지 돌아가는 반복문
		for(int i=1; i<=9; i++) {

			System.out.println(i);
			for(int j=1;j<=9;j++) { //사용하는 변수가 바깥for문과 안for문이 다르게 사용된다. 잘 구분하기.
				System.out.println(i+ "-"+ j);
			}
			
			System.out.println("-----------");//위치에 따라 어디서 뭐가 실행되는지 확인. 이걸 확인하면 변수선언에 대한 위치 파악이 가능하다.
		}
	}

}
