package quiz01;

public class Quiz08 {

	public static void main(String[] args) {
		
		//1. 1~100까지 정수중에 3의 배수이거나, 4의 배수일 경우 가로로 출력
		
		int a = 1;
		while(a<=100) {

			if(a%3==0 || a%4 ==0) {
				System.out.print(a + " "); //출력이 어디서 이루어져야 하는지 다시 한번 확인하기. while문이 끝난 뒤에 출력이 이루어진다
											//또한 출력하는 것이 while문에 사용된 변수가 아닌 것에도 유의하기. 
			}
			a++;
		}
		System.out.println(); 
		
		
		//2. 1~200까지 정수 중에서 6의 배수의 합계
		int num = 0; //누적시킬 변수
		int b = 1;		
		while(b<=200) {
			if(b % 6==0) {
				num += b;
			}
			b++;
		}
		System.out.println(num);
		
		
		//3. 1~100까지의 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 개수
		int num2 = 0;
		int c = 1;
		while(c<=100) {
			if(c % 4==0 && c % 8 !=0) {
				num2++;
			}
			c++;
		}
		System.out.println(num2);
		
		
		//4. 1000의 약수의 개수(약수는 나누어 떨어지는 수)
		int num3 = 0;
		int d =1;
		while(d<=1000) {
			if(1000%d==0) {
				num3++;
			}
			d++;
		}
		System.out.println("1000의 약수개수:" + num3);
	}
}
