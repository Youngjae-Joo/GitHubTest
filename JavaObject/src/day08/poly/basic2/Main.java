package day08.poly.basic2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		//다형성을 적용한 배열
		Student s = new Student("홍길동", 20, "123123");

		Teacher t = new Teacher("홍길자",30,"프로그램");

		Employee e = new Employee("홍길순", 40, "취업지원팀");

		//Object[] arr = {s, t, e};오버라이딩 메서드 사용불가
		Person[] arr = {s, t, e};//부모타입으로 한번에 받기

		for(Person p :arr) {//마찬가지, 부모타입으로 한번에
			System.out.println(p.info());//오버라이딩된 메서드
		}

		System.out.println("============================");
		printInfo(s);
		printInfo(t);
		printInfo(e);

		House h = new House();
		h.setPerson(s);//스튜던트 저장
		h.setPerson(t);//티쳐
		h.setPerson(e);//임플로이
		Person[] pr=h.getPerson();

		for(Person p : pr) {
			if(p==null) break;
			System.out.println(p.info());
		}
	}
	public static void printInfo(Person p) {//부모타입 매개변수
		System.out.println(p.info());
	}
}

