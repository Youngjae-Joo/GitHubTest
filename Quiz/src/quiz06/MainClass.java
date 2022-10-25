package quiz06;

public class MainClass {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(10));
		System.out.println(cal.circle(4));
		
		
		Computer com = new Computer();
		System.out.println(com.circle(4));
		System.out.println(com.rect(3));
		System.out.println(com.rect(3, 4));
		System.out.println(com.rect(3, 4, 5));
		
	}
}