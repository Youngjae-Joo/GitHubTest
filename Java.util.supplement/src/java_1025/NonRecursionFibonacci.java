package java_1025;

public class NonRecursionFibonacci {
	// n번ㅉ 피보나치 수열의 값을 리턴해주는 메서드
	public static Long fibonacci(int n) {
		Long f1=(long)1;
		Long f2=(long)1;
		
		//피보나치 값을 저장할 변수
		Long fibo=(long)1;
		//첫번째와 두번째는 처리할 필요 없다. 반복문을 세번째 부터 적용
		for(int i=3;i<=n;i++) {
			fibo=f1+f2;
			f2=f1;
			f1=fibo;
			//이 과정은 다음을 준비하는 과정임.
		}
		return fibo;
		
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(100));//int를 쓰면 int의 범위를 넘어 음수가 나옴
		
	}

}
