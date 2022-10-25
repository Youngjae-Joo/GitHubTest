package day05;

public class PenMain {
	public static void main(String[] args) {
		//펜의 기능을 사용할 때는 객체로 생성하고, 참조연산자 .을 사용합니다.
		Pen pen = new Pen();
		
		pen.color="검정";
		pen.price=1000;
		pen.company="모나미";
		pen.write();
		pen.info();
		System.out.println();
		Pen red = new Pen(); //new를 사용할 때마다 새로운 객체가 만들어지는 것.
		red.color="빨강";
		red.price=2000;
		red.company="모나미";
		red.write();
		red.info();
		
		Calculator cal = new Calculator();
		cal.add(1000);
		System.out.println(cal.add(2000));
		
	}

}
