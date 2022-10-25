package day02;

public class WhileEx02 {

	public static void main(String[] args) {
		
		//100번 회전하는 반복문에서 짝수만 출력
		
		int i = 1;
		while(i <= 100){
			
			if(i % 2 ==0) {
				System.out.print(i + " "); //출력이 조건문 안에서 이루어진다. 출력문이 어디에 있는지 확인하기
			}
			i++;
		}
		
		System.out.println();//줄바꿈용

		
		//100번 회전하는 반복문에서 짝수만 출력
		int j = 2;
		while(j<=100) {
			
			System.out.print(j + " ");
			
			j+=2; //2개씩 증가한다는 의미. 풀어보면 j = j+2;임
		}
		System.out.println();
		
		
		
	}
}
