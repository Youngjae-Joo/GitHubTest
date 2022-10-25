package quiz02;

public class Coffee {

	
	String menu;
	int price;
	int shot;
	
	Coffee(){
		System.out.println("===주문을 확인하세요===");
	}
	
	void order() {
		System.out.println(menu);
		System.out.println(price);
		System.out.println(shot);
	}
	Coffee(String s, int a, int b){
		System.out.println("===스페셜 오더===");
		menu = s;
		price = a;
		shot = b;
		
	}
	void milk(int a) {
		System.out.println("+우유는 "+a+"잔 추가");
	}
}
