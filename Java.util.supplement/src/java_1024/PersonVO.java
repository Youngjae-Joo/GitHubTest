package java_1024;

public class PersonVO implements Comparable<PersonVO>{
	//<>안에 있는 애는 generic
	private int num;
	private String name;
	private int age;
	
	//매개변수가 없는 생성자- Default Constructor
	public PersonVO() {
		super();
	}
	//속성을 전부 매개변수로 받는 생성자-인스턴스 생성 후 값을 빠르게 대입하기 위해서 생성
	public PersonVO(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}

	//getter&setter : 속성의 값에 접근하고 변경하기 위한 메서드
	//일반적으로 VO클래스의 경우는 setter를 만들지 않음
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
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

	
	//데이터 출력을 편리하게 하기 위한 메서드
	//출력하는 메서드에 인스턴스 이름을 대입하면 이 메서드가 호출되서 출력됩니다.
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	

	//크기 비교하는 메서드: 정렬하기 위해서 사용-인터페이스 메서드 상속. comparable인터페이스에 sort라는 함수가 정의되어 있다. 
	@Override
	public int compareTo(PersonVO o) {
		//크기 비교 방법 설정 
		return this.age-o.age;
	}
	
}
