package day07.encap.good;

public class MainClass {
	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		me.setYear(2022);//set
		int year=me.getYear();//get
		System.out.println("년도:"+year);
		
		me.setMonth(10);
		int month = me.getMonth();
		
		me.setDay(11);
		int day = me.getDay();
		
		me.setSsn("578130-1057809");
		String ssn = me.getSsn();
		
		me.info();
		
		
		
		
		
	}

}
