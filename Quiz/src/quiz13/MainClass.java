package quiz13;

public class MainClass {
	public static void main(String[] args) {
		Shape rec = new Rect("사각형",4);
		System.out.println(rec.getName());//상속
		System.out.println(rec.getArea());//오버라이딩
		
		Shape cir = new Circle("원",5);
		System.out.println(cir.getName());
		System.out.println(cir.getArea());
		
		
	}

}
