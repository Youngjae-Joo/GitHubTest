package java_1026.Stack.Ex;

import java.util.Date;

//여러 개의 값을 묶어서 표현하기 위한 클래스 - Value Object(VO)
//getter와 constructor는 만들지만 setter는 만들지 않는 경우가 많음
public class PersonVO {
	//번호, 이름, 생일, 전화번호를 저장
	private long num;
	private String name;
	private Date birthday;
	private String phonenumber;
	
	//매개변수가 없는 생성자 - default Constructor
	//NoArgsConstructor라고도 함
	public PersonVO() {
		super();
		
	}

	//매개변수가 전부 있는 생성자-AllAgsConstructor
	public PersonVO(long num, String name, Date birthday, String phonenumber) {
		super();
		this.num = num;
		this.name = name;
		this.birthday = birthday;
		this.phonenumber = phonenumber;
	}

	
	//Immutable Data를 만드는 방법. setter가 없으니 바꿀수가 없다. 
	public long getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	
	
	
	//값을 빠르게 확인하기 위한 메서드
	//디버깅을 위한 메서드 - 개발 과정 중 값을 확인하기 위한 목적, 개발이 끝나면 불필요한 메서드이다
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", birthday=" + birthday + ", phonenumber=" + phonenumber + "]\n"
				+ "";
	}
	
	
	
	
	
	
	
}
