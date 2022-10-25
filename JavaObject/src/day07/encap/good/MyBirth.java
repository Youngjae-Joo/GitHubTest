package day07.encap.good;

public class MyBirth {
	private int year;
	private int month;
	private int day;
	private String ssn;//주민번호

	/*
	 * 은닉된 변수에 접근할 때 클래스설계자가 만들어 놓은 
	 * getter/settre메서드를 사용합니다.
	 * 
	 * 국룰-get시작(값을 얻는다), set시작(값을 저장한다).
	 * 
	 * set메서드
	 * 1.값을 저장하는 메서드
	 * 2.public으로 선언하고 set+멤버변수명으로 저장
	 * 
	 */


	public void setYear(int year) {//이름정할땐 카멜표기법을 따른다. 안그럴 시 오류날 수도 있음
		//유효값 검증
		if(year>2022||year<1900) {
			System.out.println("년도는 1900~2022까지 입니다");
		}else {
			System.out.println("저장완료");
			this.year = year;
		}
	}
	/*
	 * get메서드
	 * 1.값을 조회하는 메서드
	 * 2.public으로 선언하고 get+멤버변수명으로 저장
	 */
	public int getYear() {
		return year;
	}

	/*
	 * month, day, ssn에 대한 getter, setter 생성
	 * month - 1~12월까지만 저장가능
	 * day - 1~31일 까지만 저장가능
	 * ssn - 하이픈을 제거하고 13자리까지만 저장
	 */

	public void setMonth(int month) {
		if(month>12||month<1) {
			System.out.println("월은 1~12까지 입니다");
		}else {
			System.out.println("저장완료");
			this.month=month;
			
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if(day>31||day<1) {
			System.out.println("일은 1~31까지 입니다");
		}else {
			System.out.println("저장완료");
			this.day=day;
		}
	}

	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		ssn=ssn.replace("-", "");
		if(ssn.length()!=13) {
			System.out.println("주민번호는 13자리입니다");
		}else {
			System.out.println("저장완료");
			this.ssn=ssn;
		}
	}
	
	public String getSsn() {
		return ssn;
	}

	public void info() {
		System.out.println(year + "년 "+month+"월 "+day+"일");
		System.out.println("주민번호: "+ssn);
	}
}
