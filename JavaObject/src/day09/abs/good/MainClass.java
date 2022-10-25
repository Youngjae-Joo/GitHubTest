package day09.abs.good;

public class MainClass {
	public static void main(String[] args) {
		
		//1. 추상클래스는 객체 생성이 안됩니다.
		//  반두시 자식으로 구체화 됩니다.
		
		//Store s = new Store(); 불가능
		Store s = new SeoulStore();//클래스 추상화. 자식으로 생성해서 부모로 받아도 결과가 바뀌지 않음. 왜? Store의 기능을 사용할 수 있지만 오버라이딩된 자식의 메서드가 먼저 나오기 때문
		s.apple();
		s.melon();
		s.orange();
		System.out.println(s.getName());//상속받은
		
		Store s1 = new BusanStore();
		s1.apple();
		s1.melon();
		s1.orange();
		System.out.println(s.getName());
		
		
	}

}
