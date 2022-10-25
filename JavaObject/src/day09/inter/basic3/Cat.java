package day09.inter.basic3;

public class Cat extends Animal implements IPet{

	public void eat() {
		System.out.println("냐옹이는 생선을 먹어요");
	}

	@Override
	public void play() {
		System.out.println("냐옹이는 방에서 놀아요");
	}
}
