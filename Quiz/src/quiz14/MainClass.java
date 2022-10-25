package quiz14;

public class MainClass {
	public static void main(String[] args) {
		Marine m = new Marine();
		m.location();
		m.move(2, 3);
		m.location();
		m.stop();
		System.out.println(m.hp);
		System.out.println(Marine.attack);
		System.out.println(Marine.armor);
		
		
		Marine m2 = new Marine();
		System.out.println(m2.attack);
		System.out.println(m2.armor);
		
		Tank t = new Tank();
		System.out.println(t.hp);
		t.location();
		t.move(5, 5);
		t.location();
		t.stop();
		t.changeMod();
		
		
		DropShip d = new DropShip();
		System.out.println(d.hp);
		d.location();
		d.move(10, 21);
		d.location();
		d.stop();
		
		
	}

}
