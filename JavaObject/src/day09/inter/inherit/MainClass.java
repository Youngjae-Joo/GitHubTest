package day09.inter.inherit;

public class MainClass extends MyClass {
	public static void main(String[] args) {
		
		//MyClass me = new MyClass();
		Inter3 me = new MyClass();//myclass는 inter3에 받은것들을 오버라이드하기만 했기 때문에 다 사용 가능.
		me.some01();
		me.some02();
		me.some03();
		me.some04();
		me.some05();
		
		//inter2의 기능만 사용할 수 있다 (오버라이드 된 메서드 실행)
		Inter2 m2 = new MyClass();
		m2.some03();
		m2.some04();
		
		Inter1 m3 = new MyClass();
		m3.some01();
		m3.some02();
		
		
		
		
		
	}

}
