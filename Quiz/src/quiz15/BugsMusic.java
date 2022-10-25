package quiz15;

public class BugsMusic implements SongList {
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */

	private String[] list = new String[100];
	private int count = 0;


	@Override
	public void insertList(String song) {
		list[count]=song;
		count++;
	}


	@Override
	public void playList() {
		int a = (int)(Math.random()*count);
		System.out.println(list[a]);
	}



	@Override
	public int playLength() {
		return count;
	}






}
