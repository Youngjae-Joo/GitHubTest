package day04;

public class MethodEx03 {
	
	public static void main(String[] args) {
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 메서드가 돌려주는 값에 대한 타입.
		 * 2. 반환유형이 있는 메서드는 호출 구문이 값이 되기 때문에 메서드의 매개값으로 사용될 수 있습니다.
		 * ex) println(메서드 호출)
		 * 3. 모든 메서드는 return을 만나면 강제종료 됩니다.
		 * 4. 리턴문 아래에는 코드를 작성할 수 없습니다.
		 */
		
		//int result = add(3,5);
		//System.out.println("결과:"+result);
		//System.out.println(add(3,5));
		//()를 가진 애 중에서 메서드가 아닌 건 없다. println()도, charAt()도, split()도 전부 메서드임. 메서드 안에 메서드가 들어가는 것이 가능하다(반환이 있다면)
		System.out.println(	add(	add(1,2), add(2,3)	)	);
		
		//int r = sub(1,2); 불가능.void를 int로 받을 수 없다
		//System.out.println(sub(1,2)); 반환이 없으므로 불가능 
		sub(1,2); //호출만 가능.
		
		noReturn("hello");
		noReturn("bye");
		
		
		
	}

	//반환o, 매개변수o
	static int add(int a, int b) {
		return a+b;
	}

	//반환x, 매개변수o - 리턴이 없음. (단순 실행) 
	static void sub(int a, int b) {
		System.out.println("a-b=" + (a-b));
		//return; 굳이 적지는 않지만 void형에서도 return 키워드를 사용할 수는 있다. 이때 사용되는 return은 값을 실어주는 것이 아닌 종료의 의미를 갖는다. 
		//따라서 이 아래에 뭘 적을 수 없다. 강제종료시 사용
	}
	
	//void형에서 return-종료
	static void noReturn(String s) {
		
		if(s.equals("hello")) {
			System.out.println("실행종료");
			return;//종료
		}
		
		
		System.out.println(s);
	}
	
}
