package day08.poly.basic2;

public class Employee extends Person{
	
	String department;//부서
	Employee(String name, int age, String department){
		super(name,age);
		this.department=department;
		
	}
	
	
	String info() {
		//super.메서드()- 오버라이딩된 메서드에서 부모님의 원형메서드가 필요할때 사용가능
		return super.info()+ ", 부서:"+ department;
	}
}
