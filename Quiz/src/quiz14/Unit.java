package quiz14;

public abstract class Unit {//부모클래스
	public int x;
	public int y;
	public int hp;
	

	public Unit(int hp){
		this.hp=hp;
	}
	
	
	public abstract void location();
	public abstract void move(int x, int y);
	public void stop() {System.out.println("현재 위치에 정지");};
}
