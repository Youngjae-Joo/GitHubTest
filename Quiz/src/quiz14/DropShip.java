package quiz14;

public class DropShip extends Unit{
	
	public DropShip(){
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
