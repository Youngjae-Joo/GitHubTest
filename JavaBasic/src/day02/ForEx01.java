package day02;

public class ForEx01 {

	public static void main(String[] args) {
		
		//1~10합계
		
		int sum=0;//필요한 값, 누적값같은건 밖에다 적는다.
		for(int i=1; i<=10; i++) {
			
			sum+=i;
		} 
		System.out.println(sum);
		
		System.out.println("---------------------");
		//10부터 1까지 반복
		
		for(int j = 10; j>=1; j--) {
			
			System.out.print(j+" ");
		}
		
		
		
		
		
	}
}
