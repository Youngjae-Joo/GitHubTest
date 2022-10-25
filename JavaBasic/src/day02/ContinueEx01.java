package day02;

public class ContinueEx01 {
	public static void main(String[] args) {
		
//		for(int i=1;i<=10;i++) {
//			
//			
//			if(i%2==1) { //홀수
//				continue; //다음 반복으로 pass
//			}
//			
//			System.out.println(i);
//		}
		
		int i =1; 
		while(i<=10) {
			if(i%2==1) {  
			i++;
			continue;
			
			
			}
			
			System.out.println(i);
			i++;
			
		}
		System.out.println("프로그램 정상 종료");
		//만약 if문에 {}를 사용하지 않을 거라면 시작하자마자 i++을 할 거기 때문에 0부터 실행
		//i++뒤에 나와야 함. 안그러면 반복문 실행하자마자 continue를 받아서 다시 실행-->무한루프
		//return; //이 자리에서 '메인의 종료'를 의미. 조만간 배움...
	}

}
