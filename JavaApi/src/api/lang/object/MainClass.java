package api.lang.object;

public class MainClass {
	public static void main(String[] args) {
		Person p = new Person("홍길동");
		
		//toString()-오버라이딩하지 않으면 주소를 찍어줄 뿐. 
		//자바는 주소를 건드릴 수 없다.그래서 toString을 오버라이딩해서 객체가 가진 멤버변수를 찍어주는 역할로 쓴다
		System.out.println(p.toString());
		
		//equals()
		Person p2 = new Person("홍길동");
		System.out.println(p.equals(p2));//eqauls를 기존과 다르게 오버라이딩하였음
		
		
		//clone()-객체복사->객체가 Cloneable이란 인터페이스 상속해야 함
		try {
			Object obj = p.clone();
			Person p3 = (Person)obj;
			System.out.println("복사된객체의 name:"+p3.getName());
			System.out.println(p==p3);//false
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
