package day06.this_;

public class Main {
	public static void main(String[] args) {

		Person p = new Person();//부모
		System.out.println(p.info());//이름:홍순자, 나이:1
		
		Person p1 = new Person("honggilja");
		System.out.println(p1.info());
		
		Person p2 = new Person("honggildong",20);
		System.out.println(p2.info());
		
	}
}
