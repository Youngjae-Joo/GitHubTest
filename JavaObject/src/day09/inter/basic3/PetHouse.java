package day09.inter.basic3;

public class PetHouse {
	
	//1.IPet타입을 받아서 기능을 출력하는 static메서드
	
	public static void pet(IPet i) {
		i.play();
	}
	
	
	//2.IPet[] 타입을 매개변수로 받아서 배열 내부 Pet들의 play기능을 전부 출력하는 메서드
	public static void house(IPet[] ip) {
		for(IPet i : ip) {
			i.play();
		}
	}
	

}
