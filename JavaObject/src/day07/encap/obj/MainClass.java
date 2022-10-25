package day07.encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		//호텔클래스 사용
		Hotel hotel = new Hotel();
		//hotel.setChef(new Chef());
		Chef chef = new Chef();
		hotel.setChef(chef);
		
		//getter
		Chef c=hotel.getChef();
		c.cooking();
		System.out.println(chef==c);//true
		
		
		
		
	}

}
