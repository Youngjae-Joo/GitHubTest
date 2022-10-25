package day09.inter.basic3;

public class Dog extends Animal implements IPet{

	public void eat() {
		System.out.println("갱얼쥐는 사료를 먹어요");
		
	}
	
	public void play() {
		System.out.println("갱얼쥐는 방에서 놀아요");
	}
}
