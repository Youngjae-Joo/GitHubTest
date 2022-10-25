package day08.poly.basic;

//하나의 클래스 파일에 여러 클래스 선언이 가능합니다.
//단, 파일명과 동일한 클래스가 public이어야 합니다.
//자바는 1클래스 파일에 1클래스가 원칙. 여기서는 그냥 예시를 보기 위해.
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}



public class Basic {//사용자클래스
	//다형성(클래스형변환) - 자식의 주소가 부모에 저장되는 성질
	//멤버변수
	A a = new B();//A가 더 크기때문에 가능
	A a1 = new C();
	A a2 = new D();
	A a3 = new E();
	
	//다형성은 상속을 전제로 합니다.
	//B b = new C();--불가능
	
	//Object형에는 모든 클래스를 저장할 수 있습니다.
	Object obj=1;
	Object obj2=3.14;
	Object obj3="문자열";
	Object obj4=new A();
	//Object형으로 자동형변환. 따라서 필요할 때만 저장한다.
	
	
}
