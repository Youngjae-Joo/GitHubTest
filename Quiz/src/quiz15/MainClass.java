package quiz15;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//바깥에 객체생성
		SongList m= new MelonMusic();
		
		while(true){
			System.out.println("메뉴[1.추가, 2.재생, 3.개수, 4.종료]");
			System.out.print(">");
			int num=scan.nextInt();
			
			if(num==1) {
				System.out.print("노래>");
				m.insertList(scan.next());
			} else if(num==2) {
				m.playList();
			} else if(num==3) {
				System.out.println("재생곡개수:"+m.playLength());
			} else if(num==4) {
				System.out.println("종료");
				return;
			}
		}
		
//		SongList s = new MelonMusic();
//		s.insertList("가시");
//		s.insertList("미인");
//		s.insertList("같은 베개");
//		s.insertList("벚꽃엔딩");
//		s.playList();
//		System.out.println(s.playLength());
	}

}
