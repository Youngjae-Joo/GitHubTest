package day01;

public class VariableScope {
	
	public static void main(String[] args) {
		
		int num1 = 10; //같은 정수 변수 ,를 사용하여 한줄에 가능
		int num2 = 20;
		int num4 = 0; //초기값
		
		//변수는 해당 중괄호 안에서만 사용할 수 있습니다.
		//main안에서 만들어진 변수를 지역변수 라고 부릅니다.
		if(true ) {
			
			int num3 = num1 + num2; 
			System.out.println(num3);
			
			num4 = 200; //변경가능
			
		}
		
		
		//System.out.println(num3); 변수 num3 선언한 if문 안에서 출력하였고 중괄호 밖이기 때문에 변수가 사라져 나오지 않는다
		int num3 = 100; //변수 num3를 다시 선언
		System.out.println(num3); //100. 앞의 num3은 중괄호 안에서 사용하고 밖에선 사라졌으므로 다시 num3 변수를 선언할 수 있다.
		
		System.out.println(num4); // 선언은 if문 위에서 했다. if문 안에서는 변경했을 뿐. 
		
		
	}

}
