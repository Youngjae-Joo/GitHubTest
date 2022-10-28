package java_1026.Queue.EX;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import java_1026.Stack.Ex.PersonVO;

public class MainClass {
	public static void main(String[] args) {
		//PtiorityQueue는 데이터를 정렬한 순서대로 꺼낼 수 있도록 해주는 클래스
		
		
		//정수를 저장하는 PriorityQueue를 만들어서 출력
		PriorityQueue<Integer> intQueue = new PriorityQueue<>();
		//add메서드는 예외를 throw하고, offer메서드는 null이나 false를 반환한다.
		intQueue.offer(100);
		intQueue.offer(70);
		intQueue.offer(90);
		
		//데이터 꺼내기
		//PriorityQueue라 정렬한 순서대로 나온다.-트리구조로 저장함.
		//List는 sort를 해주어야 하지만, 얘는 할 필요가 없다. 물론 저장되는 속도는 느릴 것.
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());//없으니 null을 출력하였음. 그래서 try-catch를 하는게 좋다.
		
		
		//PersonVO클래스를 저장하는 우선순위 큐
		//이 상태에서 만들면 PersonVO의 크기비교를 할 수 없기 때문에 예외 발생. PriorityQueue는 정렬한 순서대로 꺼내기 때문
		//정렬을 하려면 크기비교가 가능해야 한다.
		
		//1.PersonVO 클래스에 Comparable 인터페이스를 implements하고 compareTo라는 메서드를 재정의해서 해결할 수 있고,
		//2.Comparator 인터페이스를 대입받을 수 있는 경우에는 Comparator 인터페이스를 구현한 클래스의 인스턴스를 생성해도 됨
		
		//2번 방법을 권장함. 실행에 관련된 건 수정해도 괜찮지만 기존에 만들어진 클래스를 손대는 건 위험함. 이미 만들어놓은것들이 망가질 수 있기 때문에.
		PriorityQueue<PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {

			@Override
			public int compare(PersonVO o1, PersonVO o2) {
				return o1.getName().compareTo(o2.getName());
			}});
		
		persons.offer(new PersonVO(3, "아담", new Date(102,8,10), "01055556666"));
		persons.offer(new PersonVO(4, "이브", new Date(101,7,29), "01077778888"));
		persons.offer(new PersonVO(5, "카인", new Date(107,3,20), "01099991234"));
		
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		
		
		
		
		
	}

}
