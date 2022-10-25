package quiz14;

public class Tank extends Unit{
	
	private boolean mode;
	
	public Tank(){
		super(100);
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
	
	
	public void changeMod() {
		if(mode) {
			mode=false;
		} else {
			mode=true;
		}
		System.out.println("공격모드 변경");
	}

}
