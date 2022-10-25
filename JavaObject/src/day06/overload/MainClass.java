package day06.overload;

public class MainClass {
	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.input(1);
		b.input("홍길동");
		b.input("a",1);
		b.input(1,"a");
		b.input(100,100,1); 
		
		//인트배열, 실수배열, 문자열배열
		//Arrays.toString();이 어떤 배열도 실행한 이유가 오버로딩되어있어기 때문
		//이외에도 indexof등 엄청나게 많은 것들이 오버로딩되어 있다.
	}

}
