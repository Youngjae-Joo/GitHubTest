package quiz10;

public class User {

	private String name;
	private int age;
	private int rrn;
	//기본생성자
	public User() {
	}
	//모든멤버변수를 초기화 생성자
	public User(String name, int age, int rrn) {
		super();
		this.name = name;
		this.age = age;
		this.rrn = rrn;
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRrn() {
		return rrn;
	}

	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
}
