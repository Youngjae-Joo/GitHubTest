package day06.this_;

public class Teacher extends Person {
	
	String subject;//과목
	
	String info() {
		return "이름:" + name + ", 나이:"+ age+ ", 과목:"+ subject;
	}
}
