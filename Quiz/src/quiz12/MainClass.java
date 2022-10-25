package quiz12;

public class MainClass {
	public static void main(String[] args) {
		
		MyCart mycart = new MyCart(5000);
		
		Radio radio = new Radio();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		mycart.buy(tv);
		mycart.buy(radio);
		mycart.buy(com);
		mycart.buy(com);
		mycart.buy(tv);
		mycart.buy(com);
		mycart.buy(com);
		mycart.buy(radio);
		mycart.buy(com);
		mycart.buy(radio);
		
		
		
	}

}
