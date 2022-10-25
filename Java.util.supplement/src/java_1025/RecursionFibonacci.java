package java_1025;

public class RecursionFibonacci {
	//재귀를 만들 때는 말하는거 그대로 만든다고 생각	
	
	
		//n번째 피보나치 수열의 값을 리턴해주는 메서드
		public static int fibonacci(int n) {
			//첫번째와 두번째는 1
			if(n==1||n==2) {
				return 1;
			}
			//세번째 부터는 앞의 두개 항의 합
			else {
				return fibonacci(n-1)+fibonacci(n-2);
			}
		}
		
		
		
		
		public static void main(String[] args) {
			long start=System.currentTimeMillis();
			System.out.println(fibonacci(45));
			long end=System.currentTimeMillis();
			
			System.out.println((end-start)*0.001);
			//수가 늘어날수록 시간이 엄청 오래 걸린다
			
	}

}
