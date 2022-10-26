package java_1026.Stack.Ex;

import java.util.Date;
import java.util.Stack;

public class MainClass {
	public static void main(String[] args) {
		//PersonVO 클래스의 인스턴스를 저장할 수 있는 stack을 생성
		Stack<PersonVO> stack = new Stack<>();
		stack.push(new PersonVO(1, "카리나", new Date(100, 3, 11), "01011112222"));
		stack.push(new PersonVO(2, "민지", new Date(103, 7, 24), "01033334444"));
		
		System.out.println(stack.toString());
		//Stack에서 데이터 꺼내기
		System.out.println(stack.pop());//민지가 나옴. 마지막에 넣은 게 먼저 나온다
		System.out.println(stack.pop());//카리나가 나옴. 
		System.out.println(stack.pop());//stack이 비어있다고 예외가 뜸-underflow
		//데이터가 2개 존재해서 2번 pop을 하면 모두 제거된상태.
		//그런데 또 pop을 수행했기 때문에 Underflow가 발생한 것.
		
		
		 
		
		
		
	}

}
