package day06.this_;

public class Person {//부모클래스로 사용
	
	String name;
	int age;
	
	Person(){
		this("홍길자",1);//아래 생성자를 의미함. 매개값을 아래 생성자에 집어넣어서 연결해주는 것
		//두개짜리 생성자 호출
	}

	
	Person(String name){
		this(name, 1);//두개짜리 생성자 호출
	}

	
	Person(String name, int age){
		//super();-적지 않아도 생성되어 있다.
		this.name=name.toUpperCase();
		this.age=age;
		System.out.println("100줄짜리 토드......");
	}
	
	
	String info() {
		return "이름:" + name + ", 나이:"+ age;
	}
}