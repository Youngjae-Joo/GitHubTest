package day10.exception.throws_;

public class MainClass {
	public static void main(String[] args) {
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();
		} catch (Exception e) {}//try catch를 어디에 쓰느냐에 따라 시작,종료 출력문이 다르게 나타남. 어디서 중간에 끊기는지를 파악해야 한다.
		System.out.println("0으로 나눌 수 없습니다");
	}

}
