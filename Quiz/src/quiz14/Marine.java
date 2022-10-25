package quiz14;

public class Marine extends Unit{
	
	public static int attack = 6;
	public static int armor = 0;
	
	
	public Marine(){
		super(60);
	}
	
	
	@Override
	public void location() {
		System.out.println("현재 x좌표:" +x+", 현재 y좌표:"+y);
	}
	@Override
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	
	
	
	

}
