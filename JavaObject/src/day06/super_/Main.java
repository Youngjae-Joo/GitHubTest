package day06.super_;

public class Main {
	public static void main(String[] args) {
		
		Mother m = new Mother();
		System.out.println(m.info());
		
		Employee e = new Employee("이xx", 30," 행정");
		System.out.println(e.info());
		
		
		Student s = new Student("최xx",23,"2348");
		System.out.println(s.info());
		
		Teacher t = new Teacher("지xx", 27, "수학");
		System.out.println(t.info());
	}
}
