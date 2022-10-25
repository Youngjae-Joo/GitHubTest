package day09.inter.basic2;

public class Basic implements BasicInter{
	

	@Override
	public void insert(int a) {
		System.out.println("insert.."+a);
	}

	@Override
	public void info() {
		System.out.println("info...");
	}

	@Override
	public String getInfo() {
		System.out.println("getInfo...");
		return "getInfo";
	}

	@Override
	public int delete(int a) {
		System.out.println("delete...");
		return 0;
	}
	
}
