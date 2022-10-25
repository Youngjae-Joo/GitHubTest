package quiz11;

public class MainClass {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		com.computerInfo();
		
		Monitor moni = com.getMonitor();//호출했을 때 반환이 Monitor 객체.
		moni.info();
		
	}

}
