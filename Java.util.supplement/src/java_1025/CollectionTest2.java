package java_1025;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest2 {
	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList 생성
		ArrayList<String> al = new ArrayList<>();
		
		
		//샘플 데이터 추가
		al.add("One");
		al.add("Three");
		//1970년 1월 1일 자정부터 지나온 시간을 밀리초 단위의 정수로 가져오기
		Long start =System.currentTimeMillis();
		//두번째에 데이터를 100000개 추가
		for(int i=00;i<100000;i++) {
			al.add(1,"Two");//두번째 칸에다가 넣음. 반복문이 돌아가면서 넣을 때마다 밀림. {One, Two, Two, Two, Two ......Three}의 형식인 것.
		}
		
		Long end =System.currentTimeMillis();
		System.out.println(end-start);
		//출력하고싶으면 System.out.println(al); al.toString을 안해도 됨. 알아서 나옴.
		
		
		LinkedList<String> li = new LinkedList<>();
		
		//샘플 데이터 추가
		li.add("One");
		li.add("Three");
		
		Long start2 =System.currentTimeMillis();
		
		for(int i=00;i<100000;i++) {
			li.add(1,"Two");
		}
		
		Long end2 =System.currentTimeMillis();
		System.out.println(end2-start2);
		
		
		
		
	}

}
