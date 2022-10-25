package day09.inter.basic;

public class MainClass {
	public static void main(String[] args) {
		
		//인터페이스는 객체생성이 불가합니다.
		//Inter1 i = new Inter1(); 불가
		
		//인터페이스도 부모타입이 될 수 있습니다.-인터페이스도 타입이 될 수 있다!
		Inter1 b =new Basic();
		b.method01();
		System.out.println(Inter1.PI);
		//이렇게 받으면 Inter1의 기능만 사용하고, override된 메서드만 가능
		//b.method02(); 불가

		Inter2 ba = new Basic();
		ba.method02();

		Basic bai = new Basic();
		bai.method01();
		bai.method02();
		System.out.println(bai.PI);
		
		Inter2 i2=ba; //클래스 형변환
		i2.method02();
		Basic bb=(Basic)ba;
		
		
	}

}
