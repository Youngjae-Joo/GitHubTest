package pac.def;

//import pac.abc.Apple; //패키지명을 포함한 클래스명
//import pac.abc.Banana;
import pac.abc.*;
import java.util.Scanner;


public class MainClass {
	public static void main(String[] args) {
		
		Melon m = new Melon();
		Apple a = new Apple();
		Banana b = new Banana();
		
		Scanner scan = new Scanner(System.in);
		System.out.println(m); //pac.def.Melon@511baa65가 출력됨. 이것을 주소값이라 한다.
		System.out.println(new int[3]);//[I@340f438e 
		
	}

}
