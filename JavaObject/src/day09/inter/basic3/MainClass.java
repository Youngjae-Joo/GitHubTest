package day09.inter.basic3;

public class MainClass {
	public static void main(String[] args) {
		
		//Dog d = new Dog(); //eat, play
		//Animal d = new Dog();//eat
		//IPet d = new Dog();//play
		
		Animal baduk = new Dog(); 
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		//1.Animal 배열에 저장
		Animal[] arr = {baduk, nabi, hodol};
		for(Animal a :arr) {
			a.eat();
		}
		
		//2. 바둑이는 현재 Animal이지만 생성된 클래스가 인터페이스 상속을 받고 있다면, 상호형변환이 됩니다.
		IPet i1 =(IPet)arr[0];
		IPet i2 =(IPet)nabi;
		IPet i3 = new GoldFish();
		
		IPet[] arr2 = {i1, i2, i3};
		for(IPet i : arr2) {
			i.play();
		}
		System.out.println("====================");
		PetHouse.pet(i1);
		PetHouse.house(arr2);
		
		
		
	}

}
