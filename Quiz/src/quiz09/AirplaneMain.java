package quiz09;

public class AirplaneMain {
	public static void main(String[] args) {
		
		SuperSonicAp so = new SuperSonicAp("소닉");
		so.takeOff();//상속
		so.fly();
		so.flyMode=1;
		so.fly();//오버라이딩
		so.land();//상속
		
		System.out.println(so.info());
	}
}
