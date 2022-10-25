package quiz04;

public class MainPlayer {
	public static void main(String[] args) {
		
		Warrior exe = new Warrior("도끼");
		exe.info();
		exe.bash();
		exe.bash();
		exe.info();
		
		Wizard wand = new Wizard("지팡이");
		wand.info();
		wand.iceArrow();
		wand.iceArrow();
		wand.info();
		
	}

}
