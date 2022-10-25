package quiz02;

public class Person {
	int age;
	String name;
	
	//프로그래머가 생성자를 인위적으로 생성하면, 기본생성자를 자동생성하지 않습니다.
	//name, age를 매개변수로 받는 생성자(초기화)
	
	Person(){
	}
	
	String info() {
		return "이름:"+name+" 나이:"+age;
	}
	
	Person(String n, int a){
		name =n;
		age=a;
	}
	
}
