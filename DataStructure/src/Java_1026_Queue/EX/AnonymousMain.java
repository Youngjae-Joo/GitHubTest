package Java_1026_Queue.EX;

//인터페이스
interface Starcraft{
	public void attack();
}


//인터페이스를 구현한 클래스를 생성
class Protoss implements Starcraft{

	public void attack() {
		System.out.println("질럿의 공격");
	}
}



public class AnonymousMain {
	public static void main(String[] args) {
		
		//인터페이스를 implements한 클래스를 만들고 인스턴스를 만든 후 메서드를 호출
		Protoss p = new Protoss();
		p.attack();
		
		//인터페이스를 implements한 클래스를 만들지 않고 인스턴스를 생성해서 호출
		//클래스는 프로그램이 끝날 때까지 사라지지 않는다. 이 방식은 클래스를 만들지 않고 인터페이스를 구현한 인스턴스를 만들기에 낭비가 적다.
		Starcraft z = new Starcraft() {

			@Override
			public void attack() {
				System.out.println("저그의 공격");
			}}; 
			
		z.attack();
		
		
		
		//대입된 인스턴스에 따라 다른 메서드를 호출 - 폴리모피즘(다형성)
		Starcraft star = new Protoss();
		star.attack();
		
		star = new Starcraft() {
			public void attack() {
				System.out.println("저그의 공격");
			}}; 
		star.attack();
		
		
		//변수를 만들지 않고 인스턴스만 생성해서 메서드 호출
		new Starcraft() {
			@Override
			public void attack() {
				System.out.println("테란의 공격");
			}
		}.attack();
		
		//한번만 쓸꺼면 이름도 필요가 없다
		
		
	}
}
