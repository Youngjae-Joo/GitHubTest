package day02;

public class BreakEx01 {
	public static void main(String[] args) {
		/*
		*int i=1;
		*while(i<=10) {
			
			if(i ==5) break;	//여기에 break가 있을 때 1~4까지만 출력되는데, 4번 돈 게 아니라 5번 돌고 break에 걸려서 빠져나온 것. 위치에 따라 결과가 다르게 나온다. 주의
			System.out.println(i);
			
			 
			
			
			i++;
		 }
		*/				//만약 조건을 한 줄만 쓸 때 {}생략이 가능하다!! //break는 조건문과 함께 사용
		
		for(int i = 1; i<=10;i++) {
			
			System.out.println(i);
			if(i==5) break;
		}
		
		
		
		
		
		
		
	}

}
