package day07.encap.obj;

public class Hotel {//사용자 클래스
	
	//public String str=new String("dd");-이는 public String str="dd";와 같다. 평소에 편하게 쓰는 것
	private Chef chef;//=new Chef();-클래스를 멤버변수로 선언
	
	//기본생성자
	public Hotel() {
	}
	
	//생성자-클래스를 받는 생성자
	public Hotel(Chef chef) {
		this.chef=chef;
	}
	
	//getter, setter
	public void setChef(Chef chef) {
		this.chef=chef;
	}
	
	public Chef getChef() {
		return chef;
	}
	
	
}
