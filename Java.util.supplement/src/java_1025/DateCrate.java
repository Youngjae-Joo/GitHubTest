package java_1025;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class DateCrate {
	public static void main(String[] args) {
		//현재 시간을 갖는 java.util.Date 인스턴스 생성 
		Date currentTime= new Date();//util과 sql이 있는데, sql Date는 매개변수가 없는 생성자가 없다. import할때 신경쓸 것

		//출력 -년원일 시분초
		System.out.println(currentTime);

		//원하는 날짜를 가지고 생성-1986년 5월 5일 13:00:00로 설정
		Date firstMeetingTime= new Date(86, 4, 5, 13, 0, 0);//년도는 1900년부터니까 19를 뺴고, 월은 0부터 시작함. 그래서 4를 넣어야 may가 나온다
		//원하는 날짜를 가지고 출력
		System.out.println(firstMeetingTime);
		//년도만 추출해서 출력
		System.out.println(firstMeetingTime.getYear()+1900);//-이 있는 이유는 deprecated 때문.


		//원하는 포맷으로 출력 
		//1986년 5월 5일 ?요일 이라고 출력
		SimpleDateFormat ktime = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(ktime.format(firstMeetingTime));

		//연습해볼만한 과제 -년월일을 비교해서 년월일이 같으면 시간과 분을, 그렇지 않으면 년원일을 출력
		Date[] days= {new Date(121,4,8,15,0,0), new Date(122,9,25,7,30,0)};
		JOptionPane a = new JOptionPane();
		
		SimpleDateFormat sametime = new SimpleDateFormat("yyyy년 M월 d일");
		SimpleDateFormat whattime = new SimpleDateFormat("HH시 mm분 ss초");

		for(Date d : days) {
			if(sametime.format(new Date()).equals(sametime.format(d))) {
				JOptionPane.showMessageDialog(a, whattime.format(d));
			}else {
				JOptionPane.showMessageDialog(a, sametime.format(d));
			}
		}


	}
}
