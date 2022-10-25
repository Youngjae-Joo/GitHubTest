package quiz02;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Person 클래스를 파일로 정의
		 * 
		 * 멤버변수는 int age, String name
		 * 메서드 info(): String -멤버변수를 문자열로 더해서 반환
		 * 
		 * 메인에서는 Person 객체를 2개 생성해서 각각 확인
		 */
		
		Person p = new Person();
		p.age= 30;
		p.name="잭";
		System.out.println(p.info());
		
		Person p2 = new Person();
		p2.age=42;
		p2.name="헥터";
		System.out.println(p2.info());
		
		Person p3 = new Person("윌", 27);
		System.out.println(p3.info());
		
		//////////////////////////////////////////////////////////////
		//멤버변수, 메서드, 생성자를 사용해서 
		//현실에서 찾아볼 수 있는 물건 생각해서 클래스로 표현한다.
		//생성해서 사용-메서드 2개 이상
		Coffee cof = new Coffee();
		cof.menu="아메리카노";
		cof.price=3000;
		cof.shot=2;
		cof.order();
		cof.milk(0);
		
		Coffee cof2 = new Coffee("카페모카", 4500, 3);
		cof2.order();
		cof2.milk(2);
		
		
		
		
		
		
		
	}
}
