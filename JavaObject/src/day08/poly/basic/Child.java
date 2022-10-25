package day08.poly.basic;

public class Child extends Parents{

	//오버라이딩 단축키 alt+shit+s
	@Override
	public void method02() {
		System.out.println("오버라이딩 된 2번 메서드");
	}
	
	public void method03() {
		System.out.println("자식의 3번 메서드");
	}

	//1번메서드-상속받음 2번메서드-오버라이딩 3번메서드-자신꺼
	//Child는 이렇게 3개 사용 가능
	
	
}
